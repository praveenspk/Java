package com.spk.printMes;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintMessage {

	public static void main(String[] args) {
		String name = "Praveen";
		PrintStream myout = new PrintStream(new FileOutputStream(FileDescriptor.out));
		myout.print("i love Java" + " ");
		System.out.format("%s", "Saggam" + name);
		System.out.println(" " + "Saggam");
		System.out.print(name);
		System.err.print("This is custom error message");

	}
}
