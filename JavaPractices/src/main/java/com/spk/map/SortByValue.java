/*Sort by Value
 * Converts the Map into a List<Map>, sorts the List<Map> with 
 * a custom Comparator and put it into
 *a new insertion order map – LinkedHashMap
 *Map ---> List<Map> ---> Collections.sort() --> List<Map> (Sorted) ---> LinkedHashMap

*	  1. Convert Map to List of Map
*	  2. Sort list with Collections.sort(), provide a custom Comparator
         Try switch the o1 o2 position for a different order
*	  3. Loop the sorted list and put it into 
		 a new insertion order Map LinkedHashMap
*	   
*
*/




package com.spk.map;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortByValue {

	public static void main(String[] args) {
		Map<Integer,String> unSorted=new HashMap<>();
		unSorted.put(10, "z");
        unSorted.put(5, "b");
        unSorted.put(6, "a");
        unSorted.put(20, "c");
        unSorted.put(1, "d");
        unSorted.put(7, "e");
        unSorted.put(8, "y");
        unSorted.put(99, "n");
        unSorted.put(50, "j");
        unSorted.put(2, "m");
        unSorted.put(9, "f");
	    System.out.println("Un Sorted Map : " +unSorted);
	    printMap(unSorted);
		
	}
//	
	/*    Steps to Convert Map in sorted Order ByValue
	 * 
	 * 	  1. Convert Map to List of Map
	 *	  2. Sort list with Collections.sort(), provide a custom Comparator
	         Try switch the o1 o2 position for a different order
	 *	  3. Loop the sorted list and put it into 
			 a new insertion order Map LinkedHashMap
			
	
	 */	   
	private static Map<String, Integer> sortByValue(Map<String, Integer> unsortMap) {

        // 1. Convert Map to List of Map
        List<Map.Entry<String, Integer>> list =
                new LinkedList<Map.Entry<String, Integer>>(unsortMap.entrySet());

        // 2. Sort list with Collections.sort(), provide a custom Comparator
        //    Try switch the o1 o2 position for a different order
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // 3. Loop the sorted list and put it into a new insertion order Map LinkedHashMap
        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
	return sortedMap;
	}
	 public static <K, V> void printMap(Map<K, V> map) {
	        for (Map.Entry<K, V> entry : map.entrySet()) {
	            System.out.println("Key : " + entry.getKey()
	                    + " Value : " + entry.getValue());
	        }
	    }

}
