package com.spk.inheritance;

public class OuterClass {

	private int outerA = 10;
	protected int outerB = 20;
	public int outerC = 30;

	public class InnerClass {

		private int innerA = 10;
		protected int innerB = 20;
		public int innerC = 30;
		static final int innerCA = 30;

		public void show() {
			System.out.println("In a nested class method : " + innerA);
		}

	}

	static class USBCable {
		static int usb2 = 2;
		static int usb3 = 1;

		int getTotalPorts() {
			return usb2 + usb3;
		}

	}
}
