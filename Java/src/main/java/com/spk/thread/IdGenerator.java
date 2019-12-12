package com.spk.thread;

import java.util.Random;
/**
 * @author Praveen
 *
 */
public class IdGenerator extends Thread {

	Random randID = new Random();
	private String idPrefix;

	public void idGenerator(String id) {
		this.idPrefix = id;
	}

	public void generateId() {
		System.out.println("User Name : " + idPrefix + randID.nextInt(9999));
		System.out.println("Password : " + randID.nextInt(9999));
	}

	@Override
	public void run() {
		synchronized (this) {
			generateId();
		}

	}

	public static void main(String[] args) {
		
		Thread t = new Thread(currentThread().getName());
		System.out.println(t);
		t.start();
	}

}
