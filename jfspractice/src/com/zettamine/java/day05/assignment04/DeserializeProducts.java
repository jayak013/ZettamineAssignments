package com.zettamine.java.day05.assignment04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class DeserializeProducts {
	
	private static final String FILE_PATH = "C:/CJava/java/products/stocks.ser";
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Product[] products = deSerializeProducts();
		System.out.print("Enter the Product ID: ");
		int productId = scn.nextInt();
		for(int i = 0;i<products.length;i++) {
			Product p = products[i];
			if(p.getProductId()==productId) {
				System.out.println("Product name is: "+p.getProductName());
				break;
			}
			if(i==products.length-1) System.err.println("Product is not availble on given ID");
		}
		
	}

	private static Product[] deSerializeProducts() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(FILE_PATH);
		if(!new File(FILE_PATH).exists()) {
			System.err.println("Please Enter Stock Details");
			return null;
		}
		ObjectInputStream ois = new ObjectInputStream(fis);
		Product[] products = (Product[])ois.readObject();
		Arrays.toString(products);
		if(products.length==0) {
			System.err.println("Please Enter Stock Details");
			return null;
		}
		return products;
	}
	
}
