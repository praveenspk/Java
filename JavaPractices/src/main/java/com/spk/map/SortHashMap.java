package com.spk.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMap {

	public static void main(String[] args) {

		HashMap<String, String> codenames = new HashMap<String, String>();
		codenames.put("JDK 1.1.4", "Sparkler");
		codenames.put("J2SE 1.2", "Playground");
		codenames.put("J2SE 1.3", "Kestrel");
		codenames.put("J2SE 1.4", "Merlin");
		codenames.put("J2SE 5.0", "Tiger");
		codenames.put("Java SE 6", "Mustang");
		codenames.put("Java SE 7", "Dolphin");
		System.out.println("Before Sorting : " + codenames);
		TreeMap<String, String> map = new TreeMap<String, String>(codenames);
		System.out.println(" After Sorting : " + map);

		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(5, "Kala");
		hashMap.put(3, "Praveen");
		hashMap.put(4, "Ratna");
		hashMap.put(1, "Vardhan");
		hashMap.put(2, "Thimothy");
		hashMap.put(4, "spk");
		System.out.println("Before Sorting : " + hashMap);

		Map<Integer, String> treeMap = new TreeMap<Integer, String>(hashMap);

		System.out.println(" After Sorting : " + treeMap);
	}

}
