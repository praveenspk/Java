package com.spk.arrays;

import java.util.ArrayList;

/**
 * @author Praveen
 *
 */
public class commonelement {

	static void getCommonEle() {
		ArrayList<Integer> listA = new ArrayList<>();
		listA.add(2);
		listA.add(4);
		listA.add(5);
		listA.add(6);
		listA.add(3);
		System.out.println("List A Elements :  " + listA);
		ArrayList<Integer> listB = new ArrayList<>();
		listB.add(1);
		listB.add(2);
		listB.add(3);
		listB.add(4);
		listB.add(6);
		listB.add(77);
		System.out.println("List A Elements :  " + listA);
		// System.out.println(listA);
		// System.out.println(listB);
		listA.retainAll(listB);
		System.out.println("Common Element list::" + listA);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 56, 68 };
		int[] arr1 = { 2, 3, 34, 5, 6, 34, 63, 4 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr[i] == arr1[j]) {
					System.out.println(arr[i]);
				}
			}
		}
		
		getCommonEle();
	}
}