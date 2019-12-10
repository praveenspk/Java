package com.spk.array;

import java.util.ArrayList;
import java.util.List;

public class List_To_Array {

	public static void main(String[] args) {
	
		List<Integer> myList=new ArrayList();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		myList.add(5);
		myList.add(6);
		myList.add(7);
		myList.add(8);
		myList.add(9);
		myList.add(10);
		myList.add(11);
		myList.add(12);
		myList.add(13);
		myList.add(14);
		myList.add(15);
		System.out.println(myList);
		Integer[] arr=myList.toArray(new Integer[myList.size()]); 
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
