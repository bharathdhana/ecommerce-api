package com.bharath.ecommerceapi.service.impl;

import com.bharath.ecommerceapi.model.dto.request.WishlistItemRequest;
import com.bharath.ecommerceapi.model.dto.response.WishlistResponse;
import com.bharath.ecommerceapi.service.inf.IWishlistService;

import java.util.List;

public class WishlistServiceImpl implements IWishlistService {
    @Override
    public String addToWishlist(WishlistItemRequest request) {
        return "";
    }

    @Override
    public List<WishlistResponse> getWishlist() {
        return List.of();
    }

    @Override
    public WishlistResponse removeFromWishlist(Long id) {
        return null;
    }
}
