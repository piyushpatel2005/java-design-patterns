package com.github.piyushpatel2005.bridge.solution.devices.domain.os;

public interface OperatingSystem {
    void shutdown();
    void reboot();
    void installOS();
    void displayInfo();
}
