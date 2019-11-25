package com.spk.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("JAVA");
		list.add("JEE");
		list.add("PYTHON");
		list.add("PERL");
		list.add("C");
		list.add("ADA");
		list.add("C++");
		list.add("JAVA");
		list.add("JAVA");

		Collections.sort(list);
		System.out.println(list + " " + list.size());
		Collections.shuffle(list);
		System.out.println();
		Set<String> set = new TreeSet(list);
		System.out.println(set);
		for (String temp : set) {
			System.out.println(temp);
		}

	}

}
