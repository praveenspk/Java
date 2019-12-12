package com.spk.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
/**
 * @author Praveen
 *
 */
public class RemoveDuplicate {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Praveen");
		al.add("Vardhan");
		al.add("Thimothy");
		al.add("java");
		al.add("technology");
		al.add("Praveen");
		al.add("java");
		System.out.println(al);
		System.out.println("Remove duplicate using HashSet but order does not maintain ");
		HashSet<String> hs = new HashSet<>(al);
		System.out.println(hs);
		System.out.println("Remove duplicate using LinkedHashSet but order maintain ");
		LinkedHashSet<String> lhs = new LinkedHashSet<>(al);
		System.out.println(lhs);
		System.out.println("Remove duplicate using contains method");
		ArrayList<String> ul = new ArrayList<>();
		for (String t : al) {
			if (!ul.contains(t)) {
				ul.add(t);
			}
		}

		Iterator<String> it = ul.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);

		}

	}

}