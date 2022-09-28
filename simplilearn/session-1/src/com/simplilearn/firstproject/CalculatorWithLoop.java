package com.simplilearn.firstproject;
import java.util.Scanner;

public class CalculatorWithLoop {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	while(true)
	{
		System.out.println("Enter two numbers");
		 int a=sc.nextInt();
	    double num1=a;
		 int b=sc.nextInt();
	    double num2=b;
		System.out.println("Enter the operator [+,-,*,/]:");
		String function=sc.next();
		final char op=function .charAt(0);
		
		if(op=='+')
		System.out.println("Addition = "+(num1+num2));
		else if (op == '-')
			System.out.println("Subtraction = "+(num1-num2));
		else if (op=='*')
			System.out.println("Multiplication = "+(num1*num2));
		else if(op=='/')
			System.out.println("Division = "+(num1/num2));
		else
			System.out.println("Enter the correct operator");
		System.out.println("Enter y to continue and n to exit");
		char input= sc.next().charAt(0);
		if(input=='y'||input=='Y')
			continue;
		else
			break;
	}
}
}
