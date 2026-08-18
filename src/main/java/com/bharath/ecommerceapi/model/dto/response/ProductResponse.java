package com.bharath.ecommerceapi.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponse {
    private Long id;
    private String title;
    private String brand;
    private String model;
    private String description;
    private Double price;
    private int stockQuantity;
    private String category;
    private String imageUrl;
    private Long sellerId;
    private String sellerName;
}
