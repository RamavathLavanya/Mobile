package Array2DArray;

import java.util.Scanner;

public class Array2DEXample {

	public static void main(String[] args) throws Exception {
		
		Scanner scn = new Scanner (System.in);
	    int n = scn.nextInt ();
	    int m = scn.nextInt ();
	    int arr[][] = new int[n][m];
	    for (int i = 0; i < arr.length; i++)
	    {
	      for (int j = 0; j < arr[i].length; j++)
	      {
	        arr[i][j] = scn.nextInt ();
	      }
	    }
	    for (int i = 0; i < arr.length; i++)
	    {
	      for (int j = 0; j < arr[i].length; j++)
	      {
	        System.out.print (arr[i][j] + " ");
	      }
	      System.out.println ();
	    
	  }
	}
	
	
	
	
	
	
	
	
	
	
//		try (Scanner sc = new Scanner(System.in)) {
//			int l=sc.nextInt();
//			int m=sc.nextInt();
//			
//			//input of 2d array
//			int[][] arr=new int[l][m];
//			for(int i=0;i<l;i++) {
//				for(int j=0;i<m;j++) {
//					arr[i][j]=sc.nextInt();
//				}
//			}
//			int n =arr.length;
//			for(int i=0;i<arr.length;i++) {
//				for(int j=0;j<arr[i].length;j++) {
//					System.out.print(arr[i][j]+" ");
//				}
//				System.out.println();
//			}
//		}
//        
//	}
//    11 12 12
 //   12 33 44
}
