package com.github.piyushpatel2005.facade.ordermanagement.service.notification;

public class NotificationServiceImpl implements NotificationService{
    @Override
    public void sendOrderConfirmation(String orderNumber) {
        // Inform shipping department or shipping provider to ship the product
        System.out.println("Your order has been placed for order number: " + orderNumber);
    }

    @Override
    public void sendOrderShipped(String orderNumber) {
        System.out.println("Order shipped for order number " + orderNumber);
    }

    @Override
    public void sendOrderDelivered(String orderNumber) {
        System.out.println("Order delivered for order number " + orderNumber);
    }

    @Override
    public void sendOrderCancelation(String orderNumber) {
        System.out.println("Order cancellation sent for order number " + orderNumber);
    }
}
