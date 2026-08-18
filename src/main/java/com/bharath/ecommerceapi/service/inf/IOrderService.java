package com.bharath.ecommerceapi.service.inf;

import com.bharath.ecommerceapi.model.dto.request.OrderRequest;
import com.bharath.ecommerceapi.model.dto.request.OrderStatusUpdateRequest;

public interface IOrderService {
    void createOrder(OrderRequest request);
    void getMyOrders();
    void getOrderById(Long id);
    void updateOrderStatus(OrderStatusUpdateRequest request);
}
