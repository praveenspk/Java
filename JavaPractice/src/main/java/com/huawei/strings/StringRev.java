package com.huawei.strings;

public class StringRev {

	static String reverceSentence(String input) {
		String[] words = input.split(" "); // spit it with space.
		String output = "";
		StringBuilder sb=new StringBuilder();
		sb.append(words);
		for (int i = words.length - 1; i >= 0; i--) {
			if (i != 0)
				output = output + words[i] + " ";
			else
				output = output + words[i];
		}
		return output;
	}

	public static void main(String[] args) {
		System.out.println("Reverse String :  " + reverceSentence("Huawei"));

	}
}
