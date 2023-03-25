package Arrays;

public class MinimumValueInArray {
	
	
	public static void printArray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public int minimumValue(int[] arr) {
		
//		it holds the min value of the array 
//		6,2,15,6,8,9
//		0 1 2 3 4 5 arr.l=6 1<6
	    int min=arr[0];  
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			
		}
		return min;
		
	}

	public static void main(String[] args) {
		int n[]= {6,2,15,10,8,9};
		printArray(n);
		MinimumValueInArray mva=new MinimumValueInArray();
		System.out.print("Minimum Value is"+ " "+mva.minimumValue(n));
		
		

	}

}
