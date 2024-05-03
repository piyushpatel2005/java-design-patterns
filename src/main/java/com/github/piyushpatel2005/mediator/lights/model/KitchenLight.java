package com.github.piyushpatel2005.mediator.lights.model;

public class KitchenLight implements Light {
    private boolean on;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("Kitchen light is on");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("Kitchen light is off");
    }

    public boolean isOn() {
        return on;
    }
}
