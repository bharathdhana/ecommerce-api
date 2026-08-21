package com.bharath.ecommerceapi.model.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItemRequest {
    @NotNull(message = "quantity is mandatory")
    @Min(value = 1, message = "quantity should be at least 1!")
    private int quantity;

    @NotNull(message = "product Id is mandatory")
    private Long productId;
}
