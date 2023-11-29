package com.training.org;

// thsi packages is for file handling with exception
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

// this packages is for slf4j with any exception
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

public class MainLoggingExample {
	// this main function is for slf4j package
	//	public static void main(String[] args)  {
	
	// this main function is for util package
	public static void main(String[] args) throws SecurityException, IOException {
		
		// this method is for util 
		FileHandler fileHandler = new FileHandler("mylog.log");
		SimpleFormatter formatter = new SimpleFormatter();
		
		
		fileHandler.setFormatter(formatter);
		Logger logger = Logger.getLogger("MyLog");
		logger.addHandler(fileHandler);
		logger.info("This is a log message");
		logger.warning("This is the warning message");
		
		
		// this methods are for slf4j
//		Logger logger = LoggerFactory.getLogger(MainLoggingExample.class);
//		logger.info("This is into Message");
//		logger.error("This is warn Message");
//		logger.warn("This is the warning message");
//		
//		logger.trace("Entering method doSomething with parameters (param1=5, param2=10)");
//		logger.debug("Processing request for user ID 12345");
//		logger.info("user with ID '1234' just signed in");
//		logger.warn("Potential security vulnerability detected in user input: '...'");
//		logger.error("Failed to connect to database: java.sql.SQLException: Connection refused");
	}
}