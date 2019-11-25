package com.huawei.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapImpl {

	public static void main(String[] args) {
		String s = "FB";
		String str = "Ea";
		System.out.println(str.hashCode() + " " + s.hashCode());

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put(str, 1);
		map.put(s, 22);
		map.put("", 426);

		// System.out.println(map.hashCode());

	}

}
