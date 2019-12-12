package com.spk.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
/**
 * @author Praveen
 *
 */
public class ConcurrentMap {

	static Map<Integer, String> countryAsia = new HashMap<>();

	public static void sortbykey()
	    {
	
		// TreeMap to store values of HashMap
	        TreeMap<Integer,String > sorted = new TreeMap<>();
	 
	        // Copy all data from hashMap into TreeMap
	        sorted.putAll(countryAsia);
	 
	        // Display the TreeMap which is naturally sorted
	        for (Map.Entry< Integer,String> entry : sorted.entrySet()) 
	            System.out.println("Key = " + entry.getKey() + 
	                         ", Value = " + entry.getValue());        
	    }
	     
	public static void main(String[] args) {
		//Putting Data
		countryAsia.put(91, "INDIA");
		countryAsia.put(92, "PAK");
		countryAsia.put(96, "KUWAIT");
		countryAsia.put(94, "DUBAI");
		System.out.println(countryAsia);
		Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());
		Set<Integer> keySet = map.keySet();
		synchronized (map) {
			Iterator<Integer> iterator = keySet.iterator();
			while (iterator.hasNext()) {
				Integer key = iterator.next();
				String value = map.get(key);
				System.out.println(value);
			}
		}
	}

}
