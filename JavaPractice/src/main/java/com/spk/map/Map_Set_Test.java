package com.spk.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Map_Set_Test {

	public static void main(String[] args) {

		Map<Object, Object> map = new HashMap();
		Set<Object> set = new HashSet();

		map.put(10, "Praveen");
		map.put(200, "Praveen");
		map.put(3, "Praveen");
		map.put(40, "Praveen");

		set.add("x");
		set.add("b");
		set.add("z");
		set.add("d");

		System.out.println("Map : " + map);
		System.out.println("Set : " + set);
	}

}
