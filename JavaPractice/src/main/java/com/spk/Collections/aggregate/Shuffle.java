package com.spk.Collections.aggregate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Shuffle {

	static void shuffleArray() {
		List<String> list = Arrays.asList("Praveen", "Vardhan", "Thimothy", "Praveen", "Rajesh", "Suresh");
		Collections.shuffle(list);
		System.out.println(list);
	}

	static void shuffleList() {
		List<String> list = new ArrayList<>();
		list.add("Praveen");
		list.add("Vardhan");
		list.add("Thimothy");
		list.add("Suresh");
		list.add("Praveen");
		Collections.shuffle(list, new Random());
		System.out.println(list);
	}

	/*
	 * static int indexOf(Integer e) { for (ListIterator<String> it =
	 * listIterator(); it.hasNext();) if (e == null ? it.next() == null :
	 * e.equals(it.next())) return it.previousIndex(); // Element not found return
	 * -1; }
	 */
	public static void main(String[] args) {

		shuffleList();
		shuffleArray();

	}
}