package com.zettamine.java.day04;

import java.util.Scanner;

public class VehicleLoanAndInsuranceEligibility {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the Vehicle Number: ");
		String vehicleNumber = scn.nextLine();
		System.out.print("Enter the Model Name: ");
		String modelName = scn.nextLine();
		System.out.print("Enter the Vehicle Type [2 wheeler|3 wheeler|4 wheeler]: ");
		String vehicleType = scn.nextLine();
		System.out.print("Enter the vehicle Price: ");
		int price = scn.nextInt();
		Vehicle vehicle = new Vehicle(vehicleNumber, 
				modelName, vehicleType, price);
		double loanAmount = vehicle.issueLoan();
		double insuranceAmount = vehicle.takeInsurance();
		System.out.println("\n\nVehicle Number: "+vehicle.getVehicleNumber());
		System.out.println("Model Name: "+vehicle.getModelName());
		System.out.println("Vehicle Type: "+vehicle.getVehicleType());
		System.out.println("Vehicle Price: "+vehicle.getPrice());
		System.out.println("Issued Loan Amount: "+loanAmount);
		System.out.println("Issued Insurance Amount: "+insuranceAmount);
	}
}
