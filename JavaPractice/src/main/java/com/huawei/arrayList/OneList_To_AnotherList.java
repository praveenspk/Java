package com.huawei.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class OneList_To_AnotherList {
	public static void main(String[] args) {
		ArrayList<Integer> listOne = new ArrayList<>();
		listOne.add(1);
		listOne.add(2);
		listOne.add(3);
		listOne.add(4);
		listOne.add(5);
		listOne.add(11);
		listOne.add(12);
		listOne.add(13);
		listOne.add(14);
		listOne.add(15);
		System.out.println(" Original List : " + listOne);
		@SuppressWarnings("unchecked")
		ArrayList<Integer> newList = (ArrayList<Integer>) listOne.clone();
		System.out.println("Cloned ArrayList is : " + newList);
		newList.retainAll(listOne);
		System.out.println("RetainAll : " + newList);
		newList.ensureCapacity(16);
		// List Operations
		ArrayList<Integer> list = new ArrayList<>();
		newList.add(21);
		newList.add(22);
		newList.add(23);
		newList.add(24);
		newList.add(25);
		newList.add(26);
		newList.add(27);
		System.out.println(" New List : " + newList);
		Collections.copy(listOne, list);

		// Shuffle
		Collections.shuffle(listOne);
		System.out.println("Shuffled List : " + listOne);
		// copy
		Collections.copy(newList, listOne);
		newList.set(4, 55);
		System.out.println(newList);
		if (list.isEmpty()) {
			System.out.println("ArryaList is Empty");
		}
		// reverse
		Collections.reverse(newList);
		System.out.println(newList);

		Collections.swap(newList, 1, 4);
		System.out.println(newList);
		System.out.println(list);
		newList.removeAll(newList);
		System.out.println(list);
		System.out.println(newList.size());
	}
}
