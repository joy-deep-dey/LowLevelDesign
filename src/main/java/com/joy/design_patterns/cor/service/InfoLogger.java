package com.joy.design_patterns.cor.service;

import com.joy.design_patterns.cor.LogLevel;

public class InfoLogger extends Logger{
    public InfoLogger() {
        this.level = LogLevel.INFO;
    }

    @Override
    protected void write(String message) {
        System.out.println("[INFO] " + message);
    }
}
