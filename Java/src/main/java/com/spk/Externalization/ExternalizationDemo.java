package com.spk.Externalization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
/**
 * @author Praveen
 *
 */
public class ExternalizationDemo implements Externalizable {
	String name;
	String addrs;
	long number;
	public ExternalizationDemo(String name, String addrs, long number) {
		super();
		this.name = name;
		this.addrs = addrs;
		this.number = number;
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		name=(String) in.readObject();
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeObject(name);
		out.writeLong(number);
	}
	
	

	private static final String filePath="Demo.txt";
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
	
		ExternalizationDemo d=new ExternalizationDemo("Praveen", "Pulivendula", 9490137902L);
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		FileInputStream fis=null;
		ObjectInput ois=null;
		fos=new FileOutputStream(filePath);
		oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		System.out.println("File Saved Successfully");
		fis=new FileInputStream(filePath);
		ois=new ObjectInputStream(fis);
		ExternalizationDemo d2=(ExternalizationDemo) ois.readObject();
		System.out.println("File Downloaded....");
		oos.close();
		ois.close();
	}
}
