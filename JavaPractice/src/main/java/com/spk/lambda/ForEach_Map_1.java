package com.spk.lambda;

import java.util.HashMap;
import java.util.Map;

public class ForEach_Map_1 {

	public static void main(String[] args) {
	
		Map<String,Integer> Item=new HashMap<>();
		Item.put("A", 10);
		Item.put("B", 20);
		Item.put("C", 10);
		Item.put("D", 30);
		
		for(Map.Entry<String,Integer>entry : Item.entrySet() ) {
			System.out.println("Key"+entry.getKey()+" "+entry.getValue());
		}
	}

}
