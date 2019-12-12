package com.spk.exception;
/**
 * @author Praveen
 *
 */
class TestUsrDefinedException {
	static void validate(int age) throws InvalidAgeException {
		if (age < 18)
			throw new InvalidAgeException("Invalid age");
		else
			System.out.println("welcome to vote");
	}

	public static void main(String args[]) {
		try {
			validate(13);
		} catch (Exception m) {
			System.out.println("Exception occured: " + m);
		} finally {
			System.out.println("This block will be Executed");
		}
	}
}