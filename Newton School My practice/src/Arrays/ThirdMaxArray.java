package Arrays;

public class ThirdMaxArray {
	
	public static void printArray(int[] arr) {
		int n= arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public int thirdMax(int[] arr) {
		int max=Integer.MIN_VALUE;
		int thirdMax=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				thirdMax=max;
				max=arr[i];
			} else if(arr[i]>thirdMax && arr[i]!=max) {
					thirdMax=arr[i];
				}
			}
			return thirdMax;
		}
	


	public static void main(String[] args) {
		int n[]= {12,34,33,4,5,9};
		ThirdMaxArray tma=new ThirdMaxArray();
		printArray(n);
		System.out.println("Third Max is :"+tma.thirdMax(n));
		

	}

}
