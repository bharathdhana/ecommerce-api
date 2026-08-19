package com.bharath.ecommerceapi.service.impl;

import com.bharath.ecommerceapi.exception.ResourceNotFoundException;
import com.bharath.ecommerceapi.model.User;
import com.bharath.ecommerceapi.model.dto.response.UserResponse;
import com.bharath.ecommerceapi.repo.UserRepository;
import com.bharath.ecommerceapi.service.inf.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService {

    private final UserRepository userRepository;

    @Override
    public List<UserResponse> getUsers() {
        return userRepository.findAll().stream().map(
                this::mapToUserResponse).collect(Collectors.toList());
    }

    @Override
    public UserResponse getUserById(Long id) {
        return mapToUserResponse(userRepository.findById(id).
                orElseThrow(() -> new ResourceNotFoundException("User Not Found for the Given ID: " + id)));
    }

    @Override
    public User getCurrentUserById(Long id) {
        return userRepository.findById(id).
                orElseThrow(() -> new ResourceNotFoundException("User Not Found for the Given ID: " + id));
    }

    private UserResponse mapToUserResponse(User user) {
        return UserResponse.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .role(user.getRole())
                .build();
    }
}
