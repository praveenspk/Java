package com.spk.arrayList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTraverse {

	private static void listIterateDemo() {
		List<String> list = new LinkedList<>();
		list.add("element 1");
		list.add("element 2");
		list.add("element 3");
		list.add("element 4");
		ListIterator<String> iterator = list.listIterator();
		while (iterator.hasNext()) {
			String str = iterator.next();

			System.out.println("forward direction ---" + str);

		}

		while (iterator.hasPrevious()) {
			String str = iterator.previous();

			System.out.println("backward direction ---" + str);
		}

		for (ListIterator<String> it = list.listIterator(list.size()); it.hasPrevious();) {
			String t = it.previous();
			System.out.println(t);
		}
	}

	public static void main(String[] args) {

		
		listIterateDemo();
	}

}
