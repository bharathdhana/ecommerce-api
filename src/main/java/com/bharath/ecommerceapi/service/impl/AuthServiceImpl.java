package com.bharath.ecommerceapi.service.impl;

import com.bharath.ecommerceapi.model.dto.request.LoginRequest;
import com.bharath.ecommerceapi.model.dto.request.RegisterRequest;
import com.bharath.ecommerceapi.model.dto.response.AuthResponse;
import com.bharath.ecommerceapi.service.inf.IAuthService;

public class AuthServiceImpl implements IAuthService {
    @Override
    public String register(RegisterRequest request) {
        return "";
    }

    @Override
    public AuthResponse login(LoginRequest request) {
        return null;
    }
}
