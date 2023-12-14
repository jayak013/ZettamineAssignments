package com.zettamine.java.day06.assignment01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryApp {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		Library lib = new Library();
		while(true) {
			System.out.print("1. Add Book\n"
					+ "2. Display all Book Details\n"
					+ "3. Search Book by Author\n"
					+ "4. Count Number of Books - By Book Name\n"
					+ "5. Exit\n\n");
			System.out.print("Enter your choice: ");
			int option = scn.nextInt();
			String authorName = null;
			String bookName = null;
			scn.nextLine();
			switch(option) {
				case 1:
					System.out.print("Enter the isbn no: ");
					int isbnNo = scn.nextInt();
					scn.nextLine();
					System.out.print("Enter the book name: ");
					bookName = scn.nextLine();
					System.out.print("Enter the Author name: ");
					authorName = scn.nextLine();
					lib.addBook(new Book(isbnNo, bookName, authorName));
					System.out.println("Book Added successfully.\n");
					break;
				case 2:
					List<Book> viewAllBooks = lib.viewAllBooks();
					for(Book b:viewAllBooks) {
						System.out.println("ISBN no: "+b.getBkNo()+
								" | Book name: "+b.getBookTitle()+
								" | Author name: "+ b.getBookAuthor());
					}
					System.out.println();
					break;
				case 3:
					System.out.print("Enter the author name: ");
					authorName = scn.nextLine();
					ArrayList<Book> viewBooksByAuthor = 
							lib.viewBooksByAuthor(authorName);
					if(viewBooksByAuthor.size()==0) {
						System.out.println("None of the books published by Author "+authorName);
						break;
					}
					for(Book b:viewBooksByAuthor) {
						System.out.println("ISBN no: "+b.getBkNo()+
								" | Book name: "+b.getBookTitle()+
								" | Author name: "+ b.getBookAuthor());
					}
					System.out.println();
					break;
				case 4:
					System.out.print("Enter the Book Name to get their count: ");
					bookName = scn.nextLine();
					int countNoOfBooks = lib.countNoOfBooks(bookName);
					System.out.println("The count of book "+bookName+" = "+countNoOfBooks);
					System.out.println();
					break;
				case 5:
					System.out.println("App Closed");
					System.exit(0);
				default:
					System.err.println("please enter a valid input");
			}
		}
	}

}
