package com.joy.design_patterns.command.service.impl;

import com.joy.design_patterns.command.appliances.Fan;
import com.joy.design_patterns.command.service.Command;

public class FanCommand implements Command {
    private Fan fan;

    public FanCommand(Fan f) {
        this.fan = f;
    }

    public void execute() {
        fan.on();
    }

    public void undo() {
        fan.off();
    }
}
