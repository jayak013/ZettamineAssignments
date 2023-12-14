package com.zettamine.java.day06.assignment08;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		TreeSet<StringBuffer> treeSet = new TreeSet<StringBuffer>((StringBuffer s1,StringBuffer s2)->{
												if(s1.length()>s2.length()) return 1;
												else if(s1.length()<s2.length()) return -1;
												else return s1.compareTo(s2);
											});
		
		System.out.print("How many students you want to add: ");
		int numberOfStudents = scn.nextInt();
		scn.nextLine();
		int count = 1;
		do {
			System.out.print("Enter student-"+ count++ +" name: ");
			StringBuffer student = new StringBuffer(scn.nextLine());
			treeSet.add(student);
			if(count<=numberOfStudents) {
				System.out.print("Do you want to add more Students[Y/N]:");
				char opt = scn.next().charAt(0);
				scn.nextLine();
				if(opt=='N'||opt=='n') break;
				else if(opt=='Y'||opt=='y');
				else {
					System.err.println("Invalid Input--->Application Closed");
					System.exit(0);
				}
			}
		}while(count<=numberOfStudents);
		System.out.println(treeSet);
		
	}
	
}
