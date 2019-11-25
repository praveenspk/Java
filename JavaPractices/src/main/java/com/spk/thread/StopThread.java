package com.spk.thread;

class ThreadStop extends Thread {
	
	static {
		Thread t1=new Thread(){
			public void run() {
				System.out.println("");
			}
		};
	}
	
	
	
	private volatile boolean flag = true;

	public void stopRunning() {
		flag = false;
	}

	public void run() {
		while (flag) {
			System.out.println("In Running State,.......");
		}
		System.out.println("Thread in Stopped State.....");
	}

}

public class StopThread {
	public static void main(String[] args) {
		ThreadStop thread = new ThreadStop();
		thread.start();
		try {
			Thread.sleep(1000);

		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		thread.stopRunning();

	}

}
