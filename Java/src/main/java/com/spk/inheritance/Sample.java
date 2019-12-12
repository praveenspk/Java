package com.spk.inheritance;
/**
 * @author Praveen
 *
 */
public class Sample {

	public static void main(String[] args) {

		OuterClass cls = new OuterClass();
		System.out.println(cls.outerB + cls.outerC);
		OuterClass.InnerClass clas = cls.new InnerClass();
		System.out.println(clas.innerB + clas.innerC);

		OuterClass.InnerClass in = new OuterClass().new InnerClass();
		in.show();

		OuterClass.USBCable usb = new OuterClass.USBCable();
		System.out.println("Total Ports available : " + usb.getTotalPorts() + usb.usb2 + usb.usb3);

	}

}
