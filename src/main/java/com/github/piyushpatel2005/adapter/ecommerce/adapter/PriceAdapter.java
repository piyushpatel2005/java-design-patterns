package com.github.piyushpatel2005.adapter.ecommerce.adapter;

import com.github.piyushpatel2005.adapter.ecommerce.domain.BillingService;
import com.github.piyushpatel2005.adapter.ecommerce.legacy.OrderPrice;

public class PriceAdapter extends OrderPrice implements BillingService {
    public PriceAdapter(double priceInDollars) {
        super(priceInDollars);
    }

    @Override
    public void chargeOrder(int userId, int priceInCents) {
        int cents = (int) getPriceInDollars() * 100;
        System.out.println("Charging user " + userId + " with amount " + cents + " cents");
    }
}
