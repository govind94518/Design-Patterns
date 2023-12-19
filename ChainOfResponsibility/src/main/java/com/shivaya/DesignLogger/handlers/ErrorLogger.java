package com.shivaya.DesignLogger.handlers;

public class ErrorLogger implements Logger{
    Logger nextLogger;

    public  ErrorLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }
    @Override
    public void log(LogLevel logLevel, String message) {
        if(logLevel==LogLevel.ERROR){
            System.out.println("Log Level is ErrorLogger");
            System.out.println(message);
            return;
        }
        this.nextLogger.log(logLevel,message);
    }
}
