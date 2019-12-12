package com.spk.test;
/**
 * @author Praveen
 *
 */
public class IntegerTest {

	public static void main(String[] args) {
		
		Integer i=new Integer(1) + new Integer(2)+ new Integer(4);
	
		System.out.println(i);
		switch(i) {
		case 7 :
			System.out.println("Three");
			break;
		default :
			System.out.println("Invalid");
		}
		
	}

}
