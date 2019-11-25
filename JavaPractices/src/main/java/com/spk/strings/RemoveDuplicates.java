package com.spk.strings;

public class RemoveDuplicates {
	public String removeDuplicates(String input) {
		String result="";
		for(int i=0;i<input.length();i++) {
			if(!result.contains(String.valueOf(input.charAt(i)))) {
				result += String.valueOf(input.charAt(i));
			}
		}
	return result;
	}
	
	public static void main(String[] args) {
		RemoveDuplicates rd=new RemoveDuplicates();
		System.out.println(" "+rd.removeDuplicates("praveen"));
		System.out.println(rd.removeDuplicates("prasanth"));
		System.out.println(rd.removeDuplicates("naseer"));
		
		
	}

}

