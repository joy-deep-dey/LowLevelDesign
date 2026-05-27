package com.joy.design_patterns.command;

import com.joy.design_patterns.command.appliances.Fan;
import com.joy.design_patterns.command.appliances.Light;
import com.joy.design_patterns.command.controller.Remote;
import com.joy.design_patterns.command.service.impl.FanCommand;
import com.joy.design_patterns.command.service.impl.LightCommand;

public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        Fan ceilingFan = new Fan();

        Remote remote = new Remote();

        remote.setCommand(0, new LightCommand(livingRoomLight));
        remote.setCommand(1, new FanCommand(ceilingFan));

        // Simulate button presses (toggle behavior)
        System.out.println("--- Toggling Light Button 0 ---");
        remote.pressButton(0);  // ON
        remote.pressButton(0);  // OFF

        System.out.println("--- Toggling Fan Button 1 ---");
        remote.pressButton(1);  // ON
        remote.pressButton(1);  // OFF

        // Press unassigned button to show default message
        System.out.println("--- Pressing Unassigned Button 2 ---");
        remote.pressButton(2);
    }
}
