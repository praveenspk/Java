package com.spk.patterns;
/**
 * @author Praveen
 *
 */
public class Diamond {

	public static void dimondPattern(int num){
		int n, c, k, space = 1;
		n=num;
		space = n - 1;

		  for (k = 1; k<=n; k++)
		  {
		    for (c = 1; c<=space; c++)
		      System.out.print(" ");

		    space--;

		    for (c = 1; c<= 2*k-1; c++)
		      System.out.print("*");

		    System.out.print("\n");
		  }
		 
		  space = 1;
		 
		  for (k = 1; k<= n - 1; k++)
		  {
		    for (c = 1; c<= space; c++)
		      System.out.print(" ");
		 
		    space++;
		 
		    for (c = 1 ; c<= 2*(n-k)-1; c++)
		      System.out.print("*");
		 
		    System.out.println("");
		  }
		
	}
	public static void main(String[] args) {
	dimondPattern(5);	
	
	}

}
