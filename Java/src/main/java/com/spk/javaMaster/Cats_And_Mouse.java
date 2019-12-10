package com.spk.javaMaster;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Cats_And_Mouse {

	// Complete the catAndMouse function below.
	static String catAndMouse(int x, int y, int z) {

		if(Math.abs(x - z) < Math.abs(y-z)){
            return "Cat A";
        }
        else if (Math.abs(x - z) > Math.abs(y-z)){
            return "Cat B";
        }
        else{
            return "Mouse C";
        }
	}
	
	
	static String solve(int x, int y, int z) {
		int distanceA = Math.abs(x - z);
		int distanceB = Math.abs(y - z);

		if (distanceA < distanceB) {
			return "Cat A";
		} else if (distanceA > distanceB) {
			return "Cat B";
		} else {
			return "Mouse C";
		}
	}

	public static void main(String[] args) throws IOException {
			//String[] xyz = {"1", "2" ,"3"};
			String[] xyz = {"1", "3" ,"2"};
			int x = Integer.parseInt(xyz[0]);

			int y = Integer.parseInt(xyz[1]);

			int z = Integer.parseInt(xyz[2]);

			String result = catAndMouse(x, y, z);
			System.out.println(result);
			System.out.println(solve(x, y, z));
		}
}
