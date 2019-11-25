package com.spk.hashCode;

public class Student1 {
	static int last_roll = 100;
	int roll_no;

	// Constructor
	Student1() {
		roll_no = last_roll;
		last_roll++;
	}

	// Overriding hashCode()
	@Override
	public int hashCode() {
		return roll_no;
	}

	// Driver code
	public static void main(String args[]) {
		Student1 s = new Student1();

		// Below two statements are equivalent
		System.out.println(s);
		System.out.println(s.toString());
		System.out.println(s.getClass().getName());

	}
}