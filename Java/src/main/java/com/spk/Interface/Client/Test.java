package com.spk.Interface.Client;

import java.util.Scanner;

import com.spk.Interface.Service.AccountService;
import com.spk.Interface.Service.AccountServiceImp;
/**
 * @author Praveen
 *
 */
public class Test {

	public static void main(String[] args) {
	
		String Option="";
		double Amt=0.0;
		Scanner sc=new Scanner(System.in); 
		AccountService imp=new AccountServiceImp();
		
		do{
		
			System.out.println("Choose Your Option :::");
			System.out.println("======================");
			System.out.println("1.Deposit");
			System.out.println("2.Withdrawl");
			System.out.println("3.Balance Enquiry");
			Option=sc.next();
			
			switch (Option) {
			
			case "1":
				System.out.println("Enter Amount To deposite your Account::");
				Amt=sc.nextInt();
				imp.deposite(Amt);
				imp.balanceEnquiry();
				break;

			case "2":
				System.out.println("Enter Amount to Withdrawl::");
				Amt=sc.nextDouble();
				imp.withdraw(Amt);
				imp.balanceEnquiry();
				break;
				
			case "3":
				imp.balanceEnquiry();
				System.out.println("");
			default:
				System.out.println("Do you want to Continue......[Y/N]");
				break;
			}
			
			
		}while(Option.equalsIgnoreCase("Y"));
		
	System.out.println("Thank you.......!!!!");
	}

}
