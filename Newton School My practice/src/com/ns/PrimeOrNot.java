package com.ns;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		
		System.out.println("Enter a number to check Prime or Not");
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int count=0;
        for(int i=2;i<=n/2;i++) {
        	if(n%i==0) {
        		count ++;
        		break;
        	}
        	i++;
        }
        if(count==0) {
        	System.out.println(n+"is a Prime");
        } else {
        	System.out.println(n+"is a Not a Prime");
        }
        	
        }
        }
      
