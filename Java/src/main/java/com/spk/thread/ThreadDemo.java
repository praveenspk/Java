package com.spk.thread;
/**
 * @author Praveen
 *
 */
public class ThreadDemo {

	public static void main(String[] args) {

		new ThreadDemo().go();
	}

	private void go() {

		Runnable run = new Runnable() {

			@Override
			public void run() {
				System.out.println("Foo");
			}
		};

		Thread thread = new Thread(run);
		thread.start();
		thread.start();
		

	}

}
