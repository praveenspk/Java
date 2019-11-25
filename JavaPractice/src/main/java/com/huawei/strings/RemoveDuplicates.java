package com.huawei.strings;

public class RemoveDuplicates {

	static void removeDuplicates(String str) {

		String string = "";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					string = str.charAt(i) + " ";
				}
			}
		}
		System.out.println(string);

	}

	public static void main(String[] args) {

		// removeDuplicates("Raa");

		String stringWithDuplicates = "praveen";
		char[] characters = stringWithDuplicates.toCharArray();
		boolean[] found = new boolean[256];
		StringBuilder sb = new StringBuilder();
		System.out.println("String with duplicates : " + stringWithDuplicates);
		for (char c : characters) {
			if (!found[c]) {
				found[c] = true;
				sb.append(c);
			}
		}
		System.out.println("String after duplicates removed : " + sb.toString());

		String str = "";
		System.out.println(str.indexOf(1));
	}

}
