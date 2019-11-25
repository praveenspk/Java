package com.spk.test;

public class InstanceVariables {

	String websiteName;
	String category;

	public static void main(String[] args) {

		InstanceVariables obj = new InstanceVariables();
		obj.websiteName = "www.InstanceOfJava.com";
		obj.category = "Java tutorial/interview questions";
		System.out.println(obj.websiteName = "www.InstanceOfJava.com");
	}

}