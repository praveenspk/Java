package com.spk.strings;

public class Anagram {

	public static void findAnagram(String str, String str2) {
		int count = 0;
		str = str.toLowerCase().replace(" ","");
		str2 = str2.toLowerCase().replace(" ","");
		
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str2.length(); j++) {
				if (str.charAt(i) == str2.charAt(j))
					count++;
			}
		}

		if (count == str2.length()) {
			System.out.println(str + " Is Anagram");
		} else {
			System.out.println(str+"Not a Anagram");
		}

	}

	public static void main(String[] args) {
		findAnagram("fried", "FI RED");
		findAnagram("TOPS", "stop");
		
	}  

}
