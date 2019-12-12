package com.spk.strings;
/**
 * @author Praveen
 *
 */
public class SkillString {

	static {
		
		
		String str1 = "hello";
		String str2 = new String("hello");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equalsIgnoreCase(str2));

	}

	public static void main(String[] args) {

		String str1 = "eyehunt split string super";
		String strarry[] = str1.split("\\s");
		String str = "eyehunt";
		// System.out.println(str.charAt(7));

		String str2 = new String("eyehunt");
		String str3 = "ab";
		String str4 = "abcd";
		System.out.print(str.substring(0, 3));
		System.out.print(str3.compareTo(str4));

		if (str.equals(str2)) {
			System.out.print("True");
		} else {
			System.out.print("False");
		}

		for (String string : strarry) {
			System.out.println(string);
		}

	}
}