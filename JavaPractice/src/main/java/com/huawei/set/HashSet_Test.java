package com.huawei.set;

import java.io.IOException;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.TreeSet;
import java.util.Vector;

public class HashSet_Test {

	public static void main(String[] args) throws InterruptedException, IOException {

		HashSet<String> set = new HashSet<>();
		set.add("Java");
		set.add("Phython");
		set.add("JavaScript");
		set.add(".Net");
		set.add("PHP");
		set.add("JQuery");
		System.out.println(set);
		HashSet<String> hset = new HashSet<>();
		hset.add("Java");
		hset.add("Html");
		hset.add("css");
		hset.add("Bootstrap");
		hset.add("AngularJs");
		hset.add("NodeJs");
		hset.add("ReactJs");

		System.out.println("Using ForEach() : ");
		hset.forEach((s) -> {
			System.out.println(s);
		});

		System.out.println("Using Java 8 : ");
		// hset.forEach(System.out::print);
		System.out.println("Using Spliterator : ");
		Spliterator<String> spItr = hset.spliterator();
		spItr.forEachRemaining(s -> System.out.println(s));
		System.out.println("Using Stream API : ");
		hset.stream().forEach((s) -> System.out.println(s));
		// hset.forEach(s -> System.out.println(s));

		TreeSet<String> treeSet = new TreeSet<String>(set);
		System.out.println("TreeSet : " + treeSet);

		System.out.println("Biggest : " + treeSet.ceiling("PHP") + " " + treeSet.ceiling("JQuery"));
		// TreeSet Reverse Order
		Iterator<String> itr = treeSet.descendingIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(set.retainAll(hset));
		System.out.println(hset);
		for (String str : set) {
			System.out.println(hset.contains(str) ? "Yes" : "No");

		}

		/*
		 * System.out.println("Using Enumeration : "); Enumeration<String> e = new
		 * Vector(hset).elements(); while (e.hasMoreElements()) {
		 * System.out.println(e.nextElement()); }
		 * 
		 * for(Enumeration ee=Collections.enumeration(hset);ee.hasMoreElements();) {
		 * System.out.println(ee.hasMoreElements()); }
		 */
		System.out.println("Original tree set: " + treeSet);
		System.out.println("Removes the first(lowest) element: " + treeSet.pollFirst());
		System.out.println("Tree set after removing first element: " + treeSet);

		// retainAll()

		/*
		 * Iterator<String> itr = set.iterator(); while (itr.hasNext()) {
		 * System.out.println(itr.next()); }
		 */
		
		//For cleaning console
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		clearScreen();
	}

	public static void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
}
