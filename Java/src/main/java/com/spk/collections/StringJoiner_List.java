package com.spk.collections;

import java.util.ArrayList;
import java.util.StringJoiner;
/**
 * @author Praveen
 *
 */
public class StringJoiner_List {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("Praveen");
		list.add("Vardhan");
		list.add("Thimothy");
		list.add("Alice");
		list.add("Bob");
		
		StringJoiner join=new StringJoiner(",");
		join.setEmptyValue("Is Empty");
		System.out.println(join);
		join.add(list.get(0));
		join.add(list.get(1));
		System.out.println(join +" Length of Stringjoiner : " + join.length());
		
		  StringJoiner sj2 = new StringJoiner(":");
	       sj2.add(list.get(2)).add(list.get(3)).add(list.get(4));
	        
	       //merge() method
	       join.merge(sj2);
	        
	       // toString() method
	       System.out.println(join.toString());
	        
	       System.out.println("Length of new Join : " + join.length());
		
	}
}
