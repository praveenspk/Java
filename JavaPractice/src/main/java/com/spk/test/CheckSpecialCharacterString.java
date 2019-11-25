package com.spk.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckSpecialCharacterString {

	/**
	 * Check whether the String contains special character or not using java
	 * 
	 * @author www.instanceofjava.com
	 */

	public static void main(String[] args) {

		String Str = "Java String interview questions ";
		String Str1 = "Java String interview questions % ";
		Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(Str);
		boolean check = m.find();

		if (check)
			System.out.println("String: " + Str + " contains special character");
		else
			System.out.println("String: " + Str + " does not contains any special character");

		Matcher m1 = p.matcher(Str1);

		boolean flag = m1.find();

		if (flag)
			System.out.println("String: " + Str1 + " contains special character");
		else
			System.out.println("String: " + Str1 + " does not contains any special character");

	}
}