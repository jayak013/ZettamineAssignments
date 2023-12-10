package com.zettamine.java.day02;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Account {
	
	private long acNo;
	private String name;
	private double amount;
	

	
	public double Deposit(double depAmount) {
		double totalBalance = amount + depAmount;
		this.amount = totalBalance;
		return totalBalance;
		
	}
	public double withdraw(double withAmount) {
		double totalBalance = amount - withAmount;
		this.amount = totalBalance;
		return totalBalance;
	}
	public String details() {
		return "A/C NO: "+ acNo + " | NAME: "+name+" | BALANCE: "+amount+"/-";
	}
	
}
