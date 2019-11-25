package com.spk.array;

public class ArrayOperations_Test {

	// Can you pass the negative number as an array size?
	static {
		// int[] arr = new int[-5]; //java.lang.NegativeArraySizeException
		int[] arr = new int[5];
		arr[0] = 123;
		arr[3] = 8767;

		for (int i : arr) {
			System.out.println(i);
		}

	}
	
	static {
		int[] array=new int[100];
		int[] arr=new int[10];
		arr=array;
		
	}

	// What is ArrayStoreException in java? When you will get this exception.
	static void arrayStoreException() {
		Object[] stringArray = new String[5];
		stringArray[1] = "JAVA";
		stringArray[2] = 100; // will throw java.lang.ArrayStoreException. because we are inserting integer
								// element into an array of strings
		for (Object str : stringArray) {
			System.out.println(str);
		}

	}

	// What is an anonymous array
	static void anonymousArray() {

		for (String str : new String[] { "Huawei", "Nokia", "Ericson", "Samsung" }) {
			System.out.println(str);

		}

	}

	public static void main(String[] args) {
		// arrayStoreException();
		anonymousArray();

	}
}
