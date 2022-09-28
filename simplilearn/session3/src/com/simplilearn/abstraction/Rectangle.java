package com.simplilearn.abstraction;

public class Rectangle extends Shape{

	private double length;
	private double width;
	public Rectangle(String color,double length,double width) {
		super(color);
		// TODO Auto-generated constructor stub
		this.length=length;
		this.width=width;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return length*width;
		
	}
	public String toString() {
		return "Rectangle color "+ getColor()+"Rectangle area"+area();
	}

}
