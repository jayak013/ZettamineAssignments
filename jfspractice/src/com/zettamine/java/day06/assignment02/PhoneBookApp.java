package com.zettamine.java.day06.assignment02;

import java.util.List;
import java.util.Scanner;

public class PhoneBookApp {
	
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		PhoneBook phoneBook = new PhoneBook();
		long phoneNumber = 0;
		while(true) {
			System.out.println("Choose an option from the Menu\n\n"
					+ "1. Add Contact\n"
					+ "2. Display all Contacts\n"
					+ "3. Search Contact by phone\n"
					+ "4. Remove\n"
					+ "5. Exit\n");
			System.out.print("Enter your choice: ");
			int choice = scn.nextInt();
			scn.nextLine();
			System.out.println();
			switch(choice) {
				case 1:
					System.out.print("Enter the First Name: ");
					String firstName = scn.nextLine();
					System.out.print("Enter the Last Name: ");
					String lastName = scn.nextLine();
					System.out.print("Enter the Phone Number: ");
					phoneNumber = scn.nextLong();
					scn.nextLine();
					System.out.print("Enter the Email: ");
					String email = scn.nextLine();
					phoneBook.addContact(new Contact(firstName, lastName, phoneNumber, email));
					System.out.println("Successfully added a contact");
					System.out.println();
					break;
				case 2:
					List<Contact> viewAllContacts = phoneBook.viewAllContacts();
					if(viewAllContacts.size() == 0) {
						System.out.println("The List is empty.");
						break;
					}
					for(Contact c:viewAllContacts) {
						System.out.println("First Name: "+c.getFirstName()+
								" | Last Name: "+c.getLastName()+
								" | Phone No: "+c.getPhoneNumber()+
								" | Email: "+c.getEmailId());
					}
					System.out.println();
					break;
				case 3:
					System.out.print("Enter the phone number to search: ");
					phoneNumber = scn.nextLong();
					scn.nextLine();
					Contact c = phoneBook.viewContactByPhoneNo(phoneNumber);
					if(c!=null) {
						System.out.print("The Contact is ");
						System.out.println("First Name: "+c.getFirstName()+
								" | Last Name: "+c.getLastName()+
								" | Phone No: "+c.getPhoneNumber()+
								" | Email: "+c.getEmailId());
					}else {
						System.err.println("Contact with "+phoneNumber+ " does not exist");
					}
					System.out.println();
					break;
				case 4:
					System.out.print("Enter the phone number to remove: ");
					phoneNumber = scn.nextLong();
					scn.nextLine();
					if(phoneBook.viewContactByPhoneNo(phoneNumber)!=null) {
						System.out.print("Do you want to remove the contact(Y/N): ");
						char opt = scn.next().charAt(0);
						if(opt=='y' || opt =='Y') {
							phoneBook.removeContact(phoneNumber);
							System.out.println("The contact is successfully deleted.");
						}else if(opt=='n' || opt =='N') {
							System.out.println("No changes Done.");
						}else {
							System.out.println("Not a valid input");
						}
						System.out.println();
					}else System.err.println("Contact with "+phoneNumber+ " does not exist");
					System.out.println();
					break;
				case 5:
					System.exit(0);
				default:
					System.err.println("Please enter a valid input");
			}
		}
	}
	
}
