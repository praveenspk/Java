package com.spk.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		// Creating a HashMap
		Map<String, Integer> numberMapping = new LinkedHashMap<>();
		// Adding key-value pairs to a HashMap
		numberMapping.put("One", 1);
		numberMapping.put("Two", 2);
		numberMapping.put("Three", 3);
		numberMapping.putIfAbsent("Three", 5);
		

		// Add a new key-value pair only if the key does not exist in the HashMap, or is
		// mapped to `null`
		numberMapping.putIfAbsent("Four", 4);

		System.out.println(numberMapping);
	}
}