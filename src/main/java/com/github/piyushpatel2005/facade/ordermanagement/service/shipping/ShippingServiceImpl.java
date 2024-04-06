package com.github.piyushpatel2005.facade.ordermanagement.service.shipping;

public class ShippingServiceImpl implements ShippingService {
    @Override
    public void shipOrder(String productId, String shippingAddress) {
        System.out.println("Shipping product " + productId + " to address: " + shippingAddress);
    }
}
