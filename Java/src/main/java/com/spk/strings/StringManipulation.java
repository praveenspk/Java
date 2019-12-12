package com.spk.strings;
/**
 * @author Praveen
 *
 */
public class StringManipulation {
	public static void main(String[] args) {

		String s = "abc";
		s = s + 1 + 2;
		s = s + (2 + 2);
		s.concat("1").concat("2");
		s.concat(" " + 2 + 2);
		System.out.println(s);

	}

}
