package com.joy.design_patterns.bridge.implementor;

public class TV implements Device{
    @Override
    public void turnOn() {
        System.out.println("TV turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV turned OFF");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("TV volume set to " + volume);
    }
}
