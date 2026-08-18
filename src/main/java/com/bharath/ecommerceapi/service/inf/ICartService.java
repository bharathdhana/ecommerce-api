package com.bharath.ecommerceapi.service.inf;

import com.bharath.ecommerceapi.model.dto.request.CartItemRequest;
import com.bharath.ecommerceapi.model.dto.response.CartResponse;

import java.util.List;

public interface ICartService {
    String addToCart(CartItemRequest request);
    CartResponse updateCart(CartItemRequest request);
    List<CartResponse> getCart();
    CartResponse removeFromCart(Long id);
}
