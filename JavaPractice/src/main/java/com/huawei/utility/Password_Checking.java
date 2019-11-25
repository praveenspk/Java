package com.huawei.utility;

import java.util.Scanner;

public class Password_Checking {

	public static boolean is_Valid_Password(String password) {
		if (password.length() < PASSWORD_LENGTH)
			return false;

		int charCount = 0;
		int numCount = 0;
		for (int i = 0; i < password.length(); i++) {

			char ch = password.charAt(i);

			if (is_Numeric(ch))
				numCount++;
			else if (is_Letter(ch))
				charCount++;
			else
				return false;
		}

		return (charCount >= 2 && numCount >= 2);

	}

	public static boolean is_Numeric(char ch) {
		return (ch >= '0' && ch <= '9');

	}

	public static boolean is_Letter(char ch) {
		ch = Character.toUpperCase(ch);
		return (ch >= 'A' && ch <= 'Z');

	}

	public static final int PASSWORD_LENGTH = 8;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1. A password must have at least eight characters.\n"
				+ "2. A password consists of only letters and digits.\n"
				+ "3. A password must contain at least two digits \n"
				+ "Enter your password (agree  above Terms and Conditions.): ");
		String pass = sc.nextLine();
		if (is_Valid_Password(pass)) {
			System.out.println("Password is Valid : " + pass);
		} else {
			System.out.println("Invalid password ");
		}

	}

}
