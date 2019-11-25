package com.spk.thread;

/*class Demo_2 extends Thread {

	Thread t=new Thread(new Runnable() {
		
		@Override
		public void run() {
		
			System.out.println("My Thread is Running....");
		}
	});
	
}
*/

public class Test_2 {
	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {

				System.out.println("My Thread is Running....");
			
			}
		});
	}
}