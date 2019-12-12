package com.spk.thread;
/**
 * @author Praveen
 *
 */
class Shared {
	
	synchronized void waitMethod() {

		Thread thread = Thread.currentThread();

		System.out.println(thread.getName() + " : is releasing the lock and going to wait");
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(thread.getName() + " has been notified and acquired the lock back");
	}

	synchronized void notifyOneThread() {
		Thread t = Thread.currentThread();

		notify();

		System.out.println(t.getName() + " has notified one thread waiting for this object lock");
	}

	synchronized void notifyAllThread() {
		Thread thread = new Thread();
		notifyAll();
		System.out.println(thread.getName() + " has notified All threads waiting for this object lock ");
	}
}

public class MainClass {
	public static void main(String[] args) {
		final Shared share = new Shared();

		Thread t = new Thread() {

			@Override
			public void run() {
				share.waitMethod();
			}

		};
		System.out.println("I am executed by : " + t.getName());

		t.start();
		Thread t2 = new Thread() {
			@Override
			public void run() {
				share.waitMethod();
			}
		};

		System.out.println("I am executed by : " + t2.getName());

		t2.start();

		Thread t3 = new Thread() {
			public void run() {
				share.waitMethod();
			}
		};
		System.out.println("I am executed by : " + t3.getName());

		t3.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Thread t4 = new Thread() {
			public void run() {
				share.notifyOneThread();
			}
		};
		System.out.println("I am executed by : " + t4.getName());
		t4.start();
		
		Thread thread = new Thread() {
			@Override
			public void run() {
				share.notifyAllThread();
			}
		};
		thread.start();

	}

}
