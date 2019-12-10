package com.spk.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Deserialization {

	private void readEmpObject() throws IOException, FileNotFoundException, ClassNotFoundException {
		FileInputStream fileInput = null;
		ObjectInputStream objectInput = null;
		try {
			fileInput = new FileInputStream("employee.ser");
			objectInput = new ObjectInputStream(fileInput);
			Employee emp = new Employee();
			emp = (Employee) objectInput.readObject();
			System.out.println("Successfully read employee objcet from file ");
			// System.out.println(emp.getEmpId() + emp.getName() + emp.getDept() +
			// emp.getMobile());
			System.out.println(emp.toString());

		} finally {

			if (objectInput != null) {
				objectInput.close();
			}

		}

	}

	private void writeEmpObject(Employee emp) throws IOException, FileNotFoundException, ClassNotFoundException {
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;

		try {

			fileOutputStream = new FileOutputStream(new File("employee.ser"));
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(emp);
			System.out.println("File Writting done!!!!!");

		} finally {
			if (objectOutputStream != null) {
				objectOutputStream.close();
			}

		}

	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Employee emp = new Employee();
		emp.setEmpId("s84119411");
		emp.setName("Praveen");
		emp.setDept("GSC");
		emp.setMobile(9490137902L);
		
		emp.setEmpId("s84119412");
		emp.setName("Rathi");
		emp.setDept("GSC");
		emp.setMobile(9970154894L);

		Deserialization obj = new Deserialization();
		obj.writeEmpObject(emp);

		obj.readEmpObject();
	}
}
