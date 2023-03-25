package Arrays;

import java.util.Scanner;

public class maxSumNoTwoAdjacent {

	//ele  //3 2    7   10
	  //sum  //3 3   10   13


	    // 5 15 50 9    50   20   40    6    4    40
	    // 5 15 55 55   105  105  145   145  149  185

	    // 5 50 50  40 40


	    public static int maxsum(int[] nums) {

	        if(nums.length==0){

	            return 0;

	        }

	        int curr =0;

	        int curr1 = nums[0];

	        int curr2=0;

	        for(int i=1;i<nums.length;i++){

	            curr = Math.max(curr1,curr2);

	            curr1 = curr2+nums[i];

	            curr2 = curr;

	        }

	        return Math.max(curr1,curr2);

	    }
	//   5        15       50        20
	//  max1=5   max1=55   max1=55   max2=55
	    //                           temp=15
	    public static int maxSumNoTwoAdjacent(int arr[],int n){
	        int max1=arr[0];
	        int max2=Math.max(arr[0],arr[1]);
	        for(int i=2;i<n;i++){
	            int temp=max1;
	            max1=max2;
	            max2=Math.max(temp+arr[i],max2);
	        }
	        return max2;
	    }

	    
	    //5 5 10 100 10  5   20  40 5
	    //5 5 15 105 105 110 125  150 150
	    
	    // 5 100 5 40
	    
	    public static void main(String[] args) {
	        // Array of +ve numbers
	        // Find max sum of elements - such that
	        // no two elements are adjacent

	        // 5 10 20 100 40

	        // 110

	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int arr[]=new int[n];
	        for(int i=0;i<n;i++){
	            arr[i]=sc.nextInt();
	        }
	        System.out.println(maxSumNoTwoAdjacent(arr,n));
	        //System.out.println(maxsum(arr));
	    }
	}
	








