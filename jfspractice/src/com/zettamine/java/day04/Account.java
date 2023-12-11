package com.zettamine.java.day04;

public abstract class Account {
	private int accountNumber;
	private Customer customerObj;
	private double balance;
	
	public Account(int accountNumber, Customer customerObj, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.customerObj = customerObj;
		this.balance = balance;
	}
	
	public abstract boolean withdraw(double amount);

	//getters and setters
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Customer getCustomerObj() {
		return customerObj;
	}

	public void setCustomerObj(Customer customerObj) {
		this.customerObj = customerObj;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
