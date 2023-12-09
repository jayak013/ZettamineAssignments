package com.zettamine.java.day01;

import java.util.Scanner;

public class AverageAge {
	
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) throws InvalidAgeException {
		System.out.print("Enter total no of Employees: ");
		int noOfEmployees=scn.nextInt();
		if(noOfEmployees<2) {
			System.out.print("\u001B[31mPlease enter a valid employee count\u001B[0m");
			return;
		}
		calculteAverage(new int[noOfEmployees]);
	}

	private static void calculteAverage(int[] age) throws InvalidAgeException {
		System.out.println("Enter the age for " + age.length + " Employees:");
		float sum = 0;
		for(int i = 0;i<age.length;i++) {
			age[i] = scn.nextInt();
			if(age[i]<28 || age[i]>40) {
				throw new InvalidAgeException("Invalid age Encountered");
			}
			sum+=age[i];
		}
		System.out.printf("The average age is %.2f",(float)(sum/age.length));
	}
	
}
