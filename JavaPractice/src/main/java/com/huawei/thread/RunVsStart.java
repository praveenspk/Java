package com.huawei.thread;

class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("I am executed by : " + currentThread().getName());
	}
}

public class RunVsStart {

	public static void main(String[] args) {
		MyThread thread = new MyThread();
		// Using Run()
		thread.run();
		// Using Start()
		thread.start();
		thread.run();

		try {
			thread.run();
			thread.start();

			thread.start();

		} catch (IllegalThreadStateException ie) {
			ie.printStackTrace();
			System.out.println("Exception Occured at : ");

		}

	}

}
