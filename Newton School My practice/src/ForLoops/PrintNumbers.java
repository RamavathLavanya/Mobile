package ForLoops;

import java.util.Scanner;

public class PrintNumbers {
	
	public static void printNumbers(int n) {
		for(int i=0;i<n;i++) {
			System.out.println(i);
			System.out.println("Anu");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		printNumbers(n);
	}

}
