package com.spk.strings;

public class StringToBuider {
	public static void main(String[] args) {
		
		String name="Praveen";
		StringBuilder sb=new StringBuilder(name);
		StringBuilder builder=new StringBuilder(" Kumar ");
		String str=builder.toString();
		System.out.println(sb.append(str));
		
	}

}
