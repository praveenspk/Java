package com.spk.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/**
 * @author Praveen
 *
 */
class Dog implements Serializable{
	int i=0;
	int j=143;
	String name="Praveen";
	
}


public class Serialization_Demo {
	static final String filePath="sample.ser";
	public static void main(String[] args) {
		Dog d=new Dog();
		try {
		FileOutputStream fos=new FileOutputStream(filePath);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		System.out.println("Java Object Saved into file successfully");
		}catch(IOException ie) {
			ie.printStackTrace();
		}
	}

}
