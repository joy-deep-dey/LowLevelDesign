package com.joy.design_patterns.bridge.abstraction;

import com.joy.design_patterns.bridge.implementor.Device;

public class Basic extends RemoteControl{

    public Basic(Device device){
        super(device);
    }

    @Override
    public void togglePower() {
        System.out.println("Using Basic Remote");
        device.turnOn();
    }
}
