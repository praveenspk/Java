package com.spk.collections.map;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 * @author Praveen
 *
 */
public class NameSort {
	public static void main(String[] args) {
		Name nameArray[] = { new Name("Thimothy", "Vardhan"), new Name("Jessy", "Shresta"), new Name("John", "Smith"),
				new Name("Praveen", "Sebastine") };

		List<Name> names = Arrays.asList(nameArray);
		Collections.sort(names);
		System.out.println(names);
	}
}