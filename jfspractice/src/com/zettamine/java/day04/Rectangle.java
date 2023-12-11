package com.zettamine.java.day04;

public class Rectangle implements Shape{
	
	private double length;
	private double width;
	
	
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	public double area() {
		return length*width;
	}

	@Override
	public double volume() {
		return -1;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

}
