package com.spk.utility;
/**
 * @author Praveen
 *
 */
public class CharToStringJava {

	public static void main(String[] args) {

		// char to string
		char c = 'a';
		String str = String.valueOf(c);
		System.out.println(str);

		// using Character class
		str = Character.toString(c);

		// another way
		str = new Character(c).toString();
		// string concatenation - worst performance
		str = "" + c;

		// char array to string
		char[] ca = { 'a', 'b', 'c' };
		str = String.valueOf(ca);
		// recommended way
		str = new String(ca);
		System.out.println(str);

		String string = "Huawei";

		for (int i = 0; i < string.length(); i++) {

			char ch = string.charAt(i);
			System.out.println(" " + ch);
		}

	}
	


}
