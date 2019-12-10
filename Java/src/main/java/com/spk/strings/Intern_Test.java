package com.spk.strings;

public class Intern_Test {

	public static void main(String[] args) {
		
		String string=new String("hello") ;
		String str=new String("hello") ;
		String a=string.intern();
		String b=str.intern();
		System.out.println(a==b);
		}

}
