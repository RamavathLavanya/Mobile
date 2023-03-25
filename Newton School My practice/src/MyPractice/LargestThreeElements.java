package MyPractice;

import java.util.Scanner;

public class LargestThreeElements {
	
	// private static final int i = 0;

	public static void  printLargestThreeElements(int[] arr,int n) {
		
      int i,first,second,third;
		
		if(n<3) {
			System.out.println("Invalid input");
			return;
		}
		
		first=second=third=Integer.MIN_VALUE;
		//nteger.MIN_VALUE=-246---
		for(i=0;i<n;i++) {
			
			//20,10,50,4,5
			if(arr[i]>first) {
				third=second;
				second=first;
				first=arr[i];
			}
				
				
				//If arr[i] is in between first and
	           // second then update second  
	            else if (arr[i] > second) {
	                third = second;
	                second = arr[i];
	            }
	 
	            else if (arr[i] > third)
	                third = arr[i];
	        }
	 
	        System.out.println("Three largest elements are " + first + " " + second + " " + third);
	   
	}			
	
		 
//		 int i,first,second,third;
//		 if(n<3) {
//			 System.out.println("Invalid");
//			 return;
//			 
//		 }
//		 first=second=third=Integer.MIN_VALUE;
//		
//			for(i=0;i<n;i++) {
//			if(arr[i]>first) {
//				 
//				 third = second;
//				 second=first;
//				 first=arr[i];
//				 
//			 }
//			 else if(arr[i]>second) {
//				 third=second;
//				 second=arr[i];
//			 
//		 }
//			 else if(arr[i]>third) {
//				 third=arr[i];
//			 }
//			 System.out.print(first+" "+second+" "+third);
//		
//	}
//	}

	public static void main(String[] args) {

			//		Scanner sc=new Scanner(System.in);
//		int n= sc.nextInt();
//		int[] arr=new int[n];
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
		int[] arr= {20,10,30,5,6,7};
		int n=arr.length;
			
			printLargestThreeElements(arr,n);
		}

	}



