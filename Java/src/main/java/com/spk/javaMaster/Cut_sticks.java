package com.spk.javaMaster;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/**
 * @author Praveen
 *
 */
public class Cut_sticks {

	// Complete the cutTheSticks function below.
	static int[] cutTheSticks(int[] arr) {
		Arrays.sort(arr);
		int sticksLeft = arr.length;

		// int sticksLeft = N;

		int curr = arr[0];
		int currCount = 0;
		// System.out.println(N);

		// Works by decrementing sticksLeft by the frequency of the smallest stick each
		// time
		for (int i = 0; i < arr.length; i++) {
			if (curr == arr[i]) {
				currCount++;
			} else {
				sticksLeft -= currCount;
				currCount = 1;
				curr = arr[i];
				System.out.println(sticksLeft);
			}
		}
		return arr;

	}

	public static void main(String[] args) throws IOException {

		int[] arr = { 5, 4, 4, 2, 2, 8 };
		int[] result = cutTheSticks(arr);

		for (int i = 0; i < result.length; i++) {
			System.out.println(String.valueOf(result[i]));
		}

	}
}
