package com.spk.singleton;

public class BillPughSingleton {

	private BillPughSingleton() {
		System.out.println("Private Constructor");
	}

	private static class SingletonHelper {

		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}

	public static void main(String[] args) {
		BillPughSingleton test = BillPughSingleton.getInstance();

	}
}
