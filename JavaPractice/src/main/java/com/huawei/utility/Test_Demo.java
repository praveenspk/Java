package com.huawei.utility;

class Main_demo {
	public void display(String str) {
		System.out.println("Calling from Main(): " + str);
	}

	public void setData() {
		System.out.println(" From setData()");
	}
}

class Sub_Demo extends Main_demo {

	static {
		System.out.println("From Sub :");
	}

	public void display(String str) {
		System.out.println("Calling from SubMain() : " + str);
	}

	public void getData() {
		System.out.println(" From getData()");
	}

}

public class Test_Demo {
	public static void main(String[] args) {

		Sub_Demo demo = new Sub_Demo();
		// demo.display("Huawei");
		// demo.setData();
		// demo.getData();
		
		System.out.println(TestStatic.name);
		TestStatic.getData();

	}
}
