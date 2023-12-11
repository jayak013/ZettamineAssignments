package com.zettamine.java.day04;

import java.util.Scanner;
import java.util.regex.Pattern;

import com.zettamine.java.day03.ValidateMobileNumber;

public class ManageHostellers {
	static Scanner scn = new Scanner(System.in);
	//USING COMPOSITION
	public static void main(String[] args) throws NamePatternDoesNotMatch {
		System.out.println("Enter the Student Details & Hostel Details: ");
		System.out.print("Student ID: ");
		int studentId = scn.nextInt();
		scn.nextLine();
		System.out.print("Student Name: ");
		String studentName = scn.nextLine();
		if(!studentName.matches("[A-Za-z ]+")) {
			throw new NamePatternDoesNotMatch();
		}
		System.out.print("Department Id: ");
		int departmentId = scn.nextInt();
		System.out.print("Gender[M/F]: ");
		String gender = scn.next();
		System.out.print("Phone Number: ");
		String mobile = scn.next();

		while(!ValidateMobileNumber.validateMobile(mobile)) {
			System.out.print("Please enter a Valid Mobile Number: ");
			mobile=scn.next();
		}
		scn.nextLine();
		System.out.print("Hostel Name: ");
		String hostelName = scn.nextLine();
		System.out.print("Room Number: ");
		int roomNum = scn.nextInt();
		Student s = new Student(studentId,studentName,departmentId,gender,mobile,new Hosteller(hostelName,roomNum));
		getHostellerDetails(s);
	}
	private static void getHostellerDetails(Student s) {
		String mobile = s.getPhone();
		int roomNum = s.getHosteller().getRoomNumber();
		System.out.print("Modify Room Number(Y/N): ");
		char confirm1 = scn.next().charAt(0);
		if(confirm1=='y'||confirm1=='Y') {
			System.out.print("New Room Number: ");
			roomNum = scn.nextInt();
			scn.nextLine();
		}
		System.out.print("Modify Phone Number(Y/N): ");
		char confirm2 = scn.next().charAt(0);
		if(confirm2=='Y'||confirm2=='y') {
			System.out.print("New Phone Number: ");
			mobile = scn.next();
			while(!ValidateMobileNumber.validateMobile(mobile)) {
				System.out.print("Please enter a Valid Mobile Number: ");
				mobile=scn.next();
			}
		}
		s = new Student(s.getStudentId(),s.getName()
				,s.getDepartmentId(),s.getGender()
				,s.getPhone(),s.getHosteller());
		System.out.println("Student ID: "+s.getStudentId());
		System.out.println("Student Name: "+s.getName());
		System.out.println("Department ID: "+s.getDepartmentId());
		System.out.println("Student Gender: "+s.getGender());
		System.out.println("Student Phone No: "+s.getPhone());
		System.out.println("Hostel Name: "+s.getHosteller().getHostelName());
		System.out.println("Room No: "+s.getHosteller().getRoomNumber());
	}
	
}
