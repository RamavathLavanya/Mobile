
package Patterns;

import java.util.Scanner;

public class TriangleCharacterPattern {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	for(int i=1;i<=n;i++) {
		char start=(char)('A'+i-1); 
		//char start=(char)('A'+i);
		for(int j=1;j<=i;j++) {
			System.out.print(start);
			start=(char)(start+1);
			
//			A   /// A
//			BC   // B B
//			CDE  // C C C
//			DEFG
//			EFGHI

		}
		System.out.println();
	}

	}

}
