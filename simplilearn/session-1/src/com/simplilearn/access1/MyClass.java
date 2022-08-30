package com.simplilearn.access1;

public class MyClass {

	public int numPublic=10;
	int numDefault=20;
	protected int numProtected=30;
	private int numPrivate=40;
	
	public static void main(String[] args) {
		//trying to access them in same class
		
		MyClass obj = new MyClass();//object created for MyClass
		System.out.println("Public"+obj.numPublic);
		System.out.println("Default"+obj.numDefault);
		System.out.println("protected"+obj.numProtected);
		System.out.println("Private"+obj.numPrivate);
		
				
	}
	
	
}
