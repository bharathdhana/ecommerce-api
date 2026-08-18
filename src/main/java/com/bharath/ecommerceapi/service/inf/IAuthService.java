package com.bharath.ecommerceapi.service.inf;

import com.bharath.ecommerceapi.model.dto.request.LoginRequest;
import com.bharath.ecommerceapi.model.dto.request.RegisterRequest;
import com.bharath.ecommerceapi.model.dto.response.AuthResponse;

public interface IAuthService {
    String register(RegisterRequest request);
    AuthResponse login(LoginRequest request);
}
