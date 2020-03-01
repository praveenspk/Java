/**
 * 
 */
package com.spk.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Praveen
 *
 */
public class PreviousDate {

	/**
	 * @param args
	 * @throws ParseException
	 */
	static void getPreviousDate(String dateString) throws ParseException {
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");

		// Get a Date object from the date string
		Date myDate = dateFormat.parse(dateString);

		// this calculation may skip a day (Standard-to-Daylight switch)...
		// oneDayBefore = new Date(myDate.getTime() - (24 * 3600000));

		// if the Date->time xform always places the time as YYYYMMDD 00:00:00
		// this will be safer.
		Date oneDayBefore;
		oneDayBefore = new Date(myDate.getTime() - 2);

		String result = dateFormat.format(oneDayBefore);
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dateString = "20200301";
		try {
			getPreviousDate(dateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
