package com.github.piyushpatel2005.bridge.solution.devices.domain.device;

import com.github.piyushpatel2005.bridge.solution.devices.domain.os.OperatingSystem;

public class CellPhone extends Device {
    public CellPhone(OperatingSystem os) {
        super(os);
    }

    @Override
    public void displayDevice() {
        System.out.println("Cell Phone");
    }

    @Override
    public String toString() {
        return "Cell Phone " + super.toString();
    }
}
