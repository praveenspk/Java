package com.spk.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ShipmentOrder {

	public static void main(String[] args) {
		
		RandomNumber number=new RandomNumber();
		List<RandomNumber> list=new ArrayList<>();
		list.add(new RandomNumber());
		//list.add(new RandomNumber());
		
		number.orderComputer(list, new Function<RandomNumber, Integer>() {
			
			@Override
			public Integer apply(RandomNumber t) {
			int orderNumber=t.generateRandomNumber();	
			System.out.println("Your Order number is:"+orderNumber);
			return orderNumber;
			}
		});
		number.orderComputer(list, t->t.generateRandomNumber()).forEach(System.out::print);
		number.orderComputer(list, RandomNumber::generateRandomNumber).forEach(System.out::print);
	}

}
