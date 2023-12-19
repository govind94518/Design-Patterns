package com.shivaya.DesignLogger.handlers;

public class LoggerFactory {
    private LoggerFactory(){

    }
    public static Logger getLogger(){
        return  new DebugLogger(
                new InfoLogger(
                new WarnLogger(new IdleLogger())));
    }
}
