package com.shivaya.DesignLogger.handlers;

public class IdleLogger implements Logger{


    @Override
    public void log(LogLevel logLevel, String message) {
            System.out.println("all log  Level is IdleLogger");
            System.out.println(message);
    }
}
