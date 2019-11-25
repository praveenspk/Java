package com.spk.logger;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingTest {

	private static final Logger logger = LoggerFactory.getLogger(LoggingTest.class);

	public static void main(String[] args) {

		logger.debug("Hello from Logback");

		// while (true)//test rotate file
		logger.debug("getNumber() : {}", getNumber());

	}

	static int getNumber() {
		return 5;
	}

}