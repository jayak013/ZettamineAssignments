package com.zettamine.java.day05.assignment04;

import java.io.Serializable;

public class Product implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int productId;
	private String productName;
	
	public Product(int productId,String productName) {
		this.productId = productId;
		this.productName = productName;
	}
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + "]";
	}

	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}
	
	
}
