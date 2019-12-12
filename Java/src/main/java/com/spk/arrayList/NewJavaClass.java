package com.spk.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * @author Praveen
 *
 */
public class NewJavaClass {
	public static void main(String args[]) {
		List<String> list1 = new ArrayList<String>();
		Collections.addAll(list1, "Kiran", "Kumar", "Praveen");
		list1.add("Dharma");
		list1.add("Ashok");
		list1.add("Naveen");

		List<String> list2 = new ArrayList<String>();
		Collections.addAll(list2, "Shiva", "Mahesh", "Srinath");
		list2.add("Naryana");
		list2.add("kiran");
		System.out.println(Collections.disjoint(list1, list2));

		list2.add("Kumar");
		System.out.println(Collections.disjoint(list1, list2));
	}
}