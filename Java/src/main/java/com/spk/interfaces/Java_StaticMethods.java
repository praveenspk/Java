package com.spk.interfaces;
/**
 * @author Praveen
 *
 */
public interface Java_StaticMethods {

	String JAVA7_CONNSTANT="Java7";
	public abstract void printLine(String printStr);

	public default void printDefaultContent(String defaultContent){
		System.out.println("Default Content Posted Here.."+defaultContent);
	}
	public static double calculateInterest(double amt){
		return amt*0.5;
	}
	
	/*private void printIntegerLogging(String message){
		System.out.println("Printed internal Loggings."+message);
	
	}*/
}

