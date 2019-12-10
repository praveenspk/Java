package com.spk.map;

import java.util.HashMap;
import java.util.Map;

public class MapFrequency {
	
	static void frequency(int arr[]){
		HashMap<Integer,Integer> hmap=new HashMap<>(); 
		for(int i=0;i<arr.length;i++){
			Integer c=hmap.get(arr[i]);
			if(hmap.get(arr[i])==null)
				hmap.put(arr[i], 1);
			else
				hmap.put(arr[i], ++c);
		}

		for(Map.Entry entry:hmap.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

	public static void main(String[] args) {
		int arr[]={10, 34, 5, 10, 3, 5, 10};
		frequency(arr);
	}

}
