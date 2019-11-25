package com.spk.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CreateHashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Praveen", 8411);
		map.put("Vardhan", 9872);
		map.put("Thimothy", 9394);
		map.put("Dany", 9800);
		map.putIfAbsent("Ratna", 9989);
		System.out.println("HashMap Iteration using LAMBDA : ");
		map.forEach((employee, salary) -> {
			System.out.println(employee + " =>" + salary);
		});
		String userName = "Praveen";
		if (map.containsKey(userName)) {
			Integer number = map.get(userName);
			// System.out.println(number);
		}
		if (map.containsValue(8411)) {
			System.out.println();
		}

		map.put(userName, 9490);
		System.out.println(map);

		Set<Map.Entry<String, Integer>> mapEntry = map.entrySet();
		Iterator<Map.Entry<String, Integer>> mapIterator = mapEntry.iterator();
		System.out.println("HashMap Iteration using EntrySet : ");
		
		while (mapIterator.hasNext()) {
			Map.Entry<String, Integer> entry = mapIterator.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		map.entrySet().forEach(entryt->{
			System.out.println(entryt.getKey()+" "+entryt.getValue());
		});
		
	}

}