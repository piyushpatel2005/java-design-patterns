package com.github.piyushpatel2005.bridge.solution.devices.domain.device;

import com.github.piyushpatel2005.bridge.solution.devices.domain.os.OperatingSystem;

public class Laptop extends Device {
    public Laptop(OperatingSystem os) {
        super(os);
    }

    @Override
    public void displayDevice() {
        System.out.println("Laptop");
    }

    @Override
    public String toString() {
        return "Laptop " + super.toString();
    }
}
