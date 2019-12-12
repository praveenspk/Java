package com.spk.test;
/**
 * @author Praveen
 *
 */
public class InterviewProgram {

	public static void main(String[] args) {

		//main(new String[] { "a", "b", "c" });
		int randomNum = (int) (Math.random() * 10);

		if (randomNum >= 8)
			System.exit(0);

		System.out.print("Heyhey!");
		main(new String[] { "Praveen", "Vardhan", "Thimothy" });
	}

}