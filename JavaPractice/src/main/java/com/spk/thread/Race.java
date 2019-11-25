package com.spk.thread;

public class Race {

	void go(Thread t) {
		t.start();
	}

	public static void main(String[] args) {

		Horse horse = new Horse();
		Thread t1 = new Thread(horse, "Praveen");
		Thread t2 = new Thread(horse, "Neelu");
		new Race().go(t2);
		t1.start();
		//t2.start();
		
		/*
		 * PraveenException in thread "main" Neelu java.lang.IllegalThreadStateException
		 */

	}
}
