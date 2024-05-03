package com.github.piyushpatel2005.mediator.lights.model.command;

import com.github.piyushpatel2005.mediator.lights.model.Light;

public class OnCommand implements Command {
    private final Light light;

    public OnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
