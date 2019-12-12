package com.spk.utility;

import java.util.Scanner;
/**
 * @author Praveen
 *
 */
public class Demo {
	String accNo, name, fatherName, motherName;
	int age;
	static double rate = 0.25;
	static double balance = 1000;
	Scanner scanString = new Scanner(System.in);
	Scanner scanNum = new Scanner(System.in);

	void input() {
		System.out.print("Account Number:");
		accNo = scanString.nextLine();
		System.out.print("Name:");
		name = scanString.nextLine();
		System.out.print("Father's Name:");
		fatherName = scanString.nextLine();
		System.out.print("Mother's Name:");
		motherName = scanString.nextLine();
		System.out.print("Age:");
		age = scanNum.nextInt();
		System.out.println();
	}

	void withdraw() {
		System.out.print("Enter money to withdraw :");
		double withdraw = scanNum.nextDouble();
		balance = balance - withdraw;
		if (balance < 1000) {
			System.out.println("Invalid Data Entry\n Balance below Rs 1000 not allowed");
			System.exit(0);
		}
	}

	void deposit() {
		System.out.print("How Much:");
		double deposit = scanNum.nextDouble();
		balance = balance + deposit;
	}

	void display() {
		System.out.println("Your  Balnce:Rs " + balance);
	}

	void oneYear() {
		System.out.println("After one year:");
		balance += balance * rate * 0.01;
	}

	public static void main(String args[]) {
		Demo d1 = new Demo();
		d1.input();
		d1.display();
		while (true) {// Withdraw/Deposit
			System.out.println("Withdraw/Deposit Press W/D:");
			String reply1 = ((d1.scanString.nextLine()).toLowerCase()).trim();
			char reply = reply1.charAt(0);
			if (reply == 'w') {
				d1.withdraw();
			} else if (reply == 'd') {
				d1.deposit();
			} else {
				System.out.println("Invalid Entry");
			}
			// More Manipulation
			System.out.println("Want More Manipulations: Y/N:");
			String manipulation1 = ((d1.scanString.nextLine()).toLowerCase()).trim();

			char manipulation = manipulation1.charAt(0);
			System.out.println(manipulation);

			if (manipulation == 'y') {
			} else if (manipulation == 'n') {
				break;
			} else {
				System.out.println("Invalid Entry");
				break;
			}
		}

		d1.oneYear();
		d1.display();
	}
}