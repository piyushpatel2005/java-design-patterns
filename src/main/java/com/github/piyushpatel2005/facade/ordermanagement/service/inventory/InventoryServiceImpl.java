package com.github.piyushpatel2005.facade.ordermanagement.service.inventory;

import java.util.HashMap;
import java.util.Map;

public class InventoryServiceImpl implements InventoryService{
    private Map<String, Integer> inventory;

    public InventoryServiceImpl() {
        this.inventory = new HashMap<>();
        populateInventory();
    }

    private void populateInventory() {
        inventory.put("A", 100);
        inventory.put("B", 10);
        inventory.put("C", 1000);
        inventory.put("D", 0);
    }

    @Override
    public void update(String productId, int quantity) {
        System.out.println("Updating inventory for product " + productId + " quantity " + quantity);
    }

    @Override
    public boolean isAvailable(String productId, int quantity) {
        int itemsAvailable = inventory.getOrDefault(productId, 0);
        return itemsAvailable >= quantity;
    }
}
