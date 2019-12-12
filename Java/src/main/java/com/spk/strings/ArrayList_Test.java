package com.spk.strings;

import java.util.ArrayList;
import java.util.Arrays;
/**
 * @author Praveen
 *
 */
public class ArrayList_Test {
	public static void main(String[] args) {
		
		int[] arr1= {1,2,3,1,2,4,1,5,6};
		int[] arr2= {2,1,3,1,4,5,2,2,4};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		ArrayList result=new ArrayList<>();
		int i=0;
		int j=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]>arr2[j]) {
				j++;
			}else if(arr1[i]<arr2[j]) {
				i++;
			}else {
				result.add(arr1[i]);
				i++;
				j++;
			}
		}
		
		System.out.println(result);
	}

}
