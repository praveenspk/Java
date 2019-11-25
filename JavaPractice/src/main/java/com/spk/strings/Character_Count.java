package com.spk.strings;

public class Character_Count {

	static void countCharacter(String str) {
		char[] ch = str.toCharArray();

		for (int i = 1; i <= ch.length; i++) {
			String s = " ";
			while (i < ch.length && ch[i] != ' ') {
				s = s + ch[i];
				i++;
			}
			if (s.length() > 0)
				System.out.println("Count : " + s.length());

		}
	}

	static void count(String str, Character c) {
		
		str = str.toLowerCase().replace(" ", "");
		// split the string by spaces in a
		str.split(" ");
		// search for pattern in a
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			// if match found increase count
			if (c.equals(str.charAt(i)))
				count++;
		}

		if (count != 0)
			System.out.println("Character Occured Count " + count);
		else
			System.out.println("Character not found ingiven String");

	}

	// Java program to count the number
	// of occurrence of a word in
	// the given string given string
	static int countOccurences(String str, String word) {
		// split the string by spaces in a
		String a[] = str.split(" ");

		// search for pattern in a
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			// if match found increase count
			if (word.equals(a[i]))
				count++;
		}

		return count;
	}

	public static void main(String[] args) {
		countCharacter("SURESH");
		count("praveen", 'e');
		System.out.println("Word count in given sentance: "
				+ countOccurences("Hello praveen welcome java by praveen ", "praveen"));
	}

}
