package com.bharath.ecommerceapi.model.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderStatusUpdateRequest {
    @NotNull(message = "id is mandatory")
    private Long id;

    @NotNull(message = "Status is mandatory")
    private String status;
}
