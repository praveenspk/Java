package com.spk.array;

import java.util.Arrays;

/**
 * @author Praveen
 *
 */
public class LargestNumberArray {

	static void get3LargestNumber(int[] arr) {

		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		int len = arr.length;
		System.out.println("3rd Largest Number in an Array : " + arr[len - 3]);
	}

	public static void main(String[] args) {

		int[] arr = { 213, 34, 45, 56, 78, 78, 8974, 24, 25324, 15, 12134, };
		get3LargestNumber(arr);
	}
}
