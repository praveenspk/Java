package com.spk.strings;

import java.util.ArrayList;
import java.util.List;
/**
 * @author Praveen
 *
 */
public class String_Remove {

	public static void main(String[] args) {
		
		List<String> birds=new ArrayList<>();
		birds.add("Hawk");
		birds.add("Hawk");
		birds.add("Dove");
		birds.add("Peacock");
		System.out.println(birds);
		System.out.println(" ");
		System.out.println(birds.remove("cardinal"));
		System.out.println(birds.remove("Hawk"));
		System.out.println(birds.remove(0));
		System.out.println(birds.remove(1));
		System.out.println(birds);
	}

}
