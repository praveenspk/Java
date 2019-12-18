package com.spk.ds;

import com.spk.ds.test.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.addNode(12);
		list.addNode(45);
		list.addNode(457);
		list.addNode(78);
		list.addNode(567);
		list.addNode(28);
		list.addNode("asdasd");
		//System.out.println(list.display(list.getHead()));
		list.displayList();
	}

}
