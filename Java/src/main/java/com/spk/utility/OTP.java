package com.spk.utility;



public class OTP {

	private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$%&*!";

	public static String randomAlphaNumeric(int count) {
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
			int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
			builder.append(ALPHA_NUMERIC_STRING.charAt(character));
		}
		return builder.toString();
	}

	static void otpTest() {

		int input = (int) (Math.random() * 9000) + 100000;
		String otp = String.valueOf(input);
		System.out.println("OTP : " + otp);
	}

	public static void main(String[] args) {

		otpTest();

		System.out.println("AlphaNumeric OTP :  " + randomAlphaNumeric(6));

	}

}
