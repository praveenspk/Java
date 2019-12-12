package com.spk.strings;
/**
 * @author Praveen
 *
 */
public class String_Methods {
	public static void main(String[] args) {

		String blogName = "Huawei.com";

		System.out.println(blogName.compareTo("huawei.com"));
		System.out.println(blogName.compareTo("google.com"));
		System.out.println(blogName.compareToIgnoreCase("Huawei.com"));
		System.out.println(blogName.startsWith("H"));
		System.out.println(blogName.endsWith("m"));

		// String[] to String

		String[] tokens = { "How", "To", "Do", "In", "Java" };
		String blogName1 = String.join("", tokens); // without space
		String blogName2 = String.join(" ", tokens); // with one space
		String blogName3 = String.join("-", tokens); // with hyphen

		// Verify string
		System.out.println(blogName1);
		System.out.println(blogName2);
		System.out.println(blogName3);

	}

}
