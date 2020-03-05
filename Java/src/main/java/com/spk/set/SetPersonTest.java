package com.spk.set;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SetPersonTest {
	public static void main(String[] args) {

		Set<Person> set = new HashSet<Person>();
		set.add(new Person("Praveen", 26));
		set.add(new Person("Vinod", 30));
		set.add(new Person("Rajesh", 25));
		set.add(new Person("Vardhan", 22));

		// System.out.println(set);
		/*
		 * Collections.sort((List<T>) set, new Comparator() {
		 * 
		 * public int compare(Object o1, Object o2) { // TODO Auto-generated method stub
		 * return 0; }
		 * 
		 * 
		 * });
		 */

		Iterator<Person> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		/*
		 * for (Person person : set) { System.out.println(person); }
		 */
	}

}
