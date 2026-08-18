package com.bharath.ecommerceapi.service.inf;

import com.bharath.ecommerceapi.model.dto.response.UserResponse;

import java.util.List;

public interface IUserService {
    List<UserResponse> getUsers();
    UserResponse getUserById();
}

