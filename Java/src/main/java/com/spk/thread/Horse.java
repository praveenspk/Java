package com.spk.thread;
/**
 * @author Praveen
 *
 */
public class Horse implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

}
