package com.spk.Collections.aggregate;

//Using JDK 8 Aggregate Operations:

import java.util.*;
import java.util.stream.*;

public class FindDups {
	public static void main(String[] args) {
		Set<String> distinctWords = Arrays.asList("Praveen", "Vardhan", "Thimothy", "Praveen", "Rajesh", "Suresh")
				.stream().collect(Collectors.toSet());
		System.out.println(distinctWords.size() + " distinct words: " + distinctWords);
		// Using the for-each Construct
		Set<String> s = new HashSet<String>();
		for (String a : distinctWords)
			s.add(a);
		System.out.println(s.size() + " distinct words: " + s);
	}
}
