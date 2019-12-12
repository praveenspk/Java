package com.spk.abstractClasses;

/**
 * @author Praveen
 *
 */
abstract class RBI {

	public abstract double getRateOfInterest(int days);

}

class HDFC extends RBI {

	@Override
	public double getRateOfInterest(int days) {
		if (days > 45 & days < 180)
			return 8.5;
		else if (days > 180 & days < 360)
			return 9.2;
		else
			return 0.0;
	}

	public String getBankName() {
		return "HDFC Bank";
	}

}

class AXIS extends RBI {

	@Override
	public double getRateOfInterest(int days) {
		if (days > 45 & days < 180)
			return 7.8;
		else if (days > 180 & days < 360)
			return 6.9;
		else
			return 5.0;
	}

	public String getBankName() {
		return "AXIS Bank";
	}

}

public class Demo {

	public static void main(String[] args) {

		HDFC hdfc = new HDFC();
		System.out.println(hdfc.getRateOfInterest(152) + " " + hdfc.getBankName());
		AXIS axis = new AXIS();
		System.out.println(axis.getRateOfInterest(78) + " " + axis.getBankName());

	}
}