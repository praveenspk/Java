package com.spk.javaMaster;

import java.io.*;
/**
 * @author Praveen
 *
 */
public class CakeCandle {

	// Complete the birthdayCakeCandles function below.
	static int birthdayCakeCandles(int[] ar) {
		int max = 0;
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > max) {
				max = ar[i];
			}
		}
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == max) {
				count++;
			}
		}
		return count;

	}

	public static void main(String[] args) throws IOException {
		int[] ar = { 3, 2, 1, 3 };

		int result = birthdayCakeCandles(ar);

		System.out.println(result);
	}
}
