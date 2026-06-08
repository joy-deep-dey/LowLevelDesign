package com.joy.design_patterns.bridge.abstraction;

import com.joy.design_patterns.bridge.implementor.Device;

public abstract class RemoteControl {

    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public abstract void togglePower();
}
