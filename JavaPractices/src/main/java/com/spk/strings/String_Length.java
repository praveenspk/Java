package com.spk.strings;

public class String_Length {
	
	//Finding String Array length without using String.Length()?
	static int strLength(String str) {
		char[] ch = str.toCharArray();
		int count = 0;
		for (char c : ch) {
			count++;
		}
		return count;
	}

	// sorting an array without using Arrays.sort()
	public static String sortString(String input) {
		char[] charArray = new char[input.length()];
		input = input.toLowerCase();
		int index = 0;
		for (int i = 'a'; i <= 'z'; i++) {
			for (int j = 0; j < input.length(); j++) {
				if (input.charAt(j) == i)
					charArray[index++] = (char) i;
			}
		}
		return new String(charArray);
	}

	public static void main(String[] args) {

		System.out.println("String Length : " + strLength("Huawei"));
		System.out.println("Sorting String : " + sortString("praveenkumar saggam"));

	}
}
