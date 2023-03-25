package SlidingWindow;

import java.util.Scanner;

public class SlidingWindow {
	
	// k<=n
    public static int maxSumSubArray(int arr[],int n,int k){
        int ans=0;
        for(int i=0;i<k;i++){  // [1-k]
            ans=ans+arr[i];
        }
        // k= 34
        //  0 1 2 3 4 5 6 7   k=4
        //            i

        int sumOfNextWindow=ans;
        for(int i=k;i<n;i++){ //  [k=n]
            sumOfNextWindow=ans+arr[i]-arr[i-k];
            ans=Math.max(ans,sumOfNextWindow);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr =new int[n];
        
        int k=sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
//    	int[] arr= {0, 1, 2, 3, 4, 5, 6, 7};
        System.out.println(maxSumSubArray(arr,n,k));
    }
}
//sample inputs
//6
//2 3 4 5 8 9
//4
//17


