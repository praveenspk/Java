package com.huawei.exception;

class Sample {
	public void display() {
		System.out.println("Hello ");
	}
}

public class NCDFE {
	public static void main(String[] args) {
		System.out.println("From Main() :");
		Sample sample = new Sample();
		sample.display();

	}

}
