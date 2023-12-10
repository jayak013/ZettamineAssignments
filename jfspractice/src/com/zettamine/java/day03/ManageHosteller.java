package com.zettamine.java.day03;

import java.util.Scanner;

public class ManageHosteller {
	
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		Studentt s = new Hosteller();
		System.out.println("Enter the Student Details & Hostel Details: ");
		System.out.print("Student ID: ");
		s.setStudentId(scn.nextInt());
		scn.nextLine();
		System.out.print("Student Name: ");
		s.setName(scn.nextLine());
		System.out.print("Department Id: ");
		s.setDepartmentId(scn.nextInt());
		System.out.print("Gender[M/F]: ");
		s.setGender(scn.next());
		System.out.print("Phone Number: ");
		String mobile = scn.next();
		s.setPhoneNumber(mobile);
		while(!ValidateMobileNumber.validateMobile(mobile)) {
			System.out.print("Please enter a Valid Mobile Number: ");
			mobile=scn.next();
			s.setPhoneNumber(mobile);
		}
		scn.nextLine();
		System.out.print("Hostel Name: ");
		((Hosteller)s).setHostelName(scn.nextLine());
		System.out.print("Room Number: ");
		((Hosteller)s).setRoomNumber(scn.nextInt());
		
		getHostellerDetails(s);
	}
	
	private static Hosteller getHostellerDetails(Studentt s) {
		String mobile = s.getPhoneNumber();
		System.out.print("Modify Room Number(Y/N): ");
		char confirm1 = scn.next().charAt(0);
		if(confirm1=='y'||confirm1=='Y') {
			System.out.print("New Room Number: ");
			((Hosteller)s).setRoomNumber(scn.nextInt());
			scn.nextLine();
		}
		System.out.print("Modify Phone Number(Y/N): ");
		char confirm2 = scn.next().charAt(0);
		if(confirm2=='Y'||confirm2=='y') {
			System.out.print("New Phone Number: ");
			mobile = scn.next();
			s.setPhoneNumber(mobile);
			while(!ValidateMobileNumber.validateMobile(mobile)) {
				System.out.print("Please enter a Valid Mobile Number: ");
				mobile=scn.next();
				s.setPhoneNumber(mobile);
			}
		}
		System.out.println("Student ID: "+s.getStudentId());
		System.out.println("Student Name: "+s.getName());
		System.out.println("Department ID: "+s.getDepartmentId());
		System.out.println("Student Gender: "+s.getGender());
		System.out.println("Student Phone No: "+s.getPhoneNumber());
		System.out.println("Hostel Name: "+((Hosteller)s).getHostelName());
		System.out.println("Room No: "+((Hosteller)s).getRoomNumber());
		return ((Hosteller)s);
	}
	
}
