package com.github.piyushpatel2005.mediator.router.model;

import java.util.ArrayList;
import java.util.List;

public class HubRouter implements Mediator {
    private List<Device> devices;

    public HubRouter() {
        this.devices = new ArrayList<>();
    }

    @Override
    public void register(Device device) {
        devices.add(device);
    }

    @Override
    public void send(Device sender, String message) {
        for (Device device: devices) {
            if (device != sender) {
                device.receive(message);
            }
        }
    }
}
