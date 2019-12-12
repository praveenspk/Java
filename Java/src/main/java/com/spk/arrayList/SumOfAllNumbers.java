package com.spk.arrayList;

import java.util.Arrays;
import java.util.List;
/**
 * @author Praveen
 *
 */
public class SumOfAllNumbers {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		System.out.print(sumAll(numbers));
		int total = numbers.stream().mapToInt(i -> i.intValue()).sum();
		System.out.print(total);
 
		total = numbers.stream().mapToInt(value -> value).sum();
		System.out.print(total);
 
		total = numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.print(total);
 
	}

	private static int sumAll(List<Integer> numbers) {
		int total = 0;
		for (int number : numbers) {
			total += number;
		}
		return total;
		}
}
