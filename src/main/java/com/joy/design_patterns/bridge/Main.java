package com.joy.design_patterns.bridge;

import com.joy.design_patterns.bridge.abstraction.Advance;
import com.joy.design_patterns.bridge.abstraction.Basic;
import com.joy.design_patterns.bridge.abstraction.RemoteControl;
import com.joy.design_patterns.bridge.implementor.Device;
import com.joy.design_patterns.bridge.implementor.Radio;
import com.joy.design_patterns.bridge.implementor.TV;

public class Main {
    public static void main(String[] args) {
        Device tv = new TV();
        RemoteControl remoteControl1=new Basic(tv);
        remoteControl1.togglePower();


        System.out.println("---");

        Device radio = new Radio();
        RemoteControl remote2 = new Advance(radio);
        remote2.togglePower();
    }
}
