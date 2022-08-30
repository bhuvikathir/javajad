package com.simplilearn.demo;

public class ElseIf {
public static void main(String[] args) {
	int per=105;
	if(per>=70 && per<=100) {
		System.out.println("distinction");
	}
	else if(per>=60 && per<70) {
		System.out.println("first class");
	}
	else if(per>=50 && per<60) {
		System.out.println("second class");
	}
	else if(per>=35 && per<50) {
		System.out.println("pass");
	}
	else if(per>=00 && per<35) {
		System.out.println("fail");
	}
	else {
		System.out.println("Please enter valid number");
	}
}
}
