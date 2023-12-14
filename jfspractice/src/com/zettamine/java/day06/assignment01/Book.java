package com.zettamine.java.day06.assignment01;

public class Book {
	
	private int bkNo;
	private String bookTitle;
	private String bookAuthor;
	
	public Book(int bkNo, String bookTitle, String bookAuthor) {
		super();
		this.bkNo = bkNo;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
	}
	
	public int getBkNo() {
		return bkNo;
	}
	public void setBkNo(int bkNo) {
		this.bkNo = bkNo;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
	
}
