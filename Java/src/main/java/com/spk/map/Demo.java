package com.spk.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Praveen
 *
 */
public class Demo {
	public static void main(String[] args) {

		Employee emp = new Employee(1, "Praveen", "Bangalore");
		Employee emp1 = new Employee(1, "Praveen", "Bangalore");
		Employee emp2 = new Employee(1, "Praveen", "Bangalore");

		Map<Employee, String> map = new HashMap<Employee, String>();
		map.put(emp1, "Praveen");
		map.put(emp, "Praveen");
		map.put(emp2, "Praveen");

		System.out.println("Map size " + map.size() + " : " + map);

		Integer i = new Integer(2);
		Integer i2 = new Integer(2);
		Integer i3 = new Integer(2);
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(i, "Praveen");
		map1.put(i2, "Praveen");
		map1.put(i3, "Praveen");

		System.out.println("Map size " + map1.size() + " : " + map1);

		String str = "Praveen";
		System.out.println(str.concat("Kumar"));

	}

}
