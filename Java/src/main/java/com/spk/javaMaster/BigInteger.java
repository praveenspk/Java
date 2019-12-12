package com.spk.javaMaster;

import java.io.*;

/**
 * @author Praveen
 *
 */
public class BigInteger {

	// Complete the aVeryBigSum function below.
	static long aVeryBigSum(long[] arr) {
		long total = 0;
		int arr_i;
		for (arr_i = 0; arr_i < arr.length; arr_i++) {
			total += arr[arr_i];
		}
		//System.out.println(total);
		return total;

	}

	public static void main(String[] args) throws IOException {

		long[] ar = { 1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L };

		long result = aVeryBigSum(ar);

		System.out.println(result);
	}
}
