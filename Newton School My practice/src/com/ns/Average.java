package com.ns;

import java.util.Scanner;

public class Average {
	
//	2. WAP to find average of 3 numbers

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the inputs=");
		int a=sc.nextInt();
		int b= sc.nextInt();
		int c=sc.nextInt();
		int average=0;
		int sum=0;
		sum=a+b+c;
		average=sum/3;
		System.out.println("The Average is :"+average);
	}

}
