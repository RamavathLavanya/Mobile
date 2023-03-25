package ForLoops;

import java.util.Scanner;

public class Sum {
	
//	public static void printSum(int n) {
//		int sum=0;
//		for(int i=1;i<=n;i++) {
//			sum+=i;
//			System.out.println("Sum ="+sum);
//		}
//	}

	public static void main(String[] args) {
		
		int sum=0;
		int n=1000;
		for(int i=1;i<=n;i++) {
			sum+=i;
			System.out.println("Sum ="+sum);
		}
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the input");
//		int n=sc.nextInt();
//		printSum(n);

	}

}
