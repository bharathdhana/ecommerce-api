package com.bharath.ecommerceapi.service.inf;

import com.bharath.ecommerceapi.model.dto.request.CartItemRequest;
import com.bharath.ecommerceapi.model.dto.response.CartResponse;

public interface ICartService {
    String addToCart(CartItemRequest request);
    CartResponse updateCart(CartItemRequest request);
    CartResponse getCart();
    CartResponse removeFromCart(Long id);
}
