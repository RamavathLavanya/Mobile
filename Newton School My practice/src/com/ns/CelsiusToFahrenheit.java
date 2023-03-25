package com.ns;

import java.util.Scanner;

public class CelsiusToFahrenheit {
	
//	4. WAP to convert temperature in degree Celsius to
//	Fahrenheit

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 float celsius, fahrenheit;
//		 System.out.println("Program to convert Celsius to Fahrenheit" );
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Please give the Celsius Temperature");
		 
		 celsius= sc.nextFloat();
		 fahrenheit = (celsius * 9 / 5) + 32;
		 System.out.printf("Fahrenheit = %.2f",fahrenheit);
	}

	}


