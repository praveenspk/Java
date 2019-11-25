package com.spk.Interface.Service;

public class AccountServiceImp implements AccountService {

	private double TotalBalance=0.0;
	public double withdraw(double amt) {

		if(amt>0){
			TotalBalance=TotalBalance-amt;
			}
		else
		{
			System.out.println("Insufficient Balance");
		}
		return 0.0;
	}

	public double deposite(double amt) {
		if(amt>0){
			TotalBalance=TotalBalance+amt;
			
		}
		else{
			System.out.println("Invalid Account Operations");
		}
		return 0;
	}

	public void balanceEnquiry() {

		System.out.println("Available Balance is::"+TotalBalance);
		
	}

}
