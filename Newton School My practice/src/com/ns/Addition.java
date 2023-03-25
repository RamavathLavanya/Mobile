package com.ns;

import java.util.Scanner;

public class Addition {
	
//	1.WAP to take 2 numbers as input and print the
//	addition of those 2 numbers

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the inputs");
		int a=sc.nextInt();
		int b= sc.nextInt();
//		int c=a+b;
		int sum=0;
		sum=a+b;
		System.out.println(sum);
	}

}
