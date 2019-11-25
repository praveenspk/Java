package com.spk.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionCheck {
	public static void main(String args[]) {
		List list = new ArrayList();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");

		Collection checkedList = Collections.checkedCollection(list, String.class);
		System.out.println("Checked list: " + checkedList);

		list.add(10); 
		//checkedList.add(10); 
	}
}