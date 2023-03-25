package Patterns;

import java.util.Scanner;

public class SquarePattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++) {
        	for(int j=1;j<=n;j++) {
        		//System.out.print(n); // what we print if we print numbers
        		// 2 2
        		// 2 2
        		System.out.print("*"); // what we print if we print *
        		// * *
        		// * *
        		                         //  2 2
        		                        //   2 2 
        	}
        	System.out.println();
        }
	}
}
        	
//        
//        int i=1;
//        while(i<=n) {//for(int i=1;i<=n;i++)
//        	
//        	int j=1;
//        	while(j<=n) {
//        		
//        		System.out.print(n);
//        		j++;
//        		
//        	}
//        	System.out.println();
////        	i++;
//        }
//	}
//
//}
