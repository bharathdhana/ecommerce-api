package com.bharath.ecommerceapi.service.inf;

import org.springframework.security.core.userdetails.UserDetails;

import javax.crypto.SecretKey;

public interface IJwtService {
    String generateToken(String email);
    SecretKey getKey();
    boolean validateToken(String token, UserDetails userDetails);
    String extractUserEmail(String token);
}
