package com.bharath.ecommerceapi.repo;

import com.bharath.ecommerceapi.model.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByEmail(String email);
    Optional<User> findByEmail(@Email(message = "valid email is required!") @NotBlank(message = "mandatory") String email);
}
