package com.bharath.ecommerceapi.service.impl;

import com.bharath.ecommerceapi.exception.BadRequestException;
import com.bharath.ecommerceapi.model.Cart;
import com.bharath.ecommerceapi.model.User;
import com.bharath.ecommerceapi.model.Wishlist;
import com.bharath.ecommerceapi.model.dto.request.LoginRequest;
import com.bharath.ecommerceapi.model.dto.request.RegisterRequest;
import com.bharath.ecommerceapi.model.dto.response.AuthResponse;
import com.bharath.ecommerceapi.repo.CartRepository;
import com.bharath.ecommerceapi.repo.UserRepository;
import com.bharath.ecommerceapi.repo.WishlistRepository;
import com.bharath.ecommerceapi.service.inf.IAuthService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements IAuthService {

    private final UserRepository userRepository;
    private final CartRepository cartRepository;
    private final WishlistRepository wishlistRepository;

    @Override
    @Transactional
    public String register(RegisterRequest request) {
        if (userRepository.existsByEmail(request.getEmail()))
            throw new BadRequestException("Email already Exists!");
        User user = User.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .password(request.getPassword())
                .role(request.getRole())
                .build();

        User savedUser = userRepository.save(user);

        Cart cart = Cart.builder()
                .user(savedUser)
                .build();
        cartRepository.save(cart);

        Wishlist wishlist = Wishlist.builder()
                .user(savedUser)
                .build();
        wishlistRepository.save(wishlist);
        return "User Created Successfully!";
    }

    @Override
    public AuthResponse login(LoginRequest request) {
        User user = userRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new BadRequestException("Invalid Email Or Password"));

        if(!user.getPassword().equals(request.getPassword())) {
            throw new BadRequestException("Invalid Email Or Password!");
        }

        return AuthResponse.builder()
                .token("123")
                .build();

    }
}
