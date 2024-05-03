package com.github.piyushpatel2005.mediator.order.model.command;

public class BuyCommand {
    private final String stockName;
    private final int quantity;

    public BuyCommand(String stockName, int quantity) {
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
