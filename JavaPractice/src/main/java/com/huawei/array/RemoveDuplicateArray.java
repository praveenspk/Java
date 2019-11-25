package com.huawei.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateArray {

	static void distinctArray(Integer[] numbers) {

		System.out.println(Arrays.toString(numbers));
		Set<Integer> set = new HashSet<>(Arrays.asList(numbers));
		Integer[] distinct = set.toArray(new Integer[] {});

		System.out.println("Distinct Array : " + Arrays.toString(distinct));
	}

	static void removeDuplicates(Integer[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					arr = org.apache.commons.lang3.ArrayUtils.remove(arr, j);
				}
			}
		}
		System.out.println("Distinct Values are : ");
		for (int array = 0; array < arr.length; array++) {
			System.out.println(arr[array]);
		}

	}

	public static void main(String[] args) {
		Integer[] arr = { 54, 34, 55, 54, 3, 4, 12, 67, 32, 34, 55, 53, 54, 67 };
		// distinctArray(arr);
		removeDuplicates(arr);

	}

}
