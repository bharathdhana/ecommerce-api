package com.bharath.ecommerceapi.service.inf;

import com.bharath.ecommerceapi.model.dto.request.CartItemRequest;

public interface ICartService {
    void addToCart(CartItemRequest request);
    void updateCart(CartItemRequest request);
    void getCart();
    void removeFromCart(Long id);
}
