package com.ns;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
//		ipfrom the user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check factorial");
		int n=sc.nextInt();
		
		int fact=1;
		
		for(int i=1;i<=n;i++) {
			fact=fact*i;
			
//			System.out.println("\\nFactorial of \" + num + \" is: \" + fact");
			 System.out.println(n + fact);
		}
		}
		
	}
		
//		 int fact = 1;  
//	        int i = 1;  
//	  
//	        //creating object of Scanner class  
//	        Scanner sc = new Scanner(System.in);  
//	  
//	        //accepting a number from the user  
//	        System.out.println("Enter a number whose factorial is to be found: ");  
//	        int num = sc.nextInt();  
//	          
//	        //counting the factorial using while loop  
//	        while( i <= num ){  
//	            fact = fact * i;   
//	            i++; //increment i by 1   
//	        }     
//	  
//	        //printing the result  
//	        System.out.println("\nFactorial of " + num + " is: " + fact);  
//	    }  
//	}  
	