package com.joy.design_patterns.cor.service;

import com.joy.design_patterns.cor.LogLevel;

public abstract class Logger {
    protected LogLevel level;
    protected Logger nextLevel;

    public void setNextLevel(Logger nextLevel) {
        this.nextLevel = nextLevel;
    }

    public void logMessage(LogLevel logLevel, String message){
        if(level==logLevel)
            write(message);
        else
            nextLevel.logMessage(logLevel, message);
    }

    protected abstract void write(String message);
}
