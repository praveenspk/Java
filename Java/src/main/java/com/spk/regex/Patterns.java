package com.spk.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * @author Praveen
 *
 */
public class Patterns {

	public static void main(String[] args) {
		String re="She sells sea Shells";
		String replace="SsS";
		Pattern p=Pattern.compile(re);
		Matcher m=p.matcher(replace);
		String val=m.replaceAll(replace);
		System.out.println(val);
		
	}

}
