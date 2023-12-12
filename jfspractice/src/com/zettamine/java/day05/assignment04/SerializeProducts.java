package com.zettamine.java.day05.assignment04;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializeProducts {
	
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		System.out.println("How many products to be saved: ");
		int numberOfProducts = scn.nextInt();
		Product[] products = new Product[numberOfProducts];
		for(int i = 0;i < products.length;i++) {
			System.out.println("Enter the product id & product name of Product-"+(i+1));
			int productId = scn.nextInt();
			scn.nextLine();
			String productName = scn.nextLine();
			products[i] = new Product(productId,productName);
		}
		System.out.println("\nEnter of the products is completed\n");
		SerializeProducts(products);
	}

	private static void SerializeProducts(Product[] products) throws IOException {
		File f = new File("C:/CJava/java/products/stocks.ser");
		if(!f.exists()) f.createNewFile();
		FileOutputStream fos = new FileOutputStream("C:/CJava/java/products/stocks.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(products);
		System.out.println("Successfully Serialized Objects");
		oos.close();
	}
	
}
