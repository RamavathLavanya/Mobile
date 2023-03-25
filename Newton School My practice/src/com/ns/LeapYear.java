package com.ns;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the year");
	       //Storing the captured value in a variable
	       int n = scanner.nextInt();
	       LeapYear(n);

	}
	static void LeapYear(int year){
	    //Write code here
	     if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	         System.out.println("LeapYear");
	      else
	         System.out.println("NOt ALeapYear");
	   }

	

	}


