package com.spk.arrayList;

import java.util.ArrayList;
import java.util.List;

public class List_Methods {

	public static void main(String[] args) {
	
	
		//add(-)
	 	List<String> myList=new ArrayList<String>();
		myList.add("Praveen");
		myList.add("Balaji");
		myList.add("Prasanth");
		myList.add("Siva");
		myList.add("Naseer");
		myList.add("Hari");
		myList.add(3,"Rajesh");
		System.out.println("List::"+myList);
		//remove()
		myList.remove("Hari");
		myList.remove(2);
		System.out.println(myList);
		//set()
		myList.set(2,"Gangadhar");
		System.out.println(myList);
		int i=myList.size();
		System.out.println(i);
		String[] str=new String[myList.size()];
		myList.toArray(str);
		for(int j=0;j<str.length;j++) {
		System.out.println(str[j]);
		
		
		}
	
	}

}
