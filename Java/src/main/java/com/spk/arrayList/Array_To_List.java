package com.spk.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import javax.swing.plaf.synth.SynthSeparatorUI;

/**
 * @author Praveen
 *
 */
public class Array_To_List {

	public static void main(String[] args) {
	String[] countries= {"INDIA","AUSTRAILIA","AMERICA","ENGLAND","RUSSIA"};
	
	/*for(int i=0;i<countries.length;i++) {
	System.out.println("Array elements::"+countries[i]);
	}*/

	List<String> myList=new ArrayList<>(Arrays.asList(countries));
	
	myList.add(3, "Cam");
	//System.out.println("list:"+myList);
	//myList.forEach(System.out::println);
	//System.out.println(myList.get(3));
	
	String[] capital= {"DEHLI","MELBORN","WC","ENGLAND","RUSSIA"};
	
	LinkedList<String> list=new LinkedList<>(Arrays.asList(capital));
	list.add(1, "hsg");
	list.forEach(System.out::println);
	
	}
}
