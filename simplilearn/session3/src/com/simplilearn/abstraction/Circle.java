package com.simplilearn.abstraction;

public class Circle extends Shape {

	private double radius;
	public Circle(String color,double radius) {
		super(color);
		// TODO Auto-generated constructor stub
		this.radius=radius;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radius,2);
	}
	
	public String toString() {
		return "Circle color"+getColor()+"Circle Area = " +area();
	}

}
