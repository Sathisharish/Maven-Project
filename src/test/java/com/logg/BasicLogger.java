package com.logg;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class BasicLogger {

	static Logger log = Logger.getLogger(BasicLogger.class); // factory design pattern

	public static void main(String[] args) {

		BasicConfigurator.configure();
		
		log.debug("debug");

		log.info("Information");

		log.warn("warning");

		log.error("error");

		log.fatal("fatal");

	}

}
