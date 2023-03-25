package Arrays;

import java.util.Scanner;

public class ReverseArray {
	
	public static void printArray(int[] arr) {
		int n= arr.length;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
//	 1 2 3 4 5
//	 0 1 2 3 4
	public static void reverseArray(int[] n,int start,int end) {
		
		while(start<end) {
			int temp=n[start];
			n[start]=n[end];
			n[end]=temp;
			start++;
			end--;
		}
		
	}

	public static void main(String[] args) {
	int n[]= {1,2,3,4,5};
//		Scanner sc=new Scanner(System.in);
//		int n[]=new int[n];
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
//		}
		printArray(n);
		reverseArray(n,0,n.length-1);
		printArray(n);
		

	}

}
