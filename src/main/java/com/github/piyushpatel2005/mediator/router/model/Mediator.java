package com.github.piyushpatel2005.mediator.router.model;

public interface Mediator {
    void register(Device device);
    void send(Device sender, String message);
}
