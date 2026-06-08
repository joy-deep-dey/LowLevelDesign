package com.joy.design_patterns.cor.service;

import com.joy.design_patterns.cor.LogLevel;

public class DebugLogger extends Logger{

    public DebugLogger(){
        this.level= LogLevel.DEBUG;
    }

    @Override
    protected void write(String message) {
        System.out.println("[DEBUG] " + message);
    }
}
