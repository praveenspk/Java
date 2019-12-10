package com.spk.gc;

public class Test {
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.hashCode());
		System.out.println(t.toString());

		t = null;
		// calling garbage collector
		System.gc();

		System.out.println("end");

	}

	public String toString() {
		return getClass().getName() + "@" + Integer.toHexString(hashCode());
	}

	@Override
	protected void finalize() {
		System.out.println("finalize method called");
	}
}