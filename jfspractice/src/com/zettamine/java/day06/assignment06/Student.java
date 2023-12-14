package com.zettamine.java.day06.assignment06;

public class Student {
	
	private String name;
	private String location;
	private String email;
	private long mobile;
	
	public Student(String name, String location, String email, long mobile) {
		super();
		this.name = name;
		this.location = location;
		this.email = email;
		this.mobile = mobile;
	}
	
	public String getName() {
		return name;
	}
	public String getLocation() {
		return location;
	}
	public String getEmail() {
		return email;
	}
	public long getMobile() {
		return mobile;
	}
	
	
}
