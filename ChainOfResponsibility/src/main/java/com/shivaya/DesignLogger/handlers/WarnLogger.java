package com.shivaya.DesignLogger.handlers;

import sun.rmi.log.LogHandler;

public class WarnLogger implements Logger {
    Logger nextLogger;

    public  WarnLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    @Override
    public void log(LogLevel logLevel, String message) {
        if(logLevel==LogLevel.WARN){
            System.out.println("Log Level is WarnLogger");
            System.out.println(message);
            return;
        }
        this.nextLogger.log(logLevel,message);
    }
}
