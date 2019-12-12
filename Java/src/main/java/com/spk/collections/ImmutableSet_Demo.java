package com.spk.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/**
 * @author Praveen
 *
 */
public class ImmutableSet_Demo {


	public static void main(String[] args) {
		
		Set<String> set=new HashSet<String>();
		set.add("Praveen");
		set.add("Balaji");
		
		for(String s:set)
		{
			System.out.println(s);  
		}
		Collections.unmodifiableSet(set);
		set.add("naseeer");
		
		for(String s1:set)
		{
			System.out.println(s1);  
		}
		
	
	}

}
