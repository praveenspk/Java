package com.spk.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Praveen
 *
 */

public class Reversing_ImmutableList implements Reverser {

	@Override
	public List<Integer> reverseList(List<Integer> list) {
		System.out.println("Before List Reversed : " + list);
		final int size = list.size();
		List<Integer> reversedList = new ArrayList<>();
		// Method 1 : Using Collections Class
		Collections.reverse(list);
		System.out.println(list);
		// Method 2 : Using iteration
		for (int i = 0; i < size; i++) {
			// Add element i to position 0
			reversedList.add(0, list.get(i)); 
		}

		return reversedList;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(45);
		list.add(89);
		list.add(1);
		list.add(9);
		list.add(78);
		list.add(98);
		Reversing_ImmutableList reverse = new Reversing_ImmutableList();
		System.out.println("Reversed List : " + reverse.reverseList(list));
	}

}
