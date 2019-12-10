package com.spk.Collections.aggregate;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Aggregate_Operations {
	public static void main(String[] args) {
		Collection<String> c=new HashSet<>();
		c.add("Praveen");
		c.add("Vardhan");
		c.add("Thimothy");
		System.out.println(c);
		Collection<String> noDups = new HashSet<>(c);
		
		c.stream()
		.collect(Collectors.toSet());
		System.out.println(" Hello "+noDups);
	}
	
}
