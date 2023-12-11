package com.zettamine.java.day04;

public class Student {
	
	protected int studentId;
	protected String name;
	protected int departmentId;
	protected String gender;
	protected String phone;
	protected Hosteller hosteller;
	
	
	public Student(int studentId, String name, int departmentId, String gender, String phone,Hosteller hosteller) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.departmentId = departmentId;
		this.gender = gender;
		this.phone = phone;
		this.hosteller = hosteller;
	}


	public int getStudentId() {
		return studentId;
	}


	public String getName() {
		return name;
	}


	public int getDepartmentId() {
		return departmentId;
	}


	public String getGender() {
		return gender;
	}


	public String getPhone() {
		return phone;
	}


	public Hosteller getHosteller() {
		return hosteller;
	}
	
	
	
	
}
