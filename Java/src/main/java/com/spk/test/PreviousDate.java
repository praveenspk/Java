package com.spk.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PreviousDate {

	public static String getPreviousDate(String date) throws ParseException {

		DateFormat dateFormate = new SimpleDateFormat("yyyyMMdd");

		Date myDate = dateFormate.parse(date);

		Date oneDayBefore = new Date(myDate.getTime() - 2);
		System.out.println(myDate.getTime());
		myDate.getDay();
		
		System.out.println(oneDayBefore);
		String result = dateFormate.format(oneDayBefore);
		return result;
	}

	public static void main(String[] args) {

		String dateString = "20200302";
		try {
			System.out.println(getPreviousDate(dateString));
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
