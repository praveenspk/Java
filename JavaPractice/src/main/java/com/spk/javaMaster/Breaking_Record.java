package com.spk.javaMaster;

import java.util.Scanner;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Breaking_Record {

	// Complete the breakingRecords function below.
	static int[] breakingRecords(int[] scores) {
		int highest, lowest;
		highest = lowest = scores[0];

		int[] result = new int[2];

		for (int s_i = 1; s_i < scores.length; s_i++) {
			if (scores[s_i] > highest) {
				highest = scores[s_i];
				++result[0];
			} else if (scores[s_i] < lowest) {
				lowest = scores[s_i];
				++result[1];
			}
		}

		return result;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int n = 10;
		int[] scores = { 3, 4, 21, 36, 10, 28, 35, 5, 24, 42 };

		/*
		 * String[] scoresItems = scanner.nextLine().split(" ");
		 * scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		 * 
		 * for (int i = 0; i < n; i++) { int scoresItem =
		 * Integer.parseInt(scoresItems[i]); scores[i] = scoresItem; }
		 */
		int[] result = breakingRecords(scores);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}
}
