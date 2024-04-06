package com.github.piyushpatel2005.adapter.ecommerce.domain;

public interface BillingService {
    void chargeOrder(int userId, int priceInCents);
}
