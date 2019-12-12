package com.spk.lambda;

import java.util.function.Consumer;
/**
 * @author Praveen
 *
 */
public class Computer {
	
	private int serialNumber;
	private String brandName;
	
	public Computer(int serialNumber, String brandName) {
		super();
		this.serialNumber = serialNumber;
		this.brandName = brandName;
	}
	
	
	public int getSerialNumber() {
		return serialNumber;
	}


	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}


	public String getBrandName() {
		return brandName;
	}


	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}


	public void excute(Computer computer,Consumer<Computer> consumer) {
		consumer.accept(computer);
		
	}

}
