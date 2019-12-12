package com.spk.thread;

//Java program to demonstrate deadlock
//using Main thread
/**
 * @author Praveen
 *
 */
public class Deadlock {
	public static void main(String[] args) {
		try {

			System.out.println("Entering into Deadlock : "+Thread.MAX_PRIORITY);

			Thread.currentThread().join();

			// the following statement will never execute
			System.out.println("This statement will never execute");

		}

		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
