package com.ciranet.utilities;

import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerManager {

	//Initialize Log4j instance
    private static final Logger LoggerManager =  LogManager.getLogger(LoggerManager.class);
    
    static {
    	 PropertyConfigurator.configure("log4j.properties");
    }

	public static void info(String message) {
		LoggerManager.info(message);
	}

	public static void debug(String message) {
		LoggerManager.debug(message);
	}

	public static void error(String message) {
		LoggerManager.error(message);
	}

	public static void warn(String message) {
		LoggerManager.warn(message);
	}

	public static void fatal(String message) {
		LoggerManager.fatal(message);
	}

}
