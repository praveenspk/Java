package com.spk.javaMaster;

public class BigInteger_Sum {
	static void getBigSum(Long arr[]) {
		long total = 0;
        for(int arr_i=0; arr_i <arr.length; arr_i++){
            total += arr[arr_i];
        }
          System.out.println(total);
    }
	
	public static void main(String[] args) {
	
		Long arr[]= {1000000001L ,1000000002L,1000000003L,1000000004L,1000000005L};
		getBigSum(arr);
	}
	

}
