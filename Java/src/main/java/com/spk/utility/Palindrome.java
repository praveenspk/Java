package com.spk.utility;
/**
 * @author Praveen
 *
 */
public class Palindrome {

	static Boolean isPalindrom(String str) {
		System.out.println("Satrted....!!");

		for (int i = 0; i < str.length() / 2 && (str.charAt(i) != str.charAt(str.length() - 1 - i)); i++) {
			return false;
		}
		return true;

	}

	static boolean isPalindromNumber(int num) {
		int reminder, reverse = 0, originalInteger = num;
		while (num != 0) {
			reminder = num % 10;
			reverse = reverse * 10 + reminder;
			num /= 10;
		}
		if (originalInteger == reverse)
			return true;
		return false;
	}

	static boolean isArmstrongNumber(int num) {
		int reminder, result = 0, originalInteger = num;
		while (num != 0) {
			reminder = num % 10;
			result += Math.pow(reminder, 3);
			num /= 10;
		}
		if (originalInteger == result)
			return true;
		return false;
	}

	public static void main(String[] args) {
		// System.out.println(isPalindrom("ab"));
		System.out.println(isPalindromNumber(121222));
		System.out.println(isArmstrongNumber(153));

	}

}
