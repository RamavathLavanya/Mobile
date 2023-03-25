package Patterns;

import java.util.Scanner;

public class ReverseCharacterPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) { //rows loop
		char start=(char)('A'+n-i); //init start
		for(int j=1;j<=i;j++) { //columns loop
			System.out.print(start);
			start=(char)(start+1);
			
//			E
//			DE
//			CDE
//			BCDE
//			ABCDE


	}
		System.out.println();
		}
	}

}
