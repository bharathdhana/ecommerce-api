package com.bharath.ecommerceapi.service.inf;

import com.bharath.ecommerceapi.model.dto.request.WishlistItemRequest;

public interface IWishlistService {
    void addToWishlist(WishlistItemRequest request);
    void getWishlist();
    void removeFromWishlist(Long id);
}
