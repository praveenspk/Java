package com.spk.strings;


public class NumberReplacer {

	public static void print(int startIndex, int endIndex) {
		String value = "";
		for (int i = startIndex; i <= endIndex; i++) {
			value = String.valueOf(i);
			if (value.contains("5") && value.contains("8")) {
				if (value.charAt(0) == '5') {
					System.out.println(value + "=" + "JavaMava");
				} else {
					System.out.println(value + "=" + "MavaJava");
				}

			} else if (value.contains("5")) {
				System.out.println(value + "=" + "Java");
			} else if (value.contains("8")) {
				System.out.println(value + "=" + "Mava");
			} else {
				System.out.println(value);
			}
		}
	}

	public static void main(String[] args) {
		print(1, 100);
		
	}
}