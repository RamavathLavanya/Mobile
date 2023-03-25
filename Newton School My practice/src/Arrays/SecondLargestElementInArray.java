package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestElementInArray {
	
	static void print2largest(int[] arr,int n) {
		
		int i;
		
		//atleast2 elements
		if(n<2) {
			System.out.println("Invalid input");
			return;
		}
		
		//sort the array
		Arrays.sort(arr);
		
		 // Start from second last element
		  // as the largest element is at last
		for(i=n-2;i>=0;i--) {
			
			// If the element is not
		    // equal to largest element 7-1=6
			if(arr[i]!=n-1) {
				
			//System.out.printf("The second largest " + "element is %d\n", arr[i]);
				System.out.print("The second largest " +arr[i]);
             return;
			}
		}

		  System.out.printf("There is no second " +
		                    "largest element\n");
		}
	

	public static void main(String[] args) {
		
		    int arr[] = {10,3,45, 1 };
	        int n = arr.length;
	        print2largest(arr, n);
	}
}
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int[] arr=new int[n];
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
//			print2largest(arr,n);
//		}
//
//	}
//
//}
