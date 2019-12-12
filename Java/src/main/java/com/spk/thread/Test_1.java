package com.spk.thread;
/**
 * @author Praveen
 *
 */
 class Demo1 implements Runnable {

	@Override
	public void run() {
	
		System.out.println("Thread is running.....!!!");
	}

}

public class Test_1{
	public static void main(String[] args) {
		
		Demo1 demo=new Demo1();
		Thread thread=new Thread(demo);
		thread.start();
	}
}