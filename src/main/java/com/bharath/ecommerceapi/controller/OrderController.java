package com.bharath.ecommerceapi.controller;

import com.bharath.ecommerceapi.model.dto.request.OrderRequest;
import com.bharath.ecommerceapi.model.dto.request.OrderStatusUpdateRequest;
import com.bharath.ecommerceapi.model.dto.response.OrderResponse;
import com.bharath.ecommerceapi.service.inf.IOrderService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class OrderController {
    public final IOrderService orderService;

    @PostMapping("order")
    public ResponseEntity<OrderResponse> createOrder(@Valid @RequestBody OrderRequest request){
        OrderResponse response = orderService.createOrder(request);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("orders")
    public ResponseEntity<List<OrderResponse>> getMyOrders() {
        List<OrderResponse> orders = orderService.getMyOrders();
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    @GetMapping("order/{id}")
    public ResponseEntity<OrderResponse> getOrderById(@PathVariable Long id) {
        OrderResponse response = orderService.getOrderById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PutMapping("order")
    public ResponseEntity<OrderResponse> updateOrderStatus(@Valid @RequestBody OrderStatusUpdateRequest request){
        OrderResponse response = orderService.updateOrderStatus(request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
