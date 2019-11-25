package com.huawei.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

	// Removing string duplicates
	static void removeDuplicates() {
		ArrayList<String> list = new ArrayList<String>(
				Arrays.asList("Praveen", "Praveen", "Raj", "Thimothy", "Thimothy", "Vardhan", "Guru", "Prem", "Reddy"));
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {
					list.remove(j);
					j--;
				}
			}
		}
		System.out.println("DIstinct Values : " + list);
	}

	// Removing Integer duplicates
	static void removeDuplicate() {
		ArrayList<Integer> list = new ArrayList(
				Arrays.asList(56, 243, 5, 432, 134, 64634, 346, 135, 15, 135, 432, 134, 56, 5, 64634));
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {
					list.remove(j);
					j--;
				}
			}
		}
		System.out.println("DIstinct Values : " + list);
	}

	static void addDuplicates() {
		ArrayList<Integer> list = new ArrayList<Integer>(
				Arrays.asList(56, 243, 5, 432, 134, 64634, 346, 135, 15, 135, 432, 134, 56, 5, 64634));
		List myList = new ArrayList<>();
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {
					list.remove(j);
					myList.add(j);
					j--;
				}
			}
		}
		System.out.println("DIstinct Values : " + list);
	}

	public static void main(String[] args) {
		// removeDuplicates();
		// removeDuplicate();
		addDuplicates();
	}

}
