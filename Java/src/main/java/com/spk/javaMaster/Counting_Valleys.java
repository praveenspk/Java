package com.spk.javaMaster;

import java.io.*;
import java.util.Scanner;


public class Counting_Valleys {

	// Complete the countingValleys function below.
	static int countingValleys(int n, String s) {

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
		
		return valleys;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int n = 8;

		String s = "UDDDUDUU";

		int result = countingValleys(n, s);

		System.out.println(String.valueOf(result));
	}
}
