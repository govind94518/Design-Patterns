package com.shivaya.DesignLogger.handlers;

public class MainHandler {
    public static void main(String[] args) {
       Logger logger = LoggerFactory.getLogger();
       logger.log(LogLevel.DEBUG,"print Debug message ");
        logger.log(LogLevel.INFO,"print INFO message ");
        logger.log(LogLevel.ERROR,"print ERROR message ");

    }
}
