package com.github.piyushpatel2005.bridge.solution.devices.domain.device;

import com.github.piyushpatel2005.bridge.solution.devices.domain.os.OperatingSystem;

public abstract class Device {
    protected OperatingSystem os;

    public Device(OperatingSystem os) {
        this.os = os;
    }

    public void shutdown() {
        os.shutdown();
    }

    public void reboot() {
        os.reboot();
    }

    public void installOS() {
        os.installOS();
    }

    public void displayInfo() {
        os.displayInfo();
    }

    public abstract void displayDevice();

    public void setOs(OperatingSystem os) {
        this.os = os;
    }

    public OperatingSystem getOs() {
        return os;
    }

    @Override
    public String toString() {
        return "Device with " + os.toString();
    }
}
