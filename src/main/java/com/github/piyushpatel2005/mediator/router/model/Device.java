package com.github.piyushpatel2005.mediator.router.model;

public interface Device {
    String getName();
    void send(String message);
    void receive(String message);
}
