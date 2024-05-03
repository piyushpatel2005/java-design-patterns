package com.github.piyushpatel2005.mediator.order.model.command;

public class SellCommand {
    private final String stockName;
    private final int quantity;

    public SellCommand(String stockName, int quantity) {
        this.stockName = stockName;
        this.quantity = quantity;
    }

    public String getStockName() {
        return stockName;
    }

    public int getQuantity() {
        return quantity;
    }
}
