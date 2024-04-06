package com.github.piyushpatel2005.bridge.solution.devices.domain.os;

public class Linux implements OperatingSystem {
    @Override
    public void shutdown() {
        System.out.println("Shutting down Linux");
    }

    @Override
    public void reboot() {
        System.out.println("Rebooting Linux");
    }

    @Override
    public void installOS() {
        System.out.println("Installing Linux");
    }

    @Override
    public void displayInfo() {
        System.out.println("Linux OS");
    }

    @Override
    public String toString() {
        return "Linux Operating System";
    }
}
