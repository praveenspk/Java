package com.huawei.utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Locale;

public class String_To_Date {

	static void getLocaleList() {
		Locale locale = Locale.getDefault();
		System.out.println("Default Locale: " + locale);

		// Getting all available locales from current instance of the JVM
		Locale[] availableLocale = Locale.getAvailableLocales();
		for (Locale aLocale : availableLocale) {
			System.out.println("Name of Locale: " + aLocale.getDisplayName());
			System.out.println("Language Code: " + aLocale.getLanguage() + ", Language Display Name: "
					+ aLocale.getDisplayLanguage());
			System.out.println(
					"Country Code: " + aLocale.getCountry() + ", Country Display Name: " + aLocale.getDisplayCountry());
			if (!aLocale.getScript().equals("")) {
				System.out.println(
						"Script Code: " + aLocale.getScript() + ", Script Display Name: " + aLocale.getDisplayScript());
			}
			if (!aLocale.getVariant().equals("")) {
				System.out.println("Variant Code: " + aLocale.getVariant() + ", Variant Display Name: "
						+ aLocale.getDisplayVariant());
			}
			System.out.println("****************************************************************");
		}
	}

	static {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		System.out.println("System Date and Time is :  " + sdf.format(date));

	}
	static {
		String dateStr = "06-Aug-2019";
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
		try {
			// String to Date
			Date date = sdf.parse(dateStr);
			System.out.println(date);

			// Date to String
			String strDate = sdf.format(date);
			System.out.println(strDate);

		} catch (ParseException pe) {
			System.out.println("Exception Occured at : " + pe.getMessage());
		}
	}
	static {
		LocalDate today = LocalDate.now();
		System.out.println("Today Date is : " + today);

		LocalDateTime date = LocalDateTime.now();
		System.out.println("Local Date and Time is : " + date);

		LocalTime time = LocalTime.now();
		System.out.println("Current Time : " + time);
		Locale locale = new Locale("en");

		System.out.println("Locale : " + locale.getDisplayName());

	}

	static {
		Locale locale = new Locale("in");
		System.out.println("locale: " + locale);

		// Create a locale object using two parameters constructor
		Locale locale2 = new Locale("in", "INDIA");
		System.out.println("locale2: " + locale2);

		// Create a locale object using three parameters constructor
		Locale locale3 = new Locale("no", "NORWAY", "NY");
		System.out.println("locale3: " + locale3);
	}

	public static void main(String[] args) throws ParseException {

		getLocaleList();
	}

}
