package com.spk.exception;
/**
 * @author Praveen
 *
 */
public class TryWithoutCatch {

	public static void main(String[] args) {

		try {

			System.out.println("inside try block");

		} finally {

			System.out.println("inside finally block");
		}

	}

}