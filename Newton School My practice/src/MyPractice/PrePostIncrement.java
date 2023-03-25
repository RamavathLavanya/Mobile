package MyPractice;

import java.util.Scanner;

public class PrePostIncrement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		for(int i=0;i<n;++i) {
			System.out.print(i+" ");
		}

	}

}
