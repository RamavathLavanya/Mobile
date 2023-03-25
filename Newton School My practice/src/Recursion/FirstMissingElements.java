package Recursion;

import java.util.Scanner;

public class FirstMissingElements {

	  public static void findMissing(int arr[],int n){
	        int ans=0;
	        for(int i=1;i<=n+1;i++){
	            ans=ans^i;
	        }
	        for(int i=0;i<n;i++){
	            ans=ans^arr[i];
	        }
	        System.out.println(ans);
	    }
	    // 1- n+1

	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int arr[]=new int[n];
	        for(int i=0;i<n;i++){
	            arr[i]=sc.nextInt();
	        }
	        findMissing(arr,n);
	    }

	}
