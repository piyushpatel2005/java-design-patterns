package com.github.piyushpatel2005.states.washingmachine;

import com.github.piyushpatel2005.states.washingmachine.model.CycleSelectedState;
import com.github.piyushpatel2005.states.washingmachine.model.OffState;
import com.github.piyushpatel2005.states.washingmachine.model.WashingMachineState;
import com.github.piyushpatel2005.states.washingmachine.model.WashingState;

public class WashingMachine {
    private WashingMachineState state;

    public WashingMachine() {
        state = new OffState();
    }

    public void start() {
        state.start(this);
    }

    public void chooseCycle() {
        state.chooseCycle(this);
    }

    public void pause() {
        state.pause(this);
    }

    public void stop() {
        state.stop(this);
    }

    public void openLid() {
        state.openDoor(this);
    }

    public String getStatus() {
        return state.getStatus();
    }

    public void setState(WashingMachineState state) {
        this.state = state;
    }

    public WashingMachineState getState() {
        return state;
    }

    public WashingMachineState getOffState() {
        return new OffState();
    }

    public WashingMachineState getCycleSelectedState() {
        return new CycleSelectedState();
    }

    public WashingMachineState getPauseState() {
        return new OffState();
    }

    public WashingMachineState getWashingState() {
        return new WashingState();
    }
}
