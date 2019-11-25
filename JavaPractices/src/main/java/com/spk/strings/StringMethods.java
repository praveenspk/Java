package com.spk.strings;

import java.io.BufferedReader;
import java.io.IOException;

public class StringMethods {

	public static boolean isEmpty(final CharSequence cs) {
		return cs == null || cs.length() == 0;
	}

	public static boolean isNotEmpty(final CharSequence cs) {
		return !isEmpty(cs);
	}

	public static boolean isAnyEmpty(final CharSequence... css) {
		if (css != null && css.length == 0) {
			return false;
		}
		for (final CharSequence cs : css) {
			if (isEmpty(cs)) {
				return true;
			}
		}
		return false;
	}

	public static boolean containsWhitespace(final CharSequence seq) {
		if (isEmpty(seq)) {
			return false;
		}
		final int strLen = seq.length();
		for (int i = 0; i < strLen; i++) {
			if (Character.isWhitespace(seq.charAt(i))) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Returns the input argument, but ensures the first character is capitalized
	 * (if possible).
	 * 
	 * @param in
	 *            the string to uppercase the first character.
	 * @return the input argument, but with the first character capitalized (if
	 *         possible).
	 * @since 1.2
	 */
	public static String uppercaseFirstChar(String in) {
		if (in == null || in.length() == 0) {
			return in;
		}
		int length = in.length();
		StringBuilder sb = new StringBuilder(length);

		sb.append(Character.toUpperCase(in.charAt(0)));
		if (length > 1) {
			String remaining = in.substring(1);
			sb.append(remaining);
		}
		return sb.toString();
	}

	public static String fromBufferedReader(BufferedReader bufferedReader) {
		StringBuffer sb = new StringBuffer();

		try {
			String line = bufferedReader.readLine();

			while (line != null) {
				sb.append(line);
				line = bufferedReader.readLine();
				if (line != null) {
					sb.append("\n");
				}
			}
		} catch (IOException e) {
			// replace this with log.error
			e.printStackTrace();
		}

		return sb.toString();
	}

	public static void main(String[] args) {

		System.out.println("String is Empty : " + isEmpty("PK") + " String is Not Empty : " + isNotEmpty("Praveen"));
		System.out.println(containsWhitespace("Hello welcome to String Class"));
		System.out.println(containsWhitespace("HellowelcometoStringClass"));
		System.out.println(isAnyEmpty("hello welcome"));
		System.out.println(uppercaseFirstChar("praveen"));
		
		
	}

}
