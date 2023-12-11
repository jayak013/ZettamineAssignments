package com.zettamine.java.day04;

public class SavingsAccount extends Account{

	private double minimumBalance;
	
	
	
	public SavingsAccount(int accountNumber, Customer customerObj, double balance, double minimumBalance) {
		super(accountNumber, customerObj, balance);
		this.minimumBalance = minimumBalance;
	}

	@Override
	public boolean withdraw(double amount) {
		if(amount>minimumBalance) {
			this.setBalance(this.getBalance()-amount);
			return true;
		}
		return false;
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	
	
	
	
	
}
