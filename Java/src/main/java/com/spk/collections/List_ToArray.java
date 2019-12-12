package com.spk.collections;

import java.util.ArrayList;
import java.util.List;
/**
 * @author Praveen
 *
 */
public class List_ToArray {
	public static void main(String[] args) {
		List<String> myList=new ArrayList<>();
		/*myList.add(cust);//java.lang.ArrayStoreException
		Customer cust=new Customer();
		cust.setCustId(516);
		cust.setCustName("Praveen");
		cust.setCustAdd("Banglore");
		*/
		myList.add("America");
		myList.add("India");
		myList.add("Pak");
	
		//Object obj[]=myList.toArray();
		System.out.println("List Elements are::"+myList);
		String[] str=new String[myList.size()];
		myList.toArray(str);
		System.out.println("Array Elements are::");
		for(int i=0;i<str.length;i++)
		System.out.println(str[i]);
		
	}
	
}
