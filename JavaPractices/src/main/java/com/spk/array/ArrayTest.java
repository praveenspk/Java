package com.spk.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTest {

	static void getArray() {
		Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 7 };
		Integer[] arr1 = { 23, 34, 5, 56, 7, 67, 78, 78, 98, 9 };
	
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
		ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(arr1));
		System.out.println(list + " " + myList);
		myList.addAll(list);
		System.out.println(myList);

		Object[] array = myList.toArray();
		System.out.println("Array Elements are : ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

	public static void main(String[] args) {
		getArray();
	}

}
