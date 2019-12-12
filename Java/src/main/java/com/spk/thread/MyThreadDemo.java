package com.spk.thread;
/**
 * @author Praveen
 *
 */
class Test1 implements Runnable {

	@Override
	public void run() {
		System.out.println("The priority of the current thread=" + Thread.currentThread().getPriority());

	}
	public void getData() throws InterruptedException {
		Thread t1 = new Thread();
		System.out.println(t1.getName());
		t1.sleep(1000);
		
	}

}

public class MyThreadDemo {

		public static void main(String[] args) throws InterruptedException   {
		Test1 t = new Test1();
		t.getData();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		t1.setPriority(9);
		System.out.println(t1.getPriority());
		
		t1.start();
		//t1.sleep(10000);
		t2.start();

	}

}