package com.spk.thread;

/*class Demo_Thread implements Runnable{

	@Override
	public void run() {
		
		System.out.println("Hello Thread");
	}
	
}
*/
public class Test_4 {

	public static void main(String[] args) {
	
		Thread t=new Thread(() -> {System.out.println("My Runnable");}); // lambda expressions
		t.start();
		
	}

}
