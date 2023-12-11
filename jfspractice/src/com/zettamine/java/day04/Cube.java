package com.zettamine.java.day04;

public class Cube implements Shape,Spatial {

	private double length;
	private double width;
	private double height;
	
	
	
	public Cube(double length, double width, double height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}

	@Override
	public double area() {
		return 2*length*width+2*width*height+2*height*length;
	}

	@Override
	public double volume() {
		return length*height*width;
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

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
