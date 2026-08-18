package com.bharath.ecommerceapi.service.inf;

import com.bharath.ecommerceapi.model.dto.request.WishlistItemRequest;
import com.bharath.ecommerceapi.model.dto.response.WishlistResponse;

import java.util.List;

public interface IWishlistService {
    String addToWishlist(WishlistItemRequest request);
    List<WishlistResponse> getWishlist();
    WishlistResponse removeFromWishlist(Long id);
}
