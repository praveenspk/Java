package com.spk.thread;

public class ThreadDemoTest {

	public static void main(String[] args) throws Exception {

		Thread thread = new Thread(() -> {
			// System.out.println("Even Thread : ");
			for (int i = 0; i < 21; i = i + 2) {
				System.out.print(i + " "); // printing even numbers
				try {
					Thread.sleep(1500);

				} catch (Exception e) {

				}

			}
		});

		Thread thread1 = new Thread(() -> {
			// System.out.println("Odd Thread : ");
			for (int i = 1; i < 20; i = i + 2) {
				System.out.print(i + " ");// printing odd numbers
				try {
					Thread.sleep(1500);

				} catch (Exception e) {

				}
			}
			System.out.println(); // TO break the line

		});

		thread.start();
		try {
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}
		thread1.start();

		thread.join();
		thread1.join();
	}

}
