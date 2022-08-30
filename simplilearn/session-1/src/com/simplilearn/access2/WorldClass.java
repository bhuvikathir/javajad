package com.simplilearn.access2;


import com.simplilearn.access1.MyClass;
public class WorldClass extends MyClass {

	
	public static void main(String[] args) {
		WorldClass obj=new WorldClass();
		System.out.println("Public"+obj.numPublic);
		System.out.println("Default"+obj.numDefault);
		System.out.println("protected"+obj.numProtected);
		System.out.println("Private"+obj.numPrivate);
	}
}
