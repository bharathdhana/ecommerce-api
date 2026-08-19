package com.bharath.ecommerceapi.service.impl;

import com.bharath.ecommerceapi.model.dto.request.CartItemRequest;
import com.bharath.ecommerceapi.model.dto.response.CartResponse;
import com.bharath.ecommerceapi.service.inf.ICartService;

import java.util.List;

public class CartServiceImpl implements ICartService {

    @Override
    public String addToCart(CartItemRequest request) {
        return "";
    }

    @Override
    public CartResponse updateCart(CartItemRequest request) {
        return null;
    }

    @Override
    public List<CartResponse> getCart() {
        return List.of();
    }

    @Override
    public CartResponse removeFromCart(Long id) {
        return null;
    }
}
