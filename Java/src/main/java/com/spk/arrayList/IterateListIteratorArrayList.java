package com.spk.arrayList;

import java.util.ArrayList;
import java.util.ListIterator;
/**
 * @author Praveen
 *
 */
public class IterateListIteratorArrayList {

	public static void main(String[] args) 
	{

		// create an ArrayList object
		ArrayList<String> arrayList = new ArrayList();

		// Add elements to Arraylist

		int a[]= {1,2,3,4};
		int b[]=new int[4];
		System.out.println(a.length);
		System.out.println(b.length);
		
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("F");
		arrayList.add("F");
		arrayList.add("G");
		arrayList.add("H");
		arrayList.add("I");

		/*
		 * Get a ListIterator object for ArrayList using istIterator() method.
		 */

		ListIterator itr = arrayList.listIterator();

		/*
		 * Use hasNext() and next() methods of ListIterator to iterate through the
		 * elements in forward direction.
		 */

		System.out.println("Iterating through ArrayList elements in forward  direction...");

		while (itr.hasNext())
			System.out.println(itr.next());

		/*
		 * Use hasPrevious() and previous() methods of ListIterator to iterate through
		 * the elements in backward direction.
		 */

		System.out.println("Iterating through ArrayList elements in backward   direction...");

		while (itr.hasPrevious())
			System.out.println(itr.previous());

	}

}