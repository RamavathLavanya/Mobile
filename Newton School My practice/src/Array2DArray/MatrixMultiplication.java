package Array2DArray;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args)throws Exception {
		
		    Scanner scn = new Scanner(System.in);
		    int n1 = scn.nextInt();
		    int m1 = scn.nextInt();
		    int[][] arr1 = new int[n1][m1];
		    for (int i = 0; i < n1; i++) {                      //1
		      for (int j = 0; j < m1; j++) {
		        arr1[i][j] = scn.nextInt();
		      }
		    }
		    int n2 = scn.nextInt();
		    int m2 = scn.nextInt();
		    int[][] arr2 = new int[n2][m2];
		    for (int i = 0; i < n2; i++) {                      //2
		      for (int j = 0; j < m2; j++) {
		        arr2[i][j] = scn.nextInt();
		      }
		    }

		    if (m1 != n2) {
		      System.out.print("Invalid input");              //3
		      return;
		    }
		    int[][] ans = new int[n1][m2];
		    for (int i = 0; i < n1; i++) {
		      for (int j = 0; j < m2; j++) {                  //4
		        for (int k = 0; k < m1; k++) {
		          ans[i][j] += (arr1[i][k] * arr2[k][j]);
		        }
		      }
		    }
		    for (int i = 0; i < n1; i++) {
		      for (int j = 0; j < m2; j++) {
		        System.out.print(ans[i][j] + " ");          //5
		      }
		      System.out.println();
		    }
		  }
		}
	
     
//		Scanner scn=new Scanner(System.in);
//		int r1=scn.nextInt();
//		int c1=scn.nextInt();
//		
//		//input of 2 d matrix
//		int [][] one=new int[r1][c1];
//		for(int i=0;i<one.length;i++) {
//			for(int j=0;j<one.length;j++) {
//				one[i][j]=scn.nextInt();
//			}
//		}
//		
//		int r2=scn.nextInt();
//		int c2=scn.nextInt();
//		
//		int [][] two=new int[r2][c2];
//		for(int i=0;i<two.length;i++) {
//			for(int j=0;j<two.length;j++) {
//				one[i][j]=scn.nextInt();
//			}
//		}
//		
//		if(c1!=r2) {
//			System.out.println("Invalid input");
//			return;
//		}
//		
//		int [][] prd=new int[r1][c2];
//		for(int i=0;i<prd.length;i++) {
//			for(int j=0;j<prd[0].length;j++) {
//				for(int k=0;k<c1;k++) {
//					prd[i][j]+=one[i][k]*two[k][j];
//					
//				}
//				
//			}
//		}
//		
//		for(int i=0;i<prd.length;i++) {
//			for(int j=0;j<prd[0].length;j++) {
//				System.out.print(prd[i][j]+" ");
//		
//
//	}
//			System.out.println();
//		}
//	}
//
//}
