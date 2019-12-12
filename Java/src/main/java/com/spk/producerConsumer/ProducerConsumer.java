package com.spk.producerConsumer;
/**
 * @author Praveen
 *
 */
public class ProducerConsumer {

	public static void main(String[] args) {

		Producer pc = new Producer();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {

				try {
					pc.producer();

				} catch (InterruptedException e) {
					e.getMessage();
				}

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pc.consumer();
				} catch (Exception ce) {
					ce.getMessage();
				}

			}
		});

	}

}
