package com.bharath.ecommerceapi.controller;

import com.bharath.ecommerceapi.model.dto.request.CartItemRequest;
import com.bharath.ecommerceapi.model.dto.response.CartResponse;
import com.bharath.ecommerceapi.service.inf.ICartService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/cart")
public class CartController {
    private final ICartService cartService;

    @PostMapping("/items")
    public ResponseEntity<String> addToCart(@Valid @RequestBody CartItemRequest request) {
        String response = cartService.addToCart(request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PutMapping("/items")
    public ResponseEntity<CartResponse> updateCart(@Valid @RequestBody CartItemRequest request) {
        CartResponse cartResponse = cartService.updateCart(request);
        return new ResponseEntity<>(cartResponse, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<CartResponse> getCart() {
        CartResponse response = cartService.getCart();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/items/{cartItemId}")
    public ResponseEntity<CartResponse> removeFromCart(@PathVariable Long cartItemId) {
        CartResponse cartResponse = cartService.removeFromCart(cartItemId);
        return new ResponseEntity<>(cartResponse, HttpStatus.OK);
    }
}
