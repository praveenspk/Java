package com.spk.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * @author Praveen
 *
 */
class Task implements Runnable {

	String taskName;

	public Task(String taskName) {
		super();
		this.taskName = taskName;
	}

	public void printThread(String task) {
		System.out.println(Thread.currentThread().getName() + " Performed task " + task);
	}

	@Override
	public void run() {
		printThread(this.taskName);

	}

}

public class ThreadPool {
	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(5);
		Task task = new Task("My Thread");

		for (int i = 0; i < 20; i++) {
			executor.execute(task);
		}
		executor.shutdown();

	}

}
