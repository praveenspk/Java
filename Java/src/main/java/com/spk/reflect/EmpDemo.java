package com.spk.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author Praveen
 *
 */
public class EmpDemo {

	public static void main(String[] args) throws Exception, RuntimeException,NoSuchMethodException {
		
		Employee emp=new Employee();
		Class cls=emp.getClass();
		Method methods[]=cls.getMethods();
		Constructor constructor = cls.getConstructor();
		
		System.out.println("Class : "+cls);
		System.out.println("Methods of that "+cls+" is : ");
		for(Method method:methods) {
			System.out.println(method.getName());
		}

		System.out.println("Constucors of that "+cls.getSimpleName()+" Is :"+constructor.getName());
		//Method methodCall=cls.getDeclaredMethod("email",String.class);
		//methodCall.invoke(emp, "Praveen");
		Field field=cls.getDeclaredField("email");
		field.set(emp, "praveen@spk");
		field.setAccessible(true);
	}
	
}
