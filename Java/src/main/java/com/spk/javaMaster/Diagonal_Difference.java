package com.spk.javaMaster;


import java.io.IOException;
import java.util.Scanner;
/**
 * @author Praveen
 *
 */
public class Diagonal_Difference {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {
    	int len = arr.length;
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;
        
        int index = 0;
        while(index < len) {
            leftDiagonalSum += arr[index][index];
            rightDiagonalSum += arr[index][len-1-index];
            index++;
        }
        
        return Math.abs(leftDiagonalSum - rightDiagonalSum);
        

    }

  
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
    	System.out.println("Enter Number : ");
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
           // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = diagonalDifference(arr);

        System.out.println(result);
       // bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}