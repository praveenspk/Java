package com.spk.constructor;
/**
 * @author Praveen
 *
 */
public class Wallet {
	private String mobileNumber;
	private Double walletBalance;
	private String userName;
	private String receiverName;
	private static Integer data;

	public Wallet() {
		System.out.println("Default");
	}

	public Wallet(String mobileNumber, Double walletBalance, String userName, String receiverName) {
		super();
		this.mobileNumber = mobileNumber;
		this.walletBalance = walletBalance;
		this.userName = userName;
		this.receiverName = receiverName;
	}

	public Double getWalletBalance() {
		return walletBalance;
	}

	public void setWalletBalance(Double walletBalance) {
		this.walletBalance = walletBalance;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public void addMoney(Double creditAmount) {
		this.walletBalance += creditAmount;
		System.out.println("Credit Amount :" + creditAmount);
		System.out.println("Available Balance : " + walletBalance);
	}

	public void sendMoney(Double sendMoney) {
		if (this.walletBalance - sendMoney <= 0) {
			System.out.println("No sufficient money" + walletBalance);
		} else {
			this.walletBalance -= sendMoney;
			System.out.println(sendMoney + " Amount Sent successfully");
			System.out.println("New wallet Balance : " + walletBalance);
		}

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mobileNumber == null) ? 0 : mobileNumber.hashCode());
		result = prime * result + ((receiverName == null) ? 0 : receiverName.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((walletBalance == null) ? 0 : walletBalance.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wallet other = (Wallet) obj;
		if (mobileNumber == null) {
			if (other.mobileNumber != null)
				return false;
		} else if (!mobileNumber.equals(other.mobileNumber))
			return false;
		if (receiverName == null) {
			if (other.receiverName != null)
				return false;
		} else if (!receiverName.equals(other.receiverName))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (walletBalance == null) {
			if (other.walletBalance != null)
				return false;
		} else if (!walletBalance.equals(other.walletBalance))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Wallet [mobileNumber=" + mobileNumber + ", walletBalance=" + walletBalance + ", userName=" + userName
				+ ", receiverName=" + receiverName + "]";
	}

}
