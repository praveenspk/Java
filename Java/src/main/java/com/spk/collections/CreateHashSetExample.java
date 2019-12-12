package com.spk.collections;

import java.util.HashSet;
import java.util.Set;
/**
 * @author Praveen
 *
 */
public class CreateHashSetExample {
	public static void main(String[] args) {
		// Creating a HashSet
		Set<String> daysOfWeek = new HashSet<>();

		// Adding new elements to the HashSet
		daysOfWeek.add("Monday");
		daysOfWeek.add("Tuesday");
		daysOfWeek.add("Wednesday");
		daysOfWeek.add("Thursday");
		daysOfWeek.add("Friday");
		daysOfWeek.add("Saturday");
		daysOfWeek.add("Sunday");
		daysOfWeek.add("SUnday");
		// Adding duplicate elements will be ignored
		daysOfWeek.add("Monday");
		System.out.println(daysOfWeek);
	}
}