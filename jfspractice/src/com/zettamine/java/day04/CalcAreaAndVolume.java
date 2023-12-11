package com.zettamine.java.day04;

import java.util.Scanner;

public class CalcAreaAndVolume {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		Shape[] shape = new Shape[5];
		System.out.println("Enter the base and height of Triangle");
		double base = scn.nextDouble();
		double height = scn.nextDouble();
		shape[0] = new Triangle(base, height);
		System.out.println("Enter the radius of Sphere");
		double radius = scn.nextDouble();
		shape[1] = new Sphere(radius);
		System.out.println("Enter the length and width of Rectangle");
		double length = scn.nextDouble();
		double width = scn.nextDouble();
		shape[2] = new Rectangle(length, width);
		System.out.println("Enter the length,width and height of Cube");
		length = scn.nextDouble();
		width = scn.nextDouble();
		height = scn.nextDouble();
		shape[3] = new Cube(length, width, height);
		System.out.println("Enter the base and height of Triangle");
		base = scn.nextDouble();
		height = scn.nextDouble();
		shape[4] = new Triangle(base, height);
		printAreaAndVolume(shape);
	}
	private static void printAreaAndVolume(Shape[] shape) {
		for(int i = 0;i<shape.length;i++) {
			Shape s = shape[i];
			System.out.println("Area of "+s.getClass()
					.getSimpleName()+" is "+s.area());
			if(s instanceof Spatial)
				System.out.println("Volume of "+s.getClass()
					.getSimpleName()+" is "+s.volume());
		}
	}
}
