package com.github.piyushpatel2005.adapter.ecommerce;

import com.github.piyushpatel2005.adapter.ecommerce.adapter.PriceAdapter;
import com.github.piyushpatel2005.adapter.ecommerce.domain.BillingService;
import com.github.piyushpatel2005.adapter.ecommerce.legacy.OrderPrice;

public class BillingController {
    private final BillingService billingService;

    public BillingController(BillingService billingService) {
        this.billingService = billingService;
    }

    public void chargeOrder(int userId, OrderPrice price) {
        PriceAdapter priceAdapter = new PriceAdapter(price.getPriceInDollars());
        billingService.chargeOrder(userId, (int) priceAdapter.getPriceInDollars() * 100);
    }
}
