package PrefixArray;

import java.util.Scanner;

public class PrefixArray {

	
	  public static void printPrefixArray(int arr[],int n){
	        int brr[]=new int[n];
	        brr[0]=arr[0];
	        for(int i=1;i<n;i++){
	            brr[i]=brr[i-1]+arr[i];
	        }

	        for(int i=0;i<n;i++){
	            System.out.println(brr[i]);
	        }

	    }
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int arr[]=new int[n];
	        for(int i=0;i<n;i++){
	            arr[i]=sc.nextInt();
	        }

	        printPrefixArray(arr,n);
	    }

	}




