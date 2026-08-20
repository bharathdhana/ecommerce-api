package com.bharath.ecommerceapi.service.inf;

import com.bharath.ecommerceapi.model.dto.request.WishlistItemRequest;
import com.bharath.ecommerceapi.model.dto.response.WishlistResponse;

public interface IWishlistService {
    String addToWishlist(WishlistItemRequest request);
    WishlistResponse getWishlist();
    WishlistResponse removeFromWishlist(Long id);
}
