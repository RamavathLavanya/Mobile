package Arrays;

public class SecondMaximumValueInArray {
	
	public static void printArray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}
	
//	integer.MIN_VALUE=-21474836
	
	public int secondMax(int[] arr) {
		int max=Integer.MIN_VALUE;
		int secMax=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
//			12>-21478
			if(arr[i]>max) {
				secMax=max;
				max=arr[i];
			} else if(arr[i]>secMax && arr[i]!=max) {
				secMax=arr[i];
			}
		}
		return secMax;
	}

	public static void main(String[] args) {
		int n[]= {12,34,33,4,5,9};
		printArray(n);
		SecondMaximumValueInArray smva=new SecondMaximumValueInArray();
		System.out.println("Second Maximum Value is:"+smva.secondMax(n));
//		printArray(n);
		
		

	}

}
