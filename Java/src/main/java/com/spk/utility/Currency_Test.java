package com.spk.utility;

import java.text.NumberFormat;
import java.util.Locale;

public class Currency_Test {
	static void getCurrencyByCountry(double payment) {
		
		String india = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment);
		String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
		String uk = NumberFormat.getCurrencyInstance(Locale.UK).format(payment);
		String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
		String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

		System.out.println("India: " + india);
		System.out.println("US: " + us);
		System.out.println("UK: " + uk);
		System.out.println("China: " + china);
		System.out.println("France: " + france);
		

	}

	public static void main(String[] args) {
		getCurrencyByCountry(143.67);

	}

}
