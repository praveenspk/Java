package com.spk.utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/* 	1. Using new keyword : } �� constructor gets called
   	2.Using newInstance() method of Class class : } �� constructor gets called
	3.Using newInstance() method of Constructor class : } �� constructor gets called
	4.Using clone() method : } �� no constructor call
	5.Using deserialization : } �� no constructor call*/

public class Emp_ObjectCreation {
	public static void main(String... args) throws Exception {

		// Way 1 : By using new keyword
		Employee emp1 = new Employee();
		emp1.setName("Praveen");
		emp1.setId(84119411);
		System.out.println(emp1 + " : By using new keyword , hashcode : " + emp1.hashCode());

		// Way 2 : By using Class class's newInstance() method
		Employee emp2 = (Employee) Class.forName("com.huawei.utility.Employee").newInstance();
		// Or we can simply do this
		// Employee emp2 = Employee.class.newInstance();
		emp2.setName("Kumar");
		emp2.setId(84119411);
		System.out.println(emp2 + " : By using Class class's newInstance() method , hashcode : " + emp2.hashCode());

		// Way 3 : By using Constructor class's newInstance() method
		Constructor<Employee> constructor = Employee.class.getConstructor();
		Employee emp3 = constructor.newInstance();
		emp3.setName("Suresh");
		emp3.setId(84119411);
		System.out
				.println(emp3 + "  By using Constructor class's newInstance() method , hashcode : " + emp3.hashCode());

		// Way 4 : By using clone() method
		Employee emp4 = (Employee) emp3.clone();
		emp4.setName("Vardhan");
		emp4.setId(84119411);
		System.out.println(emp4 + " : By using clone() method , hashcode : " + emp4.hashCode());

		// Way 5 : By using Deserialization
		// Serialization
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.obj"));
		out.writeObject(emp4);
		out.close();
		// Deserialization
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.obj"));
		Employee emp5 = (Employee) in.readObject();
		in.close();
		emp5.setName("Mummy");
		emp5.setId(898554);
		System.out.println(emp5 + " : By using Deserialization , hashcode : " + emp5.hashCode());
	}

}