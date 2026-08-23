package com.bharath.ecommerceapi.service.inf;

import org.springframework.security.core.userdetails.UserDetails;

import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;

public interface IJwtService {
    String generateToken(String email) throws NoSuchAlgorithmException;
    SecretKey getKey() throws NoSuchAlgorithmException;
    boolean validateToken(String token, UserDetails userDetails);
    String extractUserEmail(String token);
}
