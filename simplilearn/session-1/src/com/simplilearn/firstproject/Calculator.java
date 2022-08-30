package com.simplilearn.firstproject;
 
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=reader.nextInt();
		int num2=reader.nextInt();
		int ans;
		
		System.out.println("Enter the operator [+,-,*,/]:");
		char op=reader.next().charAt(0);
		switch(op)
		{
		case '+':
			ans=num1+num2;
			break;
		case '-': ans=num1-num2;
		break;
		case '*':
			ans=num1*num2;
			break;
		case '/':
			ans=num1/num2;
			break;
		default:
			System.out.println("Enter the correct operator");
			return;
			
		}
		System.out.println("The given result is as follows");
		System.out.println(num1+""+op+""+num2+""+"="+ans);
		
	}

}
