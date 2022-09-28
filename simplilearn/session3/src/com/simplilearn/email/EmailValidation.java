package com.simplilearn.email;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import java.util.ArrayList;

public class EmailValidation {

	public static void main(String[] args) {
		
		
		ArrayList<String> emailID= new ArrayList<String>();
		
		emailID.add("aakashini12@gmail.com");
		emailID.add("banu23@gmail.com");
		emailID.add("sripradeep@gmail.com");
		emailID.add("shahbaz2@gmail.com");
		emailID.add("mona@gmail.com");
		emailID.add("esthar@gmail.com");
		emailID.add("ramya@gmail.com");
		emailID.add("sathya12@gmail.com");
		emailID.add("amutha2@gmail.com");
		emailID.add("hanif@gmail.com");
		emailID.add("dasarun2@gmail.com");
		
		String searchemailID= null;
		System.out.println("Enter the email ID to be searched");
		
		Scanner sc= new Scanner(System.in);
		
		searchemailID= sc.nextLine();
		
		if (searchemailID==null) {
			System.out.println("You haven't entered the email ID");
		return;
		
		
		}
		
	   
	   
	    String regex = "^(.+)@(.+)$";
	    Matcher matcher = Pattern.compile(regex).matcher(searchemailID);
	    if (matcher.matches() && emailID.stream().anyMatch(mail -> mail.equals(searchemailID))) {
	        System.out.println(searchemailID + " = is present");
	    } else {
	        System.out.println("Not a valid or is not present");
	    }
		sc.close();
		
	}
}
