package com.zettamine.java.day06.assignment02;

public class Contact {
	
	private String firstName;
	private String lastName;
	private long phoneNumber;
	private String emailId;
	
	public Contact(String firstName, String lastName, long phoneNumber, String emailId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}
	
	
	
}
