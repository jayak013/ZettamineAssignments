package com.zettamine.java.day06.assignment01;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	private List<Book> bookList = new ArrayList<>();

//	public List<Book> getList() {
//		return list;
//	}
//
//	public void setList(List<Book> list) {
//		this.list = list;
//	}
	
	public void addBook(Book book) {
		bookList.add(book);
	}
	
	public boolean isEmpty() {
		return bookList.isEmpty();
	}
	
	public List<Book> viewAllBooks(){
		return bookList;
	}
	
	public ArrayList<Book> viewBooksByAuthor(String author){
		if(isEmpty()) System.out.println("The list is empty");
		ArrayList<Book> listOfBooksByAnAuthor = new ArrayList<Book>();
		for(Book b:bookList) {
			if(b.getBookAuthor().equalsIgnoreCase(author)) {
				listOfBooksByAnAuthor.add(b);
			}
		}
		if(listOfBooksByAnAuthor.isEmpty()) {
			System.out.println("The list is empty");
			return listOfBooksByAnAuthor;
		}else {
			return listOfBooksByAnAuthor;
		}
	}
	
	public int countNoOfBooks(String bname) {
		int countOfBooks = 0;
		for(Book b:bookList) {
			if(b.getBookTitle().equalsIgnoreCase(bname)) 
				countOfBooks++;
		}
		return countOfBooks;
	}
}
