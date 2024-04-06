package com.github.piyushpatel2005.bridge.solution.devices;

import com.github.piyushpatel2005.bridge.solution.devices.domain.device.CellPhone;
import com.github.piyushpatel2005.bridge.solution.devices.domain.device.Device;
import com.github.piyushpatel2005.bridge.solution.devices.domain.device.Laptop;
import com.github.piyushpatel2005.bridge.solution.devices.domain.os.Linux;
import com.github.piyushpatel2005.bridge.solution.devices.domain.os.Windows;

public class DeviceClient {
    public static void main(String[] args) {
        Device cellPhone = new CellPhone(new Windows());
        cellPhone.installOS();
        cellPhone.reboot();
        cellPhone.displayDevice();
        cellPhone.shutdown();

        System.out.println("=====================================");

        Device laptop = new Laptop(new Linux());
        System.out.println(laptop);
    }
}
