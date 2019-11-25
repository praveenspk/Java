package com.spk.javaMaster;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {

	/*
	 * Complete the timeConversion function below.
	 */
	static void getConvertedTime(String[] time) {
		String hours = time[0];
		String minutes = time[1];
		String seconds = time[2].substring(0, 2);
		String dayEve = time[2].substring(2, 4);
		if (dayEve.equals("AM")) {
			System.out.println((hours.equals("12") ? "00" : hours) + ":" + minutes + ":" + seconds);
		} else {
			System.out.println(
					(hours.equals("12") ? hours : (Integer.parseInt(hours) + 12)) + ":" + minutes + ":" + seconds);
		}
	}

	static String timeConversion(String s) {

		// get the string into an array using : as a separator
		String[] time_array = s.split(":");

		// military_time variable to be returned
		String military_time = new String();

		// final HH part
		String hh_final = new String();
		// Rest after HH to be concatenated to get military_time
		String rest = new String();

		StringBuilder REST_mil_builder = new StringBuilder();
		for (int i = 2; i < 8; i++) {
			REST_mil_builder.append(s.charAt(i));
		}
		// "rest" basically gets everything after HH excluding AM/PM, so 01:03:40PM
		// would have a "rest" value of ":03:40"
		rest = REST_mil_builder.toString();

		int hh = Integer.parseInt(time_array[0]);
		String AMPM_contains = time_array[2];

		// converting if the last piece after the split contains "PM"
		if (AMPM_contains.contains("PM")) {
			hh = hh + 12;
			hh = hh == 24 ? 0 : hh;
		}

		// converting hh to have a 0 before it because when it is an integer 01 will be
		// just 1 which we don't want
		StringBuilder hh_build = new StringBuilder();
		if (hh >= 0 && hh <= 9) {
			hh_build.append("0");
			hh_build.append(hh);
			hh_final = hh_build.toString();
		} else {
			hh_build.append(hh);
			hh_final = hh_build.toString();
		}

		// military time concatenation
		military_time = hh_final + rest;
		// Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock
		military_time = s == "12:00:00AM" ? "00:00:00" : military_time;
		// Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
		military_time = s == "12:00:00PM" ? "12:00:00" : military_time;

		return military_time;
	}

	static String timeConversions(String s) {
		// hh:mm:ssPM
		String sr = "";
		String check = s.charAt(0) + "" + s.charAt(1);
		check = check.replaceAll("\\s", "");
		int h = Integer.parseInt(check);
		if (s.charAt(8) == 'P' && h != 12) {
			sr = s.charAt(0) + "" + s.charAt(1);
			sr = sr.replaceAll("\\s", "");
			int a = Integer.parseInt(sr) + 12;
			sr = a + ":" + s.charAt(3) + s.charAt(4) + s.charAt(5) + s.charAt(6) + s.charAt(7);
		} else if (s.charAt(8) == 'A' && h == 12) {

			sr = "00" + ":" + s.charAt(3) + s.charAt(4) + s.charAt(5) + s.charAt(6) + s.charAt(7);
			sr = sr.replaceAll("\\s", "");
		} else {
			sr = "" + s.charAt(0) + s.charAt(1) + s.charAt(2) + s.charAt(3) + s.charAt(4) + s.charAt(5) + s.charAt(6)
					+ s.charAt(7);
			sr = sr.replaceAll("\\s", "");
		}
		return sr;

	}

	public static void main(String[] args) throws IOException {

		String result = timeConversion("01:30:59PM");
		System.out.println(result);
		System.out.println(timeConversions("01:30:59PM"));

		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter time to convert : "); String[] time =
		 * sc.nextLine().split(":"); getConvertedTime(time);
		 */
	}
}
