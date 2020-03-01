/**
 * 
 */
package com.spk.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Praveen
 *
 */
public class ArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Praveen");
		names.add("Vardhan");
		names.add("Thimothy");

		new Thread() {
			@Override
			public void run() {
				Iterator<String> itr = names.iterator();
				while (itr.hasNext()) {
					String str = itr.next();
					System.out.println(str);
				}

			}

		}.start();
	
		
		new Thread() {

			@Override
			public void run() {
				System.out.println("Adding ");
				names.add(1,"Neelu");
				names.add("Mounika");

			}

		}.start();

	}

}
