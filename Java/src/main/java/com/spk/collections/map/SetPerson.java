/**
 * 
 */
package com.spk.collections.map;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Praveen
 *
 */
public class SetPerson {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		set.add(new Student("Praveen", 519, "CSE", 9490137902L, "jhsdgf", "ajhsgd"));
		set.add(new Student("Vardhan", 520, "CSE", 9490137902L, "jhsdgf", "ajhsgd"));
		set.add(new Student("Suresh", 521, "CSE", 9490137902L, "jhsdgf", "ajhsgd"));
		System.out.println(set);
	}

}
