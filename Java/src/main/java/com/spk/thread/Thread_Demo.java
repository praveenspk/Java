package com.spk.thread;

public class Thread_Demo {

	public static void odd() {
		System.out.println("Odd Thread : ");
		for (int i = 1; i < 20; i = i + 2) {
			System.out.print(i + " "); // printing odd numbers
		}
		System.out.println(); // TO break the line
	}

	public static void even() {
		try {
			Thread.sleep(3000); // thread on sleep for 300 millisecond
		} catch (InterruptedException e) // If there is any error it will show exception
		{
			System.out.println(e);
		}
		System.out.println("Even Thread : ");
		for (int i = 0; i < 21; i = i + 2) {
			System.out.print(i + " "); // printing even numbers
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// separately executing thread first odd will execute then even
		Thread oddstart = new Thread(() -> odd());
		Thread evenstart = new Thread(() -> even());

		evenstart.start();
		oddstart.start();

	}

}