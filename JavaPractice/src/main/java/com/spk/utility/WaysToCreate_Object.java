package com.spk.utility;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class WaysToCreate_Object {

	public WaysToCreate_Object() {
	}

	public static WaysToCreate_Object getObject() {
		WaysToCreate_Object obj = null;
		obj = new WaysToCreate_Object();
		return obj;
	}

	public void display(String message) {

		System.out.println("Object Created and display() method invoked  : " + message);
	}

	@Override
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}

	public static void main(String[] args) throws Exception{
		// way1 : New Keyword
		WaysToCreate_Object objNew = new WaysToCreate_Object();
		objNew.display("New Keyword");

		// way2 : Factory Method
		WaysToCreate_Object objFactory = WaysToCreate_Object.getObject();
		objFactory.display("Factory Method");

		// Way 3 : Class.forName() and newInstance() method of Constructor class

		try {
			WaysToCreate_Object objNewInstance = WaysToCreate_Object.class.newInstance();
			objNewInstance.display("newInstance() method of Class.forName class ");
			// OR
			Constructor<WaysToCreate_Object> constructor = WaysToCreate_Object.class.getConstructor();
			WaysToCreate_Object objConstructor = constructor.newInstance();
			objConstructor.display("newInstance() method of Constructor class");

			// OR
			WaysToCreate_Object objClass = (WaysToCreate_Object) Class
					.forName("Java_Collections.src.com.huawei.utility.WaysToCreate_Object ").newInstance();

			objClass.display("Class.forName ");

		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | NoSuchMethodException
				| SecurityException | IllegalArgumentException | InvocationTargetException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}

		// Way4 : Cloning
		/*
		 * WaysToCreate_Object objClone=(WaysToCreate_Object) objNew.clone();
		 * objClone.display("Clone concept ");
		 */
		WaysToCreate_Object anotherObject = new WaysToCreate_Object();
		WaysToCreate_Object object = (WaysToCreate_Object) anotherObject.clone();
		object.display("Clone concept ");

	}

}
