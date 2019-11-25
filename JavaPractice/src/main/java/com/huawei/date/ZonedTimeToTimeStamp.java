package com.huawei.date;

import java.sql.Timestamp;
import java.time.ZonedDateTime;

public class ZonedTimeToTimeStamp {
	static void convertZonedTimeToTmeStamp() {
		ZonedDateTime timeNow = ZonedDateTime.now();
		System.out.println("Time Zone : " + timeNow);
		Timestamp timestamp = Timestamp.valueOf(timeNow.toLocalDateTime());
		System.out.println("Time Stamp : " + timestamp);
		Timestamp timestamp2 = Timestamp.from(timeNow.toInstant());
		System.out.println(timestamp2);

	}

	public static void main(String[] args) {

		convertZonedTimeToTmeStamp();
	}

}
