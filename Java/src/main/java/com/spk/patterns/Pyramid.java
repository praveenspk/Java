package com.spk.patterns;

public class Pyramid {

	public static void main(String[] args) {
		System.out.println("=========pyramid is=========");
		/*for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.println("*");
			}
			System.out.println();
		}*/
		for(int i=0; i<5; i++)
        {
 
            //  inner loop to handle number of columns
            //  values changing acc. to outer loop  
            for(int j=0; j<=i; j++)
            {
                // printing stars
                System.out.print("* ");
            }
 
            // ending line after each row
            System.out.println();
        }
		
	}

}
