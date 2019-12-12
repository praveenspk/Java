package com.spk.arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Praveen
 *
 */
public class CreateArrayListExample {

	public static void main(String[] args) {
		// Creating an ArrayList of String using
		List<String> animals = new ArrayList<>();
		// Adding new elements to the ArrayList
		animals.add("Lion");
		animals.add("Tiger");
		animals.add("Cat");
		animals.add("Dog");
		System.out.println(animals);
	}
}