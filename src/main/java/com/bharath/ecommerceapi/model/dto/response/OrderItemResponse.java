package com.bharath.ecommerceapi.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemResponse {
    private Long id;
    private int quantity;
    private double priceAtPurchase;
    private String productTitle;
    private String productBrand;
    private String productModel;
    private double subTotal;
}
