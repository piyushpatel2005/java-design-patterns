package com.github.piyushpatel2005.mediator.lights.model.command;

import com.github.piyushpatel2005.mediator.lights.model.Light;

public class OffCommand implements Command {
    private final Light light;

    public OffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
