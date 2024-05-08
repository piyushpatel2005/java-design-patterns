package com.github.piyushpatel2005.states.washingmachine.model;

import com.github.piyushpatel2005.states.washingmachine.WashingMachine;

public interface WashingMachineState {
    void start(WashingMachine machine);
    void chooseCycle(WashingMachine machine);
    void pause(WashingMachine machine);
    void stop(WashingMachine machine);
    void openDoor(WashingMachine machine);
    String getStatus();
}
