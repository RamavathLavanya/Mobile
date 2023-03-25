package com.ns;

import java.util.Scanner;

public class StudentsGrades {
	
//	If percentage >= 85 print A grade,
//	If percentage < 85 && percentage >= 75 print B
//			grade,
//			If percentage < 75 && percentage >= 50 print C
//			grade,
//			If percentage < 50 && percentage >= 30 print D
//			grade,
//			If percentage <30 print fail

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the students marks");
				
		int m=sc.nextInt();
		int grades=0;
		
//		System.out.println("Enter the Anu marks"+grades);
//	
//			
//		
//		System.out.println("Enter the Sree marks"+grades);
//		
//		System.out.println("Enter the Mans marks"+grades);
//		
		if(m>=85) {
			System.out.println("A Grade");
		} else if(m<85) {
			System.out.println("B Grade");
		}else if(m<75) {
			System.out.println("C Grade");
		} else if(m<50) {
			System.out.println("D Grade");
		} else if(m<30) {
			System.out.println("Fail");
			
			
				
			}
		}

	}


