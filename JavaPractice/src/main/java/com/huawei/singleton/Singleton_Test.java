package com.huawei.singleton;

public class Singleton_Test {

	private static Singleton_Test obj = null;
	// private static Singleton_Test obj=new Singleton_Test();

	private Singleton_Test() {
		System.out.println("Private Constructor : ");

	}

	static Singleton_Test getObject() {
		if (obj != null)
			obj = new Singleton_Test();
		return obj;

	}

	private volatile static Singleton_Test object;

	public static Singleton_Test getInstance() {
		if (object == null) {
			// To make thread safe
			synchronized (Singleton_Test.class) {
				// check again as multiple threads
				// can reach above step
				if (obj == null)
					obj = new Singleton_Test();
			}
		}
		return obj;
	}

	public static void main(String[] args) {
		// Singleton_Test newTest = Singleton_Test.getObject();
		// System.out.println(newTest);

		Singleton_Test test = Singleton_Test.getInstance();
		System.out.println(test);

		// String to Integer
		String str = "10";
		Integer result = Integer.valueOf(str);
		System.out.println(result);

		// String to int
		String num = "10";
		int result1 = Integer.parseInt(num);
		System.out.println(result);

	}

}
