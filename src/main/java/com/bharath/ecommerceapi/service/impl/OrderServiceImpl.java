package com.bharath.ecommerceapi.service.impl;

import com.bharath.ecommerceapi.model.dto.request.OrderRequest;
import com.bharath.ecommerceapi.model.dto.request.OrderStatusUpdateRequest;
import com.bharath.ecommerceapi.model.dto.response.OrderResponse;
import com.bharath.ecommerceapi.service.inf.IOrderService;

import java.util.List;

public class OrderServiceImpl implements IOrderService {
    @Override
    public OrderResponse createOrder(OrderRequest request) {
        return null;
    }

    @Override
    public List<OrderResponse> getMyOrders() {
        return List.of();
    }

    @Override
    public OrderResponse getOrderById(Long id) {
        return null;
    }

    @Override
    public OrderResponse updateOrderStatus(OrderStatusUpdateRequest request) {
        return null;
    }
}
