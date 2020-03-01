/**
 * 
 */
package com.spk.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Praveen
 *
 */
public class HashMapTest {

	public static void getAverageMarks(HashMap<Integer, Integer> map) {
		float average = 0.0f;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getKey() % 2 == 0) {
				average = (entry.getValue() + entry.getValue());
				System.out.println(average);
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(12, 90);
		map.put(35, 90);
		map.put(33, 90);
		map.put(56, 88);

		/*
		 * Set<Integer> keys = map.keySet();
		 * 
		 * 
		 * Convert it to an ArrayList
		 * 
		 * List<Integer> listKeys = new ArrayList<Integer>(keys);
		 * 
		 * if (listKeys.indexOf(listKeys) % 2 == 0) { System.out.println(listKeys); }
		 */

	getAverageMarks(map);

	}

}
