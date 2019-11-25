package com.spk.strings;

public class CharToStringDemo {
	public static void main(String args[]) {
		// Method 1: Using toString() method
		char ch = 'a';
		String str = Character.toString(ch);
		System.out.println("String is: " + str);

		// Method 2: Using valueOf() method
		String str2 = String.valueOf(ch);
		System.out.println("String is: " + str2);

		// Method 3: Using toCharArray() method
		char arr[] = new char[str.length()]; // len is the length of the array
		arr = str.toCharArray();
		System.out.println(arr);

		// Convert String to char[] array
		String string = "Welcome to India";
		System.out.println("Convert String to Byte[] array : ");
		byte[] bytesArray = new byte[str.length()];

		for (int j = 0; j < bytesArray.length; j++) {
			System.out.println();
		}

		for (int i = 0; i < string.length(); i++) {
			System.out.println(string.charAt(i));
		}

	}
}