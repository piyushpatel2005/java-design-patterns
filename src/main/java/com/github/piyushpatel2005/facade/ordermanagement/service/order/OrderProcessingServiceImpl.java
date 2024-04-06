package com.github.piyushpatel2005.facade.ordermanagement.service.order;

public class OrderProcessingServiceImpl implements OrderProcessingService{
    @Override
    public void createOrder(String product, int quantity, String customerInfo) {
        // Business logic to create an order
        // Add entry into backend database (systems)
        System.out.println("Order created for product - " + product + " with quantity - " + quantity + " and customer info - " + customerInfo);
    }
}
