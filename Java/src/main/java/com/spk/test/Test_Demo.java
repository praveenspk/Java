package com.spk.test;
/**
 * @author Praveen
 *
 */
public class Test_Demo {

	public static void main(String[] args) {

		Beer b = Beer.FO;
		Beer[] bear = Beer.values();

		for(Beer b1:bear)

		{

		System.out.println(b1+"......."+b1.ordinal());

		}

		switch (b) {

		case KF:

			System.out.println("it is children's brand");

			break;

		case KO:

			System.out.println("it's too light");

			break;

		case FO:

			System.out.println("bye one get one free");

			break;

		case RC:

			System.out.println("it is not that much kick");

			break;

		/*
		 * case IB:
		 * 
		 * System.out.println("I m error because i m not define inside enum ");
		 * 
		 * break;
		 */

		default:

			System.out.println("other brans are not recommended");

			break;
		}
	}

}