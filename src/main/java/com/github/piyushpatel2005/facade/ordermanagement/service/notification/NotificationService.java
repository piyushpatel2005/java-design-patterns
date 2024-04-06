package com.github.piyushpatel2005.facade.ordermanagement.service.notification;

public interface NotificationService {
    void sendOrderConfirmation(String orderNumber);
    void sendOrderShipped(String orderNumber);
    void sendOrderDelivered(String orderNumber);
    void sendOrderCancelation(String orderNumber);
}
