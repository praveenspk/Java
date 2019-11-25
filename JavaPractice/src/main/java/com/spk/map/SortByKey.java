package com.spk.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortByKey {

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
        System.out.println("Sorted Map....");
        TreeMap<Integer,String> treeMap=new TreeMap<>();
        treeMap.putAll(unSorted);
        
        printMap(treeMap);
	}

	public static void printMap(Map<Integer, String> map){
		for(Map.Entry< Integer,String> entry:map.entrySet()){
			System.out.println("Key "+entry.getKey() +" Value "+entry.getValue());
		}
	}
	
}
