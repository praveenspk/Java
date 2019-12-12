package com.spk.map;

import java.util.HashMap;
import java.util.Map;
/**
 * @author Praveen
 *
 */
public class BulkOperations {

	public static void main(String[] args) {
		Map<Integer,String> countryEU = new HashMap<>();
		countryEU.put(33, "FRANCE");
		countryEU.put(44, "GERMANY");
		countryEU.put(55, "ITALY");
		Map<Integer,String> countryAsia=new HashMap<>();
		countryAsia.put(91, "INDIA");
		countryAsia.put(92, "PAK");
		countryAsia.put(96, "KUWAIT");
		countryAsia.put(94, "DUBAI");
		Map<Integer,String> countryWorld=new HashMap<>();
		countryWorld.put(1, "USA");
		countryWorld.put(82, "CHINA");
		countryWorld.put(86, "KOREA");
		countryWorld.put(6, "AUSTRALIA");
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "Praveen");
		map.put(2, "Vardhan");
		map.put(3, "Thimothy");
		
		countryWorld.putAll(countryAsia);
		countryWorld.putAll(countryEU);
		countryWorld.putAll(map);
		System.out.println(countryWorld);
		
	}
	
	
}
