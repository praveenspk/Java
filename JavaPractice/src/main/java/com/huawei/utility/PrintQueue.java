package com.huawei.utility;

import java.lang.reflect.Field;

public class PrintQueue {
	
	static void getString(String str) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Field valueField=String.class.getDeclaredField("value");
		valueField.setAccessible(true);
		char[] c=(char[]) valueField.get(str);
		c[1]='s';
		System.out.println(str);
	}
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		getString("Praveen");
		
		System.out.println("out");
		System.err.println("err");

		for (int i = 0; i < 10; i++) {
			System.out.println("out");
			System.err.println("err");
		}
	}
}