package com.joy.design_patterns.command.service.impl;

import com.joy.design_patterns.command.appliances.Light;
import com.joy.design_patterns.command.service.Command;

public class LightCommand implements Command {
    private Light light;

    public LightCommand(Light l) {
        this.light = l;
    }

    public void execute() {
        light.on();
    }

    public void undo() {
        light.off();
    }
}
