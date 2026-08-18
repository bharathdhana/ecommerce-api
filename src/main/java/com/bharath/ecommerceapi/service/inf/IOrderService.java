package com.bharath.ecommerceapi.service.inf;

import com.bharath.ecommerceapi.model.dto.request.OrderRequest;
import com.bharath.ecommerceapi.model.dto.request.OrderStatusUpdateRequest;
import com.bharath.ecommerceapi.model.dto.response.OrderResponse;

import java.util.List;

public interface IOrderService {
    OrderResponse createOrder(OrderRequest request);
    List<OrderResponse> getMyOrders();
    OrderResponse getOrderById(Long id);
    OrderResponse updateOrderStatus(OrderStatusUpdateRequest request);
}
