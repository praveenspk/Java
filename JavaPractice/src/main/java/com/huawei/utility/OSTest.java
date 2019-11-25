package com.huawei.utility;

import java.io.*;

public class OSTest {
	public static void main(String[] args) throws IOException {
		String input;
		String OS;

		System.out.println("Welcome to Guess Your OS! - Read to play?");
		InputStreamReader isrPlayGame = new InputStreamReader(System.in);
		BufferedReader brPlayGame = new BufferedReader(isrPlayGame);
		input = brPlayGame.readLine();
		input = input.replaceAll("\\\\n", "");
		if (input.equalsIgnoreCase("Yes")) { /* */
			OS = System.getProperty("os.name");
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("Your OS has been calcualted - now have a guess what it is!");
			input = br.readLine();
			input = input.replaceAll("\\\\n", "");
			if (input.equalsIgnoreCase(OS)) {
				System.out.println("Thank god - you know what your operating system is (" + OS + ")"); /* */
				if (OS == "Windows Vista") {
					System.out.println("What a second... you have Windows Vista? (Laughs in your face)");
				}
			} else if (!input.equals(OS)) {
				System.out.println("Wrong! - You thought your OS is " + input + " but is actually " + OS + "!");
			} else {
				System.out.println("Error");
			}
			;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			;
			System.out.println("Thanks for playing Guess Your OS! Press enter to close the game...");
			InputStreamReader isrEndGame = new InputStreamReader(System.in);
			BufferedReader brEndGame = new BufferedReader(isrEndGame);
			input = brEndGame.readLine();
			System.exit(0);
		} else {
			System.exit(0);
		}
		;

	}

}