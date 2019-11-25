package com.spk.utility;

public class CountValey {

	public static void main(String[] args) {

		String s = "UDDDUDUU";

		int level = 0;
		int valleys = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'U') {
				level++;
			} else if (s.charAt(i) == 'D') {
				if (level == 0) {
					valleys++;
				}
				level--;
			}
		}
		System.out.println(valleys);
	}
}