package Recursion;

import java.util.Scanner;

public class PrintStrings {
	
	public static void printAllStringRecursively(char []ch,String str,int n,int k){
        if(k==0){  // base case
            System.out.println(str);
            return;
        }
        for(int i=0;i<n;i++){  // x y
            String ans=str+ch[i];
            printAllStringRecursively(ch,ans,n,k-1);
        }
    }

    // 1 -> k-1
    //       1->k-2
    //            1->k-3
    //                   ....0


    // xxx xxy xyx xyy yxx yxy yyx yyy



    //    x y z   -> 3

    // x  - 9
    //    xx
    //      xxx
    //      xxy
    //      xxz

    //    xy
    //      xyx
    //      xyy
    //      xyz

    //    xz
    //      xzx
    //      xzy
    //      xzz



    // y  - 9

    //     yx
    //       yxx
    //       yxy
    //       yxz

    //     yy
    //        yyx
    //        yyy
    //        yyz


    //     yz
    //         yzx
    //         yzy
    //         yzz





    // z  - 9

    //       zx
    //          zxx
    //          zxy
    //          zxz

    //       zy
    //         zyx
    //         zyy
    //         zyz

    //       zz
    //         zzx
    //         zzy
    //         zzz

    public static void printStrings(char []ch, int n,int k){
        printAllStringRecursively(ch,"", n ,k);
    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
      int n= sc.nextInt();
      int k=sc.nextInt();
      char[] ch=new char[n];
      
      for(int i=0;i<n;i++) {
    	  ch[i]=sc.next().charAt(0);
      }
      printStrings(ch,n,k);
	}

}
