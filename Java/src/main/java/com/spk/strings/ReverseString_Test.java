package com.spk.strings;

import java.io.IOException;
/**
 * @author Praveen
 *
 */
public class ReverseString_Test {

	public static void main(String[] args) throws IOException {

		String str = "Praveen Kumar";
		String revstring = "";

		for (int i = str.length() - 1; i >= 0; --i) {
			revstring += str.charAt(i);
		}

		System.out.println(revstring);
		System.out.write("Hello".getBytes());
	}
}