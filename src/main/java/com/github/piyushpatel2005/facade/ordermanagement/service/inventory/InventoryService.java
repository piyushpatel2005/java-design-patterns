package com.github.piyushpatel2005.facade.ordermanagement.service.inventory;

public interface InventoryService {
    void update(String productId, int quantity);
    boolean isAvailable(String productId, int quantity);
}
