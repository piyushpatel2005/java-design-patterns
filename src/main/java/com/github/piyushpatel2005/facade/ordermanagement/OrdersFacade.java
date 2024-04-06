package com.github.piyushpatel2005.facade.ordermanagement;

import com.github.piyushpatel2005.facade.ordermanagement.service.inventory.InventoryService;
import com.github.piyushpatel2005.facade.ordermanagement.service.inventory.InventoryServiceImpl;
import com.github.piyushpatel2005.facade.ordermanagement.service.notification.NotificationService;
import com.github.piyushpatel2005.facade.ordermanagement.service.notification.NotificationServiceImpl;
import com.github.piyushpatel2005.facade.ordermanagement.service.order.OrderProcessingService;
import com.github.piyushpatel2005.facade.ordermanagement.service.order.OrderProcessingServiceImpl;
import com.github.piyushpatel2005.facade.ordermanagement.service.payment.PaymentService;
import com.github.piyushpatel2005.facade.ordermanagement.service.payment.PaymentServiceImpl;
import com.github.piyushpatel2005.facade.ordermanagement.service.shipping.ShippingService;
import com.github.piyushpatel2005.facade.ordermanagement.service.shipping.ShippingServiceImpl;

public class OrdersFacade {
    private OrderProcessingService orderProcessingService;
    private NotificationService notificationService;
    private PaymentService paymentService;
    private ShippingService shippingService;
    private InventoryService inventoryService;

    public OrdersFacade() {
        this.orderProcessingService = new OrderProcessingServiceImpl();
        this.notificationService = new NotificationServiceImpl();
        this.paymentService = new PaymentServiceImpl();
        this.shippingService = new ShippingServiceImpl();
        this.inventoryService = new InventoryServiceImpl();
    }

    public void placeOrder(String productId, int quantity, String customerInfo, String shippingAddress, String creditCardDetails) {
        String orderId = "1234";
        if (!inventoryService.isAvailable(productId, quantity)) {
            notificationService.sendOrderCancelation(orderId);
            return;
        }
        orderProcessingService.createOrder(productId, quantity, customerInfo);
        if (paymentService.processPayment(100.0, creditCardDetails)) {
            notificationService.sendOrderConfirmation("1234");
            shippingService.shipOrder(productId, shippingAddress);
        } else {
            notificationService.sendOrderCancelation("1234");
        }
    }
}
