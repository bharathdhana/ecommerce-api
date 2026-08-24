package com.bharath.ecommerceapi.controller;

import com.bharath.ecommerceapi.model.dto.request.WishlistItemRequest;
import com.bharath.ecommerceapi.model.dto.response.WishlistResponse;
import com.bharath.ecommerceapi.service.inf.IWishlistService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/wishlist")
public class WishlistController {

    private final IWishlistService wishlistService;

    @PostMapping("/item")
    public ResponseEntity<String> addToWishlist(@Valid @RequestBody WishlistItemRequest request) {
        String response = wishlistService.addToWishlist(request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<WishlistResponse> getWishlist() {
        WishlistResponse response = wishlistService.getWishlist();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/{itemId}")
    public ResponseEntity<WishlistResponse> removeFromWishlist(@PathVariable Long itemId){
        WishlistResponse response = wishlistService.removeFromWishlist(itemId);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
