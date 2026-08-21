package com.bharath.ecommerceapi.model.dto.request;

import com.bharath.ecommerceapi.model.enums.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    @NotBlank(message = "firstname is mandatory")
    @Size(min = 2, max = 40, message = "firstname should be minimum 2 to 40 characters")
    private String firstName;

    @NotBlank(message = "lastname is mandatory")
    @Size(min = 2, max = 40, message = "lastname should be minimum 2 to 40 characters")
    private String lastName;

    @Email(message = "valid email is required!")
    @NotBlank(message = "mandatory")
    private String email;

    @NotBlank(message = "password is mandatory")
    @Size(min = 6, message = "password should be at least 6 characters")
    private String password;

    @NotNull(message = "role is mandatory")
    private Role role;
}
