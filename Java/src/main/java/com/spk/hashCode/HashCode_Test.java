package com.spk.hashCode;

class Student {

	@Override
	public String toString() {
		return "Student [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}

public class HashCode_Test {

	public static void main(String[] args) {

		Student st = new Student();
		Student st2 = new Student();
		System.out.println(st.hashCode() + " " + System.identityHashCode(st));
		System.out.println(st2.hashCode() + " " + System.identityHashCode(st2));
		System.out.println(st.toString() + "  " + st2.toString());

	}

}
