package com.github.piyushpatel2005.mediator.lights.model.mediator;

import com.github.piyushpatel2005.mediator.lights.model.Light;
import com.github.piyushpatel2005.mediator.lights.model.command.Command;

import java.util.HashMap;
import java.util.Map;

public class LightController implements MediatorController {
    Map<String, Light> lights;

    public LightController() {
        this.lights = new HashMap<>();
    }

    @Override
    public void registerLight(String name, Light light) {
        lights.put(name, light);
    }

    @Override
    public void sendCommand(String name, Command command) {
        Light light = lights.get(name);
        if (light != null) {
            command.execute();
        } else {
            throw new IllegalArgumentException("Light not found");
        }
    }
}
