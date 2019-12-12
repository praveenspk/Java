package com.spk.thread;
/**
 * @author Praveen
 *
 */
public class Pass {

	public static void main(String[] args) {
		int x=10;
		Pass p=new Pass();
		System.out.println("Main() X=" + x);
		p.doStuff(x);
		System.out.println("Main() X=" + x);
	}

	private void doStuff(int x) {
		System.out.println("doStuff X= "+ ++x);
		
		
	}


}
