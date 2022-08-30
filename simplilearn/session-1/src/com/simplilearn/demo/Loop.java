package com.simplilearn.demo;

public class Loop {
	public static void main(String[] args) {
		System.out.println("while loop");
		int i=1;
		while(i<=5){
			System.out.println(i);
			i++;
		}
		System.out.println("do while loop");
		do {
			System.out.println(i);
			i++;
		}while(i<=10);
		System.out.println("for loop");
		for(i=5;i<=20;i++) {
			System.out.println(i);
		}
	}

}
