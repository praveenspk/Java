package com.spk.exception;

public class TryWithFinally {

	public static int method() {

		try {

			System.out.println("inside try block");

			return 10;
		} finally {

			System.out.println("inside finally block");
		}

	}

	public static void main(String[] args) {

		System.out.println(method());

	}

}