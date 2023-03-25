package Arrays;

public class MaximumValueInArray {
	
	public static void printArray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public int maximumValue(int[] arr) {
		
//		it holds the min value of the array 
//		6,2,15,6,8,9
//		0 1 2 3 4 5 arr.l=6 1<6
	    int max=arr[0];  
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		return max;
		
	}

	public static void main(String[] args) {
		int n[]= {6,2,15,10,8,9};
		printArray(n);
		MaximumValueInArray mva=new MaximumValueInArray();
		System.out.print("Maximum Value is"+ " "+mva.maximumValue(n));
		
		

	}

}
