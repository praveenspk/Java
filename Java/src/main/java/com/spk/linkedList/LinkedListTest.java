package com.spk.linkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
/**
 * @author Praveen
 *
 */
public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("White");
		list.add("Red");
		list.add("Green");
		list.add("Yellow");
		list.add("Black");
		list.add("Blue");
		list.add("Grey");
		LinkedList<String> listOne = new LinkedList<>();
		listOne.add("Cricket");
		listOne.add("Food Ball");
		listOne.add("Badminton");
		listOne.add("Vally Ball");
		listOne.add("Rugby");
		System.out.println(listOne);
		LinkedList<String> listJoin = new LinkedList<>();
		listJoin.addAll(listOne);
		listJoin.addAll(list);
		System.out.println(listJoin);
		
		
		 for (String e : list)
             listJoin.add(listOne.contains(e) ? "Yes" : "No");
          System.out.println(" "+listJoin);  
		
		
		// iteration
		System.out.println("Iteration through ForLoop : ");

		for (String elements : list) {
			System.out.println(elements);
		}
		System.out.println("Iteration through Iterator : ");
		Iterator<String> itr = list.listIterator(1);
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Reverse List through Iterator : ");

		Iterator<String> it = list.descendingIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		list.add(3, "Purple");
		System.out.println(list);
		list.offerLast("Pink");
		System.out.println(list);
		list.offerFirst("Gold");
		System.out.println(list);
		list.offer("Orange");
		System.out.println(list);
		Collections.swap(list, 0, 2);
		System.out.println(list);
		String newList;

		newList = list.getFirst();
		System.out.println(newList);
		newList = list.getLast();
		System.out.println(newList);

		newList = listJoin.peekFirst();
		System.out.println(newList);

		newList = listJoin.peekLast();
		System.out.println(newList);

		list.clear();
		// Clearing LinkedList
		System.out.println(list);

		ArrayList<String> arrList = new ArrayList<>(listJoin);
		System.out.println(listJoin);
		/*
		 * for(String ele:listJoin) { System.out.println(ele); }
		 */
	}

}
