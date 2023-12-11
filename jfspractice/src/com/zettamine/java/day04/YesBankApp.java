package com.zettamine.java.day04;

import java.util.Scanner;

public class YesBankApp {
	
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter the A/C number: ");
		int accountNumber = scn.nextInt();
		System.out.print("Enter customer id: ");
		int customerId = scn.nextInt();
		scn.nextLine();
		System.out.print("Enter customer name: ");
		String customerName = scn.nextLine();
		System.out.print("Enter customer email: ");
		String email = scn.nextLine();
		System.out.print("Enter balance: ");
		double balance = scn.nextDouble();
		System.out.print("Enter Minimum Balance: ");
		double minimumBalance = scn.nextDouble();
		System.out.println("\n \n");
		System.out.print("Enter amount to withdraw: ");
		double amount = scn.nextDouble();
		Account sA = new SavingsAccount(accountNumber, new Customer(customerId, 
				customerName, email), balance, minimumBalance);
		sA.withdraw(amount);
		System.out.printf("RS.%.2f debited | Balance:%.2f",amount,sA.getBalance());
	}
	
}
