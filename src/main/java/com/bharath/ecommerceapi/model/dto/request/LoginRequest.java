package com.bharath.ecommerceapi.model.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequest {
    @Email(message = "valid email is required!")
    @NotBlank(message = "mandatory")
    private String email;

    @NotBlank(message = "mandatory")
    private String password;
}
