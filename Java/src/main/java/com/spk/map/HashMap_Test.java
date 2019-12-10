package com.spk.map;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMap_Test {
	@SuppressWarnings({ "unchecked", "unlikely-arg-type" })
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "White");
		map.put(2, "Green");
		map.put(3, "Red");
		map.put(4, "Yellow");
		map.put(5, "Blue");
		map.put(6, "Pink");
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(10, "Sachin");
		hmap.put(7, "Dhoni");
		hmap.put(12, "Yuvaraj");
		hmap.put(18, "Kohli");
		hmap.put(45, "Rohit");
		hmap.put(46, "Sehwag");
		map.putAll(hmap);
		System.out.println(map);
		TreeMap<Integer, String> tmap = new TreeMap<>(map);
		System.out.println("Head Map : " + tmap.headMap(45));
		System.out.println("Ordered Map : " + tmap);
		System.out.println("Reverse Ordered Map : " + tmap.descendingKeySet() + " " + tmap.descendingMap());

		if (tmap.containsKey(10)) {
			System.out.println("Map Search : " + tmap.get(10));
		}
		if (tmap.containsValue("Kohli")) {
			System.out.println(tmap.get(18));
		}
		System.out.println(map.replace(4, "Yellow", "Orange"));
		System.out.println(map.get(4));
		System.out.println(map);
		System.out.println("First Entry :  " + tmap.firstEntry());
		System.out.println("Last Entry : " + tmap.lastEntry());
		System.out.println(map);
		HashMap<Integer, String> new_hash_map = new HashMap<Integer, String>();
		new_hash_map = (HashMap<Integer, String>) map.clone();
		System.out.println("Clonned Map is : " + new_hash_map);
	}

}
