package com.github.piyushpatel2005.facade.ordermanagement;

public class Main {
    public static void main(String[] args) {
        OrdersFacade ordersFacade = new OrdersFacade();
        ordersFacade.placeOrder("B", 10, "John Doe", "1 Master St, San Jose, CA, United States", "1234-5678-4321-8765");
    }
}
