package com.spk.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
/**
 * @author Praveen
 *
 */
public class HashMap_Iteration {

	public static void main(String[] args) {
		Map<Integer, Employee> m = new LinkedHashMap<Integer, Employee>();
		m.put(1, new Employee(84119411, "Praveen", "Bangalore"));
		m.put(2, new Employee(84129421, "Vardhan", "Hyderabad"));
		m.put(3, new Employee(84129412, "Suresh", "Mumbai"));

		for (Map.Entry<Integer, Employee> entry : m.entrySet())
			System.out.println(entry.getKey() + ": " + entry.getValue());

		// java8 Lambda
		System.out.println("");
		System.out.println("java8 Lambda : ");
		System.out.println("==============");
		m.forEach((key, value) -> {
			System.out.println("Key : " + key + " , Value :  " + value);
		});

		// java8 ForEach

		System.out.println("");
		System.out.println("Java 8 ForEach : ");
		System.out.println("================");
		m.forEach((k, v) -> System.out.println(k + ": " + v));

		for (Entry<Integer, Employee> map : m.entrySet()) {
			System.out.println("Key :  " + map.getKey() + " Value : " + map.getValue());
		}

		System.out.println("");
		System.out.println("Through EntrySet : ");
		System.out.println("================");
		Set entrySet = m.entrySet();
		Iterator itr = entrySet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
