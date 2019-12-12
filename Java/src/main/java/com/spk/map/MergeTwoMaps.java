package com.spk.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * @author Praveen
 *
 */
public class MergeTwoMaps {

	public static void main(String[] args) {

		Map<String, Integer> map1 = new HashMap<String, Integer>();
		Map<String, Integer> map2 = new HashMap<String, Integer>();

		map1.put("Maths", 103);
		map1.put("Physics", 101);
		map1.put("Chemistry", 102);
		map1.put("English", 104);
		map1.put("Computer", 105);

		map2.put("Maths2", 49);
		map2.put("Biology", 45);
		map2.put("History", 101);
		map2.put("English2", 46);
		map2.put("Data Structures", 47);

		// Method 1 : Using Stream.concat()

		Map<String, Integer> concatMap = Stream.concat(map1.entrySet().stream(), map2.entrySet().stream())
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (v1, v2) -> v1 > v2 ? v1 : v2, HashMap::new));

		System.out.println("=========Method 1 : Using Stream.concat()========");
		System.out.println("Map 1 : " + map1);
		System.out.println("Map 2 : " + map2);
		System.out.println("Merging two Maps  : " + concatMap);

		// Method 2 : Usnig Map.merge() :

		Map<String, Integer> mergeMap = new HashMap<String, Integer>(map1);
		map2.forEach((key, value) -> mergeMap.merge(key, value, (v1, v2) -> (v1 + v2)));
		System.out.println("\n==========Method 2 : Usnig Map.merge() :=========");

		System.out.println("Map 1 : " + map1);
		System.out.println("Map 2 : " + map2);
		System.out.println("Merging two Maps  : " + mergeMap);

		// Method 3 : Usnig Stream.of() and flatMap() :

		Map<String, Integer> streamOfMap = Stream.of(map1, map2).flatMap(map -> map.entrySet().stream())
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, Integer::sum, HashMap::new));
		System.out.println("\n======Method 3 : Usnig Stream.of() and flatMap() :=====");
		System.out.println("Map 1 : " + map1);
		System.out.println("Map 2 : " + map2);
		System.out.println("Merging two Maps  : " + streamOfMap);

		// Method 4 : Using Stream() Pipeline :
		Map<String, Integer> streamPipelineMap = map2.entrySet().stream().collect(Collectors.toMap(Entry::getKey,
				Entry::getValue, (v1, v2) -> v1 < v2 ? v1 : v2, () -> new HashMap<>(map1)));

		System.out.println("\n======Method 4 : Using Stream() Pipeline :=====");
		System.out.println("Map 1 : " + map1);
		System.out.println("Map 2 : " + map2);
		System.out.println("Merging two Maps  : " + streamOfMap);

	}

}
