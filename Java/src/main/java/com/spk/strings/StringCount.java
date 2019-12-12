package com.spk.strings;

import java.util.HashMap;
import java.util.Map;
/**
 * @author Praveen
 *
 */
public class StringCount {

	public static void count(String x) {
		char[] ch = x.toCharArray();
		int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;
		for (int i = 0; i < x.length(); i++) {
			if (Character.isLetter(ch[i])) {
				letter++;
			} else if (Character.isDigit(ch[i])) {
				num++;
			} else if (Character.isSpaceChar(ch[i])) {
				space++;
			} else {
				other++;
			}
		}
		System.out.println("The string is : " + x);
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("other: " + other);
	}

	public static void getReversedString(String str) {
		int len = str.length();
		Map<Character, Integer> numChars = new HashMap<Character, Integer>(Math.min(len, 26));

		for (int i = 0; i < len; ++i) {
			char charAt = str.charAt(i);

			if (!numChars.containsKey(charAt)) {
				numChars.put(charAt, 1);
			} else {
				numChars.put(charAt, numChars.get(charAt) + 1);
			}
		}

		System.out.println(numChars);
	}

	public static void getCount(String str) {
		Map<Character, Integer> counterMap = new HashMap<Character, Integer>();
		for (char current : str.toCharArray()) {
			if (!counterMap.containsKey(current)) {
				counterMap.put(current, 1);
			} else {
				counterMap.put(current, counterMap.get(current) + 1);
			}
		}
		System.out.println("Input : " + str);
		System.out.println(counterMap);

	}

	public static void getReverseString(String str) {
		String[] words = str.split(" ");

		String reverseString = "";

		for (int i = words.length - 1; i >= 0; i--) {
			reverseString += words[i] + " ";

		}
		System.out.println("Input String : " + str);
		System.out.println("OutPut String : " + reverseString.substring(0, reverseString.length() - 1));
	}

	public static void main(String[] args) {
		getCount("aa bb ccc dd");
		// getReverseString("Iam good boy");
		// getReverseString("Hello welcome to india");
		//count("Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33 $spk1");

	}
}
