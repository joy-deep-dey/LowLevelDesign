package com.joy.design_patterns.cor.service;

import com.joy.design_patterns.cor.LogLevel;

public class ErrorLogger extends Logger{
    public ErrorLogger() {
        this.level = LogLevel.ERROR;
    }

    @Override
    protected void write(String message) {
        System.out.println("[ERROR] " + message);
    }
}
