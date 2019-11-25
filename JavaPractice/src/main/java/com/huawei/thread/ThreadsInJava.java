package com.huawei.thread;

class Thread1 extends Thread {
	public void run() {
		for (int i = 0; i <= 1000; i++) {
			System.out.println(i);
		}
	}
}

class Thread2 extends Thread {
	public void run() {
		for (int i = 1001; i <= 2000; i++) {
			System.out.println(i);
		}
	}
}

public class ThreadsInJava {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		t1.start();
		Thread2 t2 = new Thread2();
		t2.start();

	}

}
