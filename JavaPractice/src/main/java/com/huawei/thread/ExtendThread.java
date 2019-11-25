package com.huawei.thread;

class ThreadDemo_Test extends Thread {

	public void run() {
		Thread thread = new Thread();
		System.out.println(thread.getName());
		getData();
	}

	static void getData() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.activeCount() + " : " + i);
		}

	}
}

class ImplementsRunnable implements Runnable {

	@Override
	public void run() {
		Thread thread = new Thread();
		for (int i = 0; i < 5; i++) {
			System.out.println(thread.getName() + " : " + i);

		}

	}

}

public class ExtendThread {
	public static void main(String[] args) {
		ThreadDemo_Test test = new ThreadDemo_Test();
		System.out.println("Extends Thead : ");
		test.start();
		ImplementsRunnable impRun = new ImplementsRunnable();
		Thread t = new Thread(impRun);
		System.out.println("Implements Runnable : ");
		t.start();

	}

}
