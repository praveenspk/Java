package com.spk.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		// Creating a TreeMap
		SortedMap<String, String> fileExtensions = new TreeMap<>();

		// Adding new key-value pairs to a TreeMap
		fileExtensions.put("python", ".py");
		fileExtensions.put("c++", ".cpp");
		fileExtensions.put("kotlin", ".kt");
		fileExtensions.put("golang", ".go");
		fileExtensions.put("java", ".java");

		// Printing the TreeMap (Output will be sorted based on keys)
		System.out.println(fileExtensions);

		System.out.println("First Key :" + fileExtensions.firstKey());

		System.out.println("Last Key :" + fileExtensions.lastKey());

		SortedMap<String, String> sortedMap = fileExtensions.tailMap("java");
		System.out.println("tailMap : " + sortedMap);

		sortedMap = fileExtensions.headMap("java");
		System.out.println("headMap : " + sortedMap);
	}
}