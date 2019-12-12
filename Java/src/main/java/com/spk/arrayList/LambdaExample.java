package com.spk.arrayList;

import java.util.Arrays;
import java.util.List;
/**
 * @author Praveen
 *
 */
public class LambdaExample {

	public static void main(String[] args) {
		Integer arr[]= {1,2,3,4,5,6,7,8};
		List<Integer> numbers=Arrays.asList(arr);
		//Conventional Way of Printing ArrayList
		for(int number:numbers) {
			System.out.println(number);
		}
		//Lambda Expression Printing ArrayList
   		numbers.forEach((Integer value)->System.out.println(value));
		
		//Lambda Expression Printing ArrayList
		numbers.forEach(value->System.out.println(value));
		//Lambda Expression(Method refernce) Printing ArrayList
		numbers.forEach(System.out::print);
	}
 
}
