package com.simplilearn.typecasting;

public class TypeCast1 {
public static void main(String[] args) {//implicit conversion
	byte a=10;
	short b=a;//byte to short
	int c=b;//short to int
	
	long d=c; //int to long
	float e=d;
	double f=e;
	System.out.println("byte"+a);
	System.out.println("long"+d);
	System.out.println("double"+f);
}
}
