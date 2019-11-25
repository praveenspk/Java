package com.spk.lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Calculator {

	public static void main(String[] args) {
		Consumer<Integer> con=a-> new ComputeOperation(a);
		con.accept(10);
		
		BiConsumer<Integer, Integer> biCon=(a,b)->new ComputeOperation(a,b);
		biCon.accept(20,80);
		
		
	}

}
