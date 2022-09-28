package com.simplilearn.email;
import java.util.regex.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EmailIdValidation {
	public static void main(String[] args) {
		
		ArrayList<String> emailID= new ArrayList<String>();
		emailID.add("sripradeep@gmail.com");
		emailID.add("shahbaz@yahoo.co.in");
		emailID.add("mona@gmail.com");
		emailID.add("mona_amir@gmail.com");
		emailID.add("esthar123@gmail.com");
		emailID.add("renukaloosu@gmail.com");
		emailID.add("ramya789@gmail.com");
		emailID.add("hanifutharu420@gmail.com");
		emailID.add("das_kashmora@gmail.com");
		emailID.add("kattappa526@gmail.com");
		emailID.add("banusir@gmail.com");
		
		String regex="^(.+)@(.+)$";
		System.out.println("Enter email Id");
		Scanner sc= new Scanner(System.in);
		String input=sc.next();
		 
		Pattern pattern= Pattern.compile(regex);
		Matcher matcher=pattern.matcher(input);
		
		if(matcher.matches())
		{
			System.out.println("Pattern matched");
			
			if(emailID.contains(input)) {
				System.out.println("email Id  "+input +"  found");
				
			}
			else
			{
				System.out.println("email Id  "+input + " not found");
			}
			
		}
		else
		
			System.out.println("Pattern not matched");
			
		sc.close();
		
	}
}
