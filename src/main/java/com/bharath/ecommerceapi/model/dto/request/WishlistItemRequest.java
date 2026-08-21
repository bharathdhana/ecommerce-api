package com.bharath.ecommerceapi.model.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WishlistItemRequest {

    @NotNull(message = "product Id is mandatory")
    private Long productId;
}
