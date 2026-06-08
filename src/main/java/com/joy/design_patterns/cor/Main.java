package com.joy.design_patterns.cor;

import com.joy.design_patterns.cor.service.DebugLogger;
import com.joy.design_patterns.cor.service.ErrorLogger;
import com.joy.design_patterns.cor.service.InfoLogger;
import com.joy.design_patterns.cor.service.Logger;

public class Main {
    private static Logger getLoggerChain() {

        Logger infoLogger = new InfoLogger();
        Logger debugLogger = new DebugLogger();
        Logger errorLogger = new ErrorLogger();

        infoLogger.setNextLevel(debugLogger);
        debugLogger.setNextLevel(errorLogger);

        return infoLogger;
    }

    public static void main(String[] args) {
        Logger logger = getLoggerChain();

        logger.logMessage(LogLevel.INFO,
                "Application started");

        System.out.println();

        logger.logMessage(LogLevel.DEBUG,
                "User details fetched");

        System.out.println();

        logger.logMessage(LogLevel.ERROR,
                "Database connection failed");
    }
}
