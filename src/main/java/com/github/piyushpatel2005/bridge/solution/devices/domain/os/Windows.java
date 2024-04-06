package com.github.piyushpatel2005.bridge.solution.devices.domain.os;

public class Windows implements OperatingSystem {
    @Override
    public void shutdown() {
        System.out.println("Shutting down Windows");
    }

    @Override
    public void reboot() {
        System.out.println("Rebooting Windows");
    }

    @Override
    public void installOS() {
        System.out.println("Installing Windows");
    }

    @Override
    public void displayInfo() {
        System.out.println("Windows OS");
    }

    @Override
    public String toString() {
        return "Windows Operating System";
    }
}
