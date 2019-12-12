package com.spk.lambda;
/**
 * @author Praveen
 *
 */
public class RepairShop {

	public void fix(Computer c) {
		System.out.println("Repairing Computer For Brand Name:"+c.getBrandName()+" "+"And Serial Number"+c.getSerialNumber());
	}
}
