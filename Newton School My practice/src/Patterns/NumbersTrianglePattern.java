package Patterns;

import java.util.Scanner;

public class NumbersTrianglePattern {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	for(int i=1;i<=n;i++) { //rows
		for(int j=1;j<=i;j++) { //columns

           // System.out.print(i);
            
			
////	    1                              
//			22
//			333
//			4444
//			55555
  
		//	System.out.print("*");
			
//			*
//			**
//			***
//			****
//			*****
			System.out.print(j);
//			
//			1
//			12
//			123
//			1234
//			12345

			
		}
		System.out.println();
	}
	}
}
	
//	int i=1;
//	
//	while(i<=n) {
//		
//		int j=1;
//		while(j<=i) {
//			System.out.print(i);
//			j++;
//		}
//		System.out.println();
//		i++;
//	}
//
//	}
//
//}
