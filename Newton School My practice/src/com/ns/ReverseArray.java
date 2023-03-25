package com.ns;

import java.util.Scanner;

public class ReverseArray {
	
	public static void reverseArray(int arr[],int start,int end) {
		int temp;
		
		while(start<end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
	}
	static void printArray(int arr[],int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
			
			System.out.println();
		}
		
	}
	

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the Array");
//		int n=sc.nextInt();
//		int arr[]=new int[n];
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
//		}
		
		int arr[]= {1,2,3,4,5,6};
		
		printArray(arr,6);
		
//        int start=0;
//		int end = 0;
//	
		reverseArray(arr, 0, 5);
	        System.out.print("Reversed array is \n");
	        printArray(arr,6);

	        
		
	}

}
