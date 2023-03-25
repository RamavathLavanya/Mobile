package Arrays;

public class LargetsThreeElementsInArray {
	
	static void print3largest(int[] arr,int n) {
		
		int i,first,second,third;
		
		if(n<3) {
			System.out.println("Invalid input");
			return;
		}
		
		first=second=third=Integer.MIN_VALUE;
		//nteger.MIN_VALUE=-246---
		for(i=0;i<n;i++) {
			
			//20,10,50,4,5
			if(arr[i]>first) {
				third=second;
				second=first;
				first=arr[i];
			}
				
				
				//If arr[i] is in between first and
	           // second then update second  
	            else if (arr[i] > second) {
	                third = second;
	                second = arr[i];
	            }
	 
	            else if (arr[i] > third)
	                third = arr[i];
	        }
	 
	        System.out.println("Three largest elements are " + first + " " + second + " " + third);
	   
	}			
		

	public static void main(String[] args) {
	     
		int arr[]= {20,10,50,4,5};
		int n=arr.length;
		print3largest(arr,n);

	}

}
