package com.spk.exception;

import java.io.IOException;
/**
 * @author Praveen
 *
 */
class Parent {
	void sum(int a, int b) throws IOException {
		int c = a / b;

	}
}

public class CheckException extends Parent {

	public static void main(String[] args) {

		Parent p=new Parent();
		try {
			p.sum(10, 0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
