package com.spk.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javafx.collections.transformation.SortedList;
/**
 * @author Praveen
 *
 */
public class MapIterations {
	static Map<String, String> countryCodes = new HashMap<>();

	public static void main(String[] args) {
		countryCodes.put("91", "INDIA");
		countryCodes.put("92", "PAK");
		countryCodes.put("1", "USA");
		countryCodes.put("33", "France");
		countryCodes.put("44", "UK");

		SortMap();

		// KeySet()
		Set<String> setCodes = countryCodes.keySet();
		Iterator<String> iterator = setCodes.iterator();
		while (iterator.hasNext()) {
			String code = iterator.next();
			String country = countryCodes.get(code);
			System.out.println(code + "-" + country);
		}
		// Value()
		Collection<String> countries = countryCodes.values();
		for (String countryCode : countries) {
			System.out.println(countryCode);
		}

		// entrySet
		Set<Map.Entry<String, String>> entries = countryCodes.entrySet();
		for (Map.Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		countryCodes.clear();
		System.out.println("Is This Map True : " + countryCodes.isEmpty());

	}

	public static void SortMap() {
		// TreeMap
		TreeMap<String, String> sorted = new TreeMap<>();
		sorted.putAll(countryCodes);
		for (Map.Entry<String, String> entry : sorted.entrySet()) {
			System.out.println("Key : Value " + entry.getKey() + ": " + entry.getValue());
			;
		}
	}
}
