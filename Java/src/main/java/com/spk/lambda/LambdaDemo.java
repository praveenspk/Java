package com.spk.lambda;
/**
 * @author Praveen
 *
 */
public class LambdaDemo {
	
	public static void main(String[] args) {
		
	MyNumber myNum;
	myNum=()->156.25;
	System.out.println("Fixed Value::"+myNum.getValue());
	myNum=()->Math.random()*10;
	System.out.println("Random Value::"+myNum.getValue());
	System.out.println("=================================");
	myNum=()->Math.random()*10;
	System.out.println("Random Value::"+myNum.getValue());
	}
	
	
}
