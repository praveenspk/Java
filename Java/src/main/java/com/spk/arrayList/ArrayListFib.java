package com.spk.arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Praveen
 *
 */
public class ArrayListFib {

	public static void fib(int num) {
		int first = 0, last = 1, next;
		List list = new ArrayList();
		System.out.println("Fibonacci Series is :: ");
		for (int i = 0; i < num; i++) {
			list.add(first);
			System.out.println(list);
			next = first + last;
			first = last;
			last = next;

		}
	}

	public static void main(String[] args) {

		fib(10);

	}

}
