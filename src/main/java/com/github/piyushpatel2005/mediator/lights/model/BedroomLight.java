package com.github.piyushpatel2005.mediator.lights.model;

public class BedroomLight implements Light {
    private boolean on;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("Bedroom light is on");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("Bedroom light is off");
    }

    public boolean isOn() {
        return on;
    }
}
