package com.shivaya.DesignLogger.handlers;

public class DebugLogger implements Logger{
    Logger nextLogger;

    public DebugLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    @Override
    public void log(LogLevel logLevel, String message) {
        if(logLevel==LogLevel.DEBUG){
            System.out.println("Log Level is DebugLogger");
            System.out.println(message);
            return;
        }
        this.nextLogger.log(logLevel,message);

    }
}
