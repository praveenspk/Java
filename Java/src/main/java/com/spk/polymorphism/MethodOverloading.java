package com.spk.polymorphism;


/**
 * @author Praveen
 *
 */
public class MethodOverloading {



	public void display(){
		System.out.println("0-param Arguments");

	}
	
	public void display(int i){
		System.out.println("1-param Arguments");

	}
	public void display(int i,String Name){
		System.out.println("2-param Arguments");

	}


	public static void main(String[] args) {
	
		MethodOverloading mo=new MethodOverloading();
		mo.display('a');
		mo.display(10,"java");
		mo.display();
	}
		
	}


