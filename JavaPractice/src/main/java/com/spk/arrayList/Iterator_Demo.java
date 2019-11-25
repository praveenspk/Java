
package com.spk.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterator_Demo {

	public static void main(String[] args) {

		String removeEle = "PERL";
		List<String> myList = new ArrayList<String>();
		Iterator<String> itr = myList.iterator();
		myList.add("JAVA");
		myList.add(".NET");
		myList.add("PERL");
		myList.add("COBOL");
		myList.add("PASCAL");
		myList.add("C++");
		myList.add("ORACLE");
		myList.add("UNIX");
		System.out.println("Before Removing");
		System.out.println(myList);
		myList.removeAll(Arrays.asList(removeEle));
	
		System.out.println("After Remove");
		System.out.println(myList);
	}

}
