package com.spk.jp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * @author Praveen
 *
 */
public class PrimeEx {
		   public static void main(String[] args) {  
		       List list=new ArrayList();
		       for (int i = 2; i <= 50; i++) {  
		           if (isPrime(i)) {  
		               list.add(i);
		        	   System.out.println(list);  
		           }  
		       }  
		   }  
		   public static boolean isPrime(int n) {  
		       if (n <= 1) {  
		           return false;  
		       }  
		       for (int i = 2; i <= Math.sqrt(n); i++) {  
		           if (n % i == 0) {  
		               return false;  
		           }  
		       }  
		       return true;  
		   }  
		} 