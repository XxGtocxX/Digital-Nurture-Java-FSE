package com.debanuj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    private static final Logger logger =
            LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {

        logger.trace("This is TRACE");
        logger.debug("This is DEBUG");
        logger.info("Application Started");
        logger.warn("Low Disk Space");
        logger.error("Something went wrong");

    }
}