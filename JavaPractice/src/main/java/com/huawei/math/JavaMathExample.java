package com.huawei.math;

public class JavaMathExample {
	static double a = 498.78;
	static double b = 583.6;

	static void getMathFun() {
		double x = 39.89;
		double y = 4;
		System.out.println(Math.E);
		System.out.println("Absolute : " + Math.abs(x));
		System.out.println(Math.acos(x));
		System.out.println("Square Root : " + Math.sqrt(x));
		System.out.println("Cos : " + Math.cos(y));
		System.out.println("Degree  : " + Math.toDegrees(x) + "Radious  : " + Math.toRadians(x));
		System.out.println("SubtractExact : " + Math.subtractExact(7865798900L, 456789098765L));
		System.out.println("Ceil : " + Math.ceil(y) + "Floor : " + Math.floor(x));

	}

	static {

		System.out.println("Log10() : " + Math.log10(a));
		System.out.println("Hypot : " + Math.hypot(a, b));
	}

	public static void main(String[] args) {

		getMathFun();

	}
}
