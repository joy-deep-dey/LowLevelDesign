package com.joy.design_patterns.bridge.abstraction;

import com.joy.design_patterns.bridge.implementor.Device;

public class Advance extends RemoteControl{

    public Advance(Device device){
        super(device);
    }
    @Override
    public void togglePower() {
        System.out.println("Using Advanced Remote");
        device.turnOn();
        device.setVolume(50);
    }
}
