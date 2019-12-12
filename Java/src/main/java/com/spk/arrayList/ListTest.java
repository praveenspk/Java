package com.spk.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/**
 * @author Praveen
 *
 */
public class ListTest {
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>(Arrays.asList("Praveen","Raj","Thimothy","Vardhan","Guru","Prem","ss"));
		ArrayList<Integer> digits = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		
		Iterator<Integer> iterator = digits.iterator();
		 
		while(iterator.hasNext()) {
		    System.out.println(iterator.next());
		}
		
		ListIterator< String> listItr=names.listIterator();
		while(listItr.hasNext()) {
			System.out.println("List Iterator"+listItr.next());
		}
		
		Iterator<String> itr=names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	
}
