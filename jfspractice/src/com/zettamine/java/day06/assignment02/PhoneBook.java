package com.zettamine.java.day06.assignment02;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PhoneBook {
	private List<Contact> phoneBookList = new ArrayList<>();
	
	public void addContact(Contact contactObj) {
		phoneBookList.add(contactObj);
	}
	
	public List<Contact> viewAllContacts(){
		return phoneBookList;
	}
	
	public Contact viewContactByPhoneNo(long phoneNumber) {
		for(Contact c:phoneBookList) {
			if(c.getPhoneNumber()==phoneNumber) return c;
		}
		return null;
	}
	
	public boolean removeContact(long phoneNumber) {
		ListIterator<Contact> itOfphB = phoneBookList.listIterator();
		while(itOfphB.hasNext()) {
			if(itOfphB.next().getPhoneNumber()==phoneNumber) {
				itOfphB.remove();
				return true;
			}
		}
		return false;
	}
}
