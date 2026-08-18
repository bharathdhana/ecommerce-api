package com.bharath.ecommerceapi.service.inf;

import com.bharath.ecommerceapi.model.dto.request.LoginRequest;
import com.bharath.ecommerceapi.model.dto.request.RegisterRequest;

public interface IAuthService {
    void register(RegisterRequest request);
    void login(LoginRequest request);
}
