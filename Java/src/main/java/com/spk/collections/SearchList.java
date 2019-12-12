package com.spk.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * @author Praveen
 *
 */
public class SearchList {

	
	private static void bulkOperationDemo() {
		 List<String> list = new ArrayList<>();
		 list.add("element 1");
		 list.add("element 2");
		 list.add("element 3");
		 list.add("element 4");

		 // addAll() - Appends all of the elements in the specified collection to
		 // the end of this list,
		 // in the order that they are returned by the specified collection's
		 // iterator (optional operation).
		 List<String> union = new ArrayList<>();
		 union.addAll(list);
		 printMessage(union, "addALL operation example ");

		 // Retains only the elements in this list that are contained in
		 // the specified collection (optional operation).
		 List<String> intersection = new ArrayList<>();
		 intersection.add("element 1");
		 intersection.add("element 2");
		 intersection.add("element 3");
		 intersection.add("element 4");
		 System.out.println("retainAll -- > " + intersection.retainAll(list));

		 // Removes from this list all of its elements that are
		 // contained in the specified collection (optional operation).
		 List<String> difference = new ArrayList<>();
		 difference.add("element 1");
		 difference.add("element 2");
		 difference.add("element 3");
		 difference.add("element 4");
		 System.out.println("removeAll operation example ---> " + difference.removeAll(list));
		 printMessage(difference, "removeAll operation example ");

		 List<String> checking = new ArrayList<>();
		 checking.add("element 1");
		 checking.add("element 2");
		 checking.add("element 3");
		 checking.add("element 4");
		 System.out.println("containsAll operation example ---- > " + checking.containsAll(list));
		}

		private static void printMessage(List<String> list, String message) {
		 list.forEach(key -> System.out.println(message + key));
		}
	
	
	static void rangeViewDemo(){
		 List<String> list = new LinkedList<>();
		   list.add("element 1");
		   list.add("element 2");
		   list.add("element 3");
		   list.add("element 4");
		   
		   //If fromIndex and toIndex are equal, the returned list is empty.) 
		   for(String str : list.subList(0, 0)){
		     System.out.println(" sub list demo --" + str);
		   }
		   
		   for(String str : list.subList(0, 1)){
		     System.out.println(" sub list demo --" + str);
		   }
		}
	
	public static void main(String[] args) {
		int index;
		
		bulkOperationDemo();
		rangeViewDemo();
		List<String> searchList = new ArrayList();
		searchList.add("element 1");
		searchList.add("element 2");
		searchList.add("element 3");
		searchList.add("element 4");

		System.out.println(searchList);

		index = searchList.indexOf("element 2");
		System.out.println(index);
		index=searchList.lastIndexOf("element 4");
		System.out.println(index);
		
	}

}
