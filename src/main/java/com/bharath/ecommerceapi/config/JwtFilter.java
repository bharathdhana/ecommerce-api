package com.bharath.ecommerceapi.config;

import com.bharath.ecommerceapi.exception.JwtValidationException;
import com.bharath.ecommerceapi.model.dto.response.ErrorResponse;
import com.bharath.ecommerceapi.service.impl.CustomUserDetailsService;
import com.bharath.ecommerceapi.service.inf.IJwtService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import tools.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
public class JwtFilter extends OncePerRequestFilter {
    private final IJwtService jwtService;
    private final ApplicationContext context;

    @Override
    protected boolean shouldNotFilter(HttpServletRequest request) throws ServletException {
        String path = request.getRequestURI();
        return path.equals("/login") || path.equals("/register");
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        final String authHeader = request.getHeader("Authorization");
        String authToken = null;
        String email = null;
        try {
            if (authHeader != null && authHeader.startsWith("Bearer ")) {
                authToken = authHeader.substring(7);
                email = jwtService.extractUserEmail(authToken);
            } else {
                handleJwtValidationException(response, new JwtValidationException("Authorization header required with Bearer token"));
                return;
            }

            if (email != null && SecurityContextHolder.getContext().getAuthentication() == null) {
                UserDetails userDetails = context.getBean(CustomUserDetailsService.class)
                        .loadUserByUsername(email);
                if (jwtService.validateToken(authToken, userDetails)) {
                    UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
                    auth.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                    SecurityContextHolder.getContext().setAuthentication(auth);
                }
            }
            filterChain.doFilter(request, response);
        } catch (Exception e) {
            handleJwtValidationException(response, new JwtValidationException("Jwt Validation Failed"));

        }
    }

    private void handleJwtValidationException(HttpServletResponse response, JwtValidationException e) throws ServletException, IOException {
        final ObjectMapper objectMapper = new ObjectMapper();
        response.setStatus(HttpStatus.UNAUTHORIZED.value());
        response.setContentType("application/json");

        ErrorResponse errorResponse = ErrorResponse.builder()
                .time(LocalDateTime.now().toString())
                .statusCode(HttpStatus.UNAUTHORIZED.value())
                .error("Jwt Validation Failed")
                .message(e.getMessage())
                .build();
        response.getWriter().write(objectMapper.writeValueAsString(errorResponse));
    }
}
