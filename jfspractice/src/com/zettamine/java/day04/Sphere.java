package com.zettamine.java.day04;

public class Sphere implements Shape,Spatial {
	private double radius;
	
	
	public Sphere(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double area() {
		return 4*Math.PI*radius*radius;
	}

	@Override
	public double volume() {
		return (4*Math.PI*radius*radius*radius)/3;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
