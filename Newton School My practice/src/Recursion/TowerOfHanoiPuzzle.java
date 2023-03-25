package Recursion;

import java.util.Scanner;

public class TowerOfHanoiPuzzle {
	
	public static void printTowersOfHanoi(int n,String frompeg,String topeg,String auxpeg ) {
		
		//if only one desk can move
		if(n==1) {
			System.out.printf("Move disk 1 from peg %c to peg %c"+frompeg,topeg);
			return;
		}
		//move top disks n-1 from a to b using c as auxillary
		printTowersOfHanoi(n-1,frompeg,auxpeg,topeg);
		
		//move remaining disks a to c
		System.out.printf("/nMove disk from peg %c to peg%c"+n, frompeg,topeg);
		
		//move n-1 disks from b to c use a as auxillary
		printTowersOfHanoi(n-1,auxpeg,topeg,frompeg);
	}


		
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String frompeg=sc.next();
		String topeg=sc.next();
		String auxpeg=sc.next(); 
		
		printTowersOfHanoi(n,frompeg,topeg,auxpeg);
		
		
		
	}

}
