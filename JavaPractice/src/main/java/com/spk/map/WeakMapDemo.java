package com.spk.map;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakMapDemo {

	public static void main(String[] args) throws InterruptedException {
	WeakHashMap wMap=new WeakHashMap<>();
	Customer cust=new Customer(516,"Praveen","AP");
	//HashMap wMap=new HashMap<>();
	wMap.put(cust, "Customer Details");
	cust=null;
	System.out.println(wMap);
	System.gc();
	//System.runFinalization();
	Thread.sleep(2000);
	System.out.println(wMap);
		
	}

}
