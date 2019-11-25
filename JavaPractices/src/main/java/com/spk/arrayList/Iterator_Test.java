package com.spk.arrayList;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Iterator_Test {

	public static void main(String[] args) {
	
		
		String toBeRemoved[]={"java","perl"};
		List<String> myList=new ArrayList<>();
		
		myList.add("java");
		myList.add("perl");
		myList.add("c++");
		myList.add("python");
		myList.add("cobol");
		myList.add("praveen");
		System.out.println("\nBefore Removing::\n"+myList);
		System.out.println("\n");
		
		myList.removeAll(Arrays.asList(toBeRemoved));
		System.out.println(myList);
	}

}
