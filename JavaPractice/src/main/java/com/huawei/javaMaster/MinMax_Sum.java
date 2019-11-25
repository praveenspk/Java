package com.huawei.javaMaster;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class MinMax_Sum {

	// Complete the miniMaxSum function below.
	static void miniMaxSum(int[] arr) {
		int maxvalue = 0;
		int minvalue = 0;
		int smallest = arr[0];
		int largest = arr[0];
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] < smallest) {
				smallest = arr[j];
			}
			maxvalue = (maxvalue + arr[j]) - (smallest);
		}
		for (int k = 0; k < arr.length; k++) {
			if (arr[k] > largest) {
				largest = arr[k];
			}
			minvalue = (minvalue + arr[k]) - (largest);
		}
		System.out.print(minvalue);
		System.out.print("  ");
		System.out.print(maxvalue);

	}

	static void getMaxMinSum(int[] arr) {
		long[] longs = Arrays.stream(arr).asLongStream().toArray();

		Arrays.sort(longs);
		long sum = LongStream.of(longs).sum();

		long min = sum - longs[4];
		long max = sum - longs[0];

		System.out.println(min + " " + max);

	}

	static void getSum(int[] arr) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		Arrays.sort(arr);
		for (int j = 0; j < 4; j++) {
			min += arr[j];

		}

		System.out.print(min + " ");

		for (int k = 1; k < 5; k++) {
			max += arr[k];

		}

		System.out.print(max);

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		  int[] arr = new int[5];
		  
		  System.out.println("Enter Numbers : "); String[] arrItems =
		  scanner.nextLine().split(" ");
		  scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		  
		  for (int i = 0; i < 5; i++) { int arrItem = Integer.parseInt(arrItems[i]);
		  arr[i] = arrItem; }
		 
	
		 miniMaxSum(arr);
		// getMaxMinSum(arr);
		scanner.close();
	}
}
