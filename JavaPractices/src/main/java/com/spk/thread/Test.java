package com.spk.thread;


class Demo extends Thread{
	
	public void run() {
		System.out.println("Thread is Running...........");
		
	}
}
public class Test {

	public static void main(String[] args) {
		
		Thread demo=new Demo();
		demo.start();
		System.out.println(demo.getName());
		//demo.destroy();
		//demo.resume();
		//demo.suspend();
		System.out.println(demo.getId());
		System.out.println(demo.interrupted());
	}

}
