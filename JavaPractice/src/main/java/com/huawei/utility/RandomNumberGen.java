package com.huawei.utility;

import java.util.Random;

public class RandomNumberGen {
	public static void main(String[] args) {
		// RandomNumberGen r=new RandomNumberGen();
		PrintRandomGenration r = new PrintRandomGenration();
		int x = r.randomNumberGen();
		System.out.println(x);
	}
}

class PrintRandomGenration {
	int randomNumberGen() {
		// create instance of Random class
		Random rand = new Random();

		// Generate random integers in range 0 to 999
		int rand_int1 = rand.nextInt(1000);
		return rand_int1;
		// int rand_int2 = rand.nextInt(1000);

		// Print random integers
		// System.out.println("Random Integers: "+rand_int1);
		// System.out.println("Random Integers: "+rand_int2);

	}
}