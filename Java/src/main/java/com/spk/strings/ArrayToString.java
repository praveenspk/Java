package com.spk.strings;
/**
 * @author Praveen
 *
 */
public class ArrayToString {

	public static void main(String[] args) {

		String array[] = { "java", "string", "without", "brackets" };
		StringBuffer strbuffer = new StringBuffer();
		for (String str : array) {
			strbuffer.append(str).append(" ");
		}
		String result = strbuffer.toString();
		System.out.println(result);

	}

}