package com.huawei.javaMaster;

import java.util.Arrays;

public class Mini_Max_Sum {

	static void miniMaxSum(Long[] arr) {

		long minsum = 0, maxsum = 0;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			minsum = minsum + arr[i];
		}
		for (int i = 1; i < arr.length; i++) {
			maxsum = maxsum + arr[i];
		}

		System.out.println(minsum + " " + maxsum);
	}

	public static void main(String[] args) {
		Long[] arr = { 1L, 5L, 2L, 3L, 4L };
		miniMaxSum(arr);

	}

}
