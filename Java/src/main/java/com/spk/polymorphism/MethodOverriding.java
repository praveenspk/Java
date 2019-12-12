package com.spk.polymorphism;
/**
 * @author Praveen
 *
 */
class RBI{
	
	public double getRateOfInterest(){
		
		return 8.0;
	}
	
}

class SBI extends RBI{

	public double getRateOfInterest(){
		
		return 7.8;
	}
	
}
class BOI extends RBI{
	
public double getRateOfInterest(){
		
		return 9.8;
	}
}
class AXIS extends RBI{
	public double getRateOfInterest(){
		return 8.4;
	}
	
}
public class MethodOverriding {
	
	public static void main(String[] args) {

		SBI sbi=new SBI();
		System.out.println("SBI Bank Rate Of Interest is :"+sbi.getRateOfInterest() +" ");
		BOI boi=new BOI();
		System.out.println("BOI Bank Rate Of Interest is :"+boi.getRateOfInterest()+" ");
		AXIS axis=new AXIS();
		System.out.println("AXIS Bank Rate Of Interest is :"+axis.getRateOfInterest());
	}

}
