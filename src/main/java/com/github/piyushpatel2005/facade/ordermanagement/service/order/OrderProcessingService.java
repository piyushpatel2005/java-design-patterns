package com.github.piyushpatel2005.facade.ordermanagement.service.order;

public interface OrderProcessingService {
    void createOrder(String product, int quantity, String customerInfo);
}
