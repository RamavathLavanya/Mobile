package Patterns;

import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int i=1;
		while(i<=n) {
			 int space=1;
			 while(space<=n-i) {
				 System.out.print(" ");
				 space++;
			 }
			 
			 int j=1;
			 while(j<= 2*i-1) {
				 
//				 System.out.print(j);
//				 
//				    1
//				   123
//				  12345
//				 1234567
//				123456789

				 
				 System.out.print("*");
				 j++;
				 
//				    * //1 2*1-1
//				   *** // 3 //2*2-1
//				  ***** //5 //2*3-1
//				 ******* //7
//				********* //0

				 
			 }
			 System.out.println();
			 i++;
		}

	}

}
