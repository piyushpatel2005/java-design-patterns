package com.github.piyushpatel2005.template.orders;

import com.github.piyushpatel2005.template.orders.model.InStoreOrder;
import com.github.piyushpatel2005.template.orders.model.PhoneOrder;
import com.github.piyushpatel2005.template.orders.model.OnlineOrder;

public class Main {
    public static void main(String[] args) {
        System.out.println("Web Order Example");
        OnlineOrder webOrder = new OnlineOrder();
        webOrder.processOrder();
        System.out.println("--------------------");

        System.out.println("In Store Order Example");
        InStoreOrder inStoreOrder = new InStoreOrder();
        inStoreOrder.processOrder();
        System.out.println("--------------------");

        System.out.println("Phone Order Example");
        PhoneOrder phoneOrder = new PhoneOrder();
        phoneOrder.processOrder();
    }
}
