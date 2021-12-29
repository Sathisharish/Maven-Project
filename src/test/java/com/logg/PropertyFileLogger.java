package com.logg;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertyFileLogger {
	
	static Logger log = Logger.getLogger(PropertyFileLogger.class);
	
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("log4j.properties");
		
		log.debug("debug");
		
		
		log.info("Information");
		
		log.warn("warn");
		
		log.error("error");
		
		log.fatal("fatal");
		
		
		
		
		
		
		
		
	}

}
