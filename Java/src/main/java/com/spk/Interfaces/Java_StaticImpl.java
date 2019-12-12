package com.spk.Interfaces;
/**
 * @author Praveen
 *
 */
public class Java_StaticImpl implements Java_StaticMethods {

	public Java_StaticImpl() {
	System.out.println("Entered into Class");
	}
	@Override
	public void printLine(String printStr) {
	}
	public static void main(String[] args) {
	
		Java_StaticMethods methods=new Java_StaticImpl();
		methods.printDefaultContent("Hello Java");
	
	}
}
