package Patterns;

import java.util.Scanner;

public class ReverseTrianglePattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			int start=i;
			for(int j=1;j<=i;j++) {
				System.out.print(start);
				start--;
	// no.of rows in the pattern
	//no.of columns in ith row
	// what to print			
				
//				1
//				21
//				321
//				4321
//				54321

			}
			System.out.println();
		}
	}

}
