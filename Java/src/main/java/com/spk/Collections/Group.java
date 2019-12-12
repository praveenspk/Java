package com.spk.Collections;

import java.util.HashSet;
/**
 * @author Praveen
 *
 */
public class Group extends HashSet<Persons>{

	public static void main(String[] args) {
		Group g=new Group();
		g.add(new Persons("Praveen"));
		g.add(new Persons("Vardhan"));
		g.add(new Persons("Thimothy"));
		g.add(new Persons("Suresh"));
		System.out.println("Total size... : "+g.size());
		
	}
	/*public boolean add(Object obj) {
		System.out.println("Adding " + obj);
		return super.add(obj);
	}*/

}
