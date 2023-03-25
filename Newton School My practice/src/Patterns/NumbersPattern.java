package Patterns;

import java.util.Scanner;

public class NumbersPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		
		int i=1;
		
		while(i<=n) {
			int space=1;
			
			while(space<=n-i) {
				System.out.print(" ");
				space++;
			}
			int j=1;
			while(j<=i) {
				System.out.print(j);
				j++;
//				
//				   1
//				  12
//				 123
//				1234

			}
			System.out.println();
			i++;
		}
	}
		}
		
//		for(int i=1;i<=n;i++){
//			for(int space=1;space<=n-i;space++) {
//				
//				System.out.print(" ");
//			for(int j=1;j<=i;j++) {
//				System.out.print(j);
//					
//					
//				}
//				
//			System.out.println();
//			}
//		}
//
//	}
//
//}
