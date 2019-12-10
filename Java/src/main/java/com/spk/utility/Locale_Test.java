package com.spk.utility;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Locale_Test {

	static {

	}

	static void getforLanguageTag() {
		Locale usLocale = Locale.forLanguageTag("en-US");

		long number = 123456789L;
		NumberFormat nf = NumberFormat.getInstance(usLocale);
		System.out.println(nf.format(number));

		Date now = new Date();
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, usLocale);
		System.out.println(df.format(now));
	}

	static void getLocaleList() {

		Locale[] locale = Locale.getAvailableLocales();
		List<String> list = new ArrayList<String>();
		for (Locale aLocale : locale) {
			list.add(aLocale.getDisplayName());
			list.add(aLocale.getLanguage());
			list.add(aLocale.getDisplayLanguage());

			System.out.println(list);

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

	public static void main(String[] args) {
		// getLocaleList();
		getforLanguageTag();

	}
}
