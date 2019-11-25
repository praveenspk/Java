package com.spk.logger;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class LoggingError {

	private static final Logger logger = LogManager.getLogger(LoggingError.class);

	public static void main(String[] args) {
		logger.info("Hello welcome to Logging concept.....!!!!");
		try {
			System.out.println(getData());
		} catch (IllegalArgumentException e) {
			logger.error("{}", e);
		}

	}

	static int getData() throws IllegalArgumentException {
		throw new IllegalArgumentException("Sorry IllegalArgumentException!");
	}

}
