package com.spk.producerConsumer;

import java.util.LinkedList;

public class Producer {
	LinkedList<Integer> list = new LinkedList<>();
	int capacity = 0;
	int value = 0;

	public void producer() throws InterruptedException {
		while (true) {
			synchronized (this) {
				while (list.size() == capacity) {
					wait();
					System.out.println("Producer produced : " + value);
				}
				list.add(value++);
				notify();
				Thread.sleep(1000);
			}

		}
	}

	public void consumer() throws InterruptedException {

		while (true) {

			synchronized (this) {
				while (list.size() == 0) {
					wait();
				}
				list.removeFirst();
				System.out.println("Consumed : " + value);
				notify();
				Thread.sleep(1000);
			}

		}

	}

}