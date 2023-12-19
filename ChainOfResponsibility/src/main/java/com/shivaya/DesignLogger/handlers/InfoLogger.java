package com.shivaya.DesignLogger.handlers;

import lombok.extern.java.Log;

public class InfoLogger implements Logger {

    Logger nextLogger;

    public  InfoLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    @Override
    public void log(LogLevel logLevel, String message) {
        if(logLevel==LogLevel.INFO){
            System.out.println("Log Level is  InfoLogger");
            System.out.println(message);
            return;
        }
        this.nextLogger.log(logLevel,message);
    }
}
