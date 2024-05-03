package com.github.piyushpatel2005.mediator.lights.model.mediator;

import com.github.piyushpatel2005.mediator.lights.model.Light;
import com.github.piyushpatel2005.mediator.lights.model.command.Command;

public interface MediatorController {
    void registerLight(String name, Light light);
    void sendCommand(String name, Command command);
}
