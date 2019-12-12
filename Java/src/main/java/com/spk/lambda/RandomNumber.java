package com.spk.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
/**
 * @author Praveen
 *
 */
public class RandomNumber {
	Random random=new Random();
	public int generateRandomNumber() {
		return random.nextInt(9999);
	}
	
	public List<Integer> orderComputer(List<RandomNumber> list, Function<RandomNumber,Integer> f){
		List<Integer> result=new ArrayList<>();
		for(RandomNumber r:list) {
			result.add(f.apply(r));
		}
 		return result;
	}
	
}
