package com.spk.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author Praveen
 *
 */
public class Array_To_Set {

	public static void main(String[] args) {
		String[] strArray= {"INDIA","USA","EUROPE","BANGLADESH","RUSSIA","POLAND","GREENLAND","UK","MANIPAL"};
		for(int i=0;i<strArray.length;i++) {
		System.out.println(strArray[i]);
		}
		//HashSet ImplementationS
		Set<String> mySet=new HashSet<>(Arrays.asList(strArray));
		System.out.println(mySet);
		//TreeSet Implementation
		Set<String> set=new TreeSet<>(Arrays.asList(strArray));
		System.out.println(set);

		Map<Object,String> map=new TreeMap<>();
		map.put(strArray, "Countries");
		System.out.println(map);

	}
}
