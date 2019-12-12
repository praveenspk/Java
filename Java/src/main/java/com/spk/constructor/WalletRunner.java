package com.spk.constructor;
/**
 * @author Praveen
 *
 */
public class WalletRunner {

	public static void main(String[] args) {

		Wallet wallet = new Wallet("2575547", 5848548.9, "KJCHKSHC", "LHCHAO");

		//wallet.setWalletBalance(8999000.255);
		System.out.println(wallet.getWalletBalance());
		wallet.addMoney(55000.55);
		wallet.sendMoney(55000.5885);
		System.out.println(wallet.getWalletBalance());

	}
}
