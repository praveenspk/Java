package com.spk.strings;

public class Count_Word {

	public static int countWord(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		count = count + 1;

		return count;
	}

	static int countVowel(String str) {
		int count = 0;
		for (int i = 0; i < str.toLowerCase().length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				count++;
			}
		}
		return count;
	}

	static int countVowels(String str) {
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		int count = 0;
		str = str.toLowerCase();
		char[] letters = str.toCharArray();
		for (int i = 0; i < letters.length; i++) {
			for (int j = 0; j < vowels.length; j++) {
				if (letters[i] == vowels[j]) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(" Words in a string : " + countWord("The quick brown fox jumps over the lazy dog"));
		//System.out.println(" Vowels in String are : " + countVowel("Praveen kumar aeiou"));
		//System.out.println(countVowels("Praveenkumar"));
	}

}
