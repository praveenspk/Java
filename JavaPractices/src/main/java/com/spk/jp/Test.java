
package com.spk.jp;

public class Test {

	static void call_Array(int i, int arr[]) {
		arr[i] = 6;
		i = 5;
	}

	public static void main(String[] args) {
		
		int[] arr={1,2,3,4};
		call_Array(arr[0], arr);
		System.out.println(arr[0]+" "+arr[1]);
	}

}
