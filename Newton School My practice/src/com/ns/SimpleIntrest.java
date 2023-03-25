package com.ns;

import java.util.Scanner;

public class SimpleIntrest {
	
//	3. WAP to find Simple Interest

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        //Declare variables
        float p, r, t, si;
        System.out.println("Enter the Principal : ");
        p = sc.nextFloat();     //Initialize the variables
        System.out.println("Enter the Rate of interest : ");
        r = sc.nextFloat();     //Initialize the variables
        System.out.println("Enter the Time period : ");
        t = sc.nextFloat();     //Initialize the variables
        sc.close();
        //Calculate the simple interest
        si = (p * r * t) / 100;
        //Print the simple interest
        System.out.println("Simple Interest is: " +si);

	}

}
