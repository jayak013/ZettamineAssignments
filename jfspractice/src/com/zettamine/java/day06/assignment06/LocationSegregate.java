package com.zettamine.java.day06.assignment06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LocationSegregate {
	
	public static void main(String[] args) {
		ArrayList<Student> listOfStudents = new ArrayList<Student>();
		Scanner scn = new Scanner(System.in);
		do {
			System.out.println("Enter Student's Name,Location,Email and Mobile: ");
			String name = scn.nextLine();
			String loc = scn.nextLine();
			String email = scn.nextLine();
			long mobile = scn.nextLong();
			scn.nextLine();
			listOfStudents.add(new Student(name, loc, email, mobile));
			System.out.print("Do you want to add more Students[Y/N]: ");
			char opt = scn.next().charAt(0);
			scn.nextLine();
			if(opt=='N'||opt=='n') {
				HashMap<String, Integer> report = StudentReport.getReport(listOfStudents);
				System.out.println("Location\t\tCount");
				for(String s:report.keySet())
					System.out.println(s+"\t\t"+report.get(s));
				break;
			}
			else if(opt=='Y'||opt=='y');
			else {
				System.out.println("Not a valid input");
				System.out.println("Program termination");
				return;
			}
		}while(true);
		
		
	}
	
}
