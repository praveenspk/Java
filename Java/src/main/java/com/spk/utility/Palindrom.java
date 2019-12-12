package com.spk.utility;
/**
 * @author Praveen
 *
 */
public class Palindrom {

	// Method 1 : Without using String methods
	public static boolean checkIfPalindrome(String s) {
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}

	// Method 2 : Using StringBuilder method
	public static boolean isPalindrome(String str) {
		StringBuilder sb = new StringBuilder().append(str);
		String result = sb.toString();
		if (str.equalsIgnoreCase(result)) {
			System.out.println(str + " is Palindrom");
		}
		return true;

	}

	// Method 3 : Using Character
	public static String onlyCharacters(String s) {
		StringBuilder toReturn = new StringBuilder();
		for (Character c : s.toCharArray()) {
			if (Character.isLetter(c)) {
				toReturn.append(c);
			}
		}
		return toReturn.toString();
	}

	static boolean isPalindromes(String s) {
		StringBuilder letters = new StringBuilder();
		String onlyLetters = s;
		for (Character c : s.toCharArray()) {
			if (Character.isLetter(c)) {
				letters.append(c);
			}
		}
		StringBuilder reversedLetters = new StringBuilder(letters).reverse();
		return onlyLetters.equals(reversedLetters);
	}

	// Number Palindrome
	static void checkIsPalindrom(int num) {

		int reversedInteger = 0, remainder, originalInteger;
		originalInteger = num;
		while (num != 0) {
			remainder = num % 10;
			reversedInteger = reversedInteger * 10 + remainder;
			num /= 10;
		}
		// palindrome if orignalInteger and reversedInteger are equal
		if (originalInteger == reversedInteger)
			System.out.println(originalInteger + " is a palindrome.");
		else
			System.out.println(originalInteger + " is not a palindrome.");
	}

	public static void main(String[] args) {
		System.out.println(checkIfPalindrome("Praveen"));
		System.out.println(checkIfPalindrome("pvp"));
		System.out.println(isPalindrome("pvp"));
		isPalindrome("cwc");
		System.out.println(onlyCharacters("saggas"));
		System.out.println(isPalindromes("saggas"));

		checkIsPalindrom(121121);
	}
}
