package com.spk.collections.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Praveen
 *
 */
public class MapToList {

	public static void main(String[] args) {

		Map<Integer, Student> map = new TreeMap<>();
		map.put(1, new Student("Praveen", 519, "CSE", 9490137902L, "praveen@spk", "Bangalore"));
		map.put(2, new Student("Raj", 520, "CSE", 949038902L, "raj@spk", "Bangalore"));
		map.put(3, new Student("Balaji", 521, "ECE", 353555564L, "balu@spk", "Hyderabad"));
		map.put(4, new Student("Suresh", 522, "CSE", 9394194927L, "suresh@spk", "Mumbai"));

		System.out.println(map);
		System.out.println("=========================================================================");
		for(Map.Entry< Integer,Student> entry:map.entrySet()){
			System.out.println("Key "+entry.getKey() +" Value "+entry.getValue());
		}
		System.out.println("========================================================================");

		List<Integer> keyList = new ArrayList<>(map.keySet());
		List<String> valueList = new ArrayList(map.values());

		for (Integer list : keyList) {
			System.out.println(list + " --> " + valueList);
		}

	}

}
