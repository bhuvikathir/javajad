package com.simplilearn.polymorphism;

import java.security.DomainCombiner;

public class MethodOverloading {
	public int add(int a,int b) {
		return a+b;
	}
	public double add(double a,double b) {
		return a+b;
	}
	public float add(float a,float b) {
		return a+b;
	}
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		MethodOverloading m= new MethodOverloading();
		System.out.println("int addition  ="+m.add(5,6));
		System.out.println("double addition  ="+m.add(50.0,62.0));
		System.out.println("float addition  ="+m.add(5.1f,6.2f));
		System.out.println("int 3 addition  ="+m.add(5,6,8));
	}

}
