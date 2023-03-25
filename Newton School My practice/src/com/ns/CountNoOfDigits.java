package com.ns;

import java.util.Scanner;

public class CountNoOfDigits {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int count=0;
		
//		for (; n != 0; n /= 10, ++count) {
//	    }
		while(n!=0) {
			n/=10;
			count++;
		}
		
		
		 System.out.println("Number of digits: " + count);
	}
	}

		
//		 int count = 0, num = 0003452;
//
//		    while (num != 0) {
//		      // num = num/10
//		      num /= 10;
//		      ++count;
//		    }
//
//		    System.out.println("Number of digits: " + count);
//		  }

	


