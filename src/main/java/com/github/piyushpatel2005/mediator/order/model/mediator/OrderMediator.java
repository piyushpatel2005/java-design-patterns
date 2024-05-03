package com.github.piyushpatel2005.mediator.order.model.mediator;

import com.github.piyushpatel2005.mediator.order.model.Order;
import com.github.piyushpatel2005.mediator.order.model.OrderType;

public interface OrderMediator {
    void registerOrder(OrderType orderType, Order order);
    void executeOrder(OrderType orderType);
}
