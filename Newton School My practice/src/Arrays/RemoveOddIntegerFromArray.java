package Arrays;

public class RemoveOddIntegerFromArray {
	
	public static void printArray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static int[]removeOddIntegers(int[] arr){
		int evenCount=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evenCount++;
			}
		}
		int[] result=new int[evenCount];
		int idx=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				result[idx]=arr[i];
				idx++;
				
			}
		}
		return result;
	}

	public static void main(String[] args) {
	
		int arr[]= {3,2,4,7,10,6,9};
		printArray(arr);
		int[]result=removeOddIntegers(arr);
		printArray(result);
	}

}
