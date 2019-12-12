package com.spk.Collections.queue;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
/**
 * @author Praveen
 *
 */
public class CollectionQueue {
	public static void main(String args[]) {
		Deque<String> arrayDeque = new ArrayDeque<String>(2);
		arrayDeque.add("1");
		arrayDeque.add("2");
		arrayDeque.add("3");
		arrayDeque.add("4");
		arrayDeque.add("5");

		System.out.println(arrayDeque);
		System.out.println(Collections.asLifoQueue(arrayDeque));
	}
}