package com.spk.hashCode;
/**
 * @author Praveen
 *
 */
class StudentDemo {
	int Sid;
	String Name;

	public int hashCode() {
		return Sid;
	}

	public void getStudentDetails() {
		System.out.println("StudentId :" + Sid + " " + "Name " + Name);
	}

}

public class Demo_HashCode {

	public static void main(String[] args) {

		StudentDemo St = new StudentDemo();
		St.Sid = 513;
		St.Name = "PRAVEEN";
		St.getStudentDetails();
		
		System.out.println(St.hashCode());
		
		System.out.println(System.identityHashCode(St));
		
		
		
	}
}
