package com.bharath.ecommerceapi.model.dto.response;

import com.bharath.ecommerceapi.model.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderResponse {
    private Long id;
    private LocalDateTime orderDate;
    private Double totalAmount;
    private Status status;
    private String shippingAddress;
    private Long userId;
    private List<OrderItemResponse> items;
}
