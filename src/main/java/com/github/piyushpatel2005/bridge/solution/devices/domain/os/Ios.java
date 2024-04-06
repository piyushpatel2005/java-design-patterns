package com.github.piyushpatel2005.bridge.solution.devices.domain.os;

public class Ios implements OperatingSystem {
    @Override
    public void shutdown() {
        System.out.println("Shutting down iOS");
    }

    @Override
    public void reboot() {
        System.out.println("Rebooting iOS");
    }

    @Override
    public void installOS() {
        System.out.println("Installing iOS");
    }

    @Override
    public void displayInfo() {
        System.out.println("iOS");
    }

    @Override
    public String toString() {
        return "iOS Operating System";
    }
}
