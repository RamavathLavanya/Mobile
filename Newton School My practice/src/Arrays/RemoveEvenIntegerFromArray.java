package Arrays;

public class RemoveEvenIntegerFromArray {
	
	public static void printArray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static int[] removeEvenInteger(int[] arr) {
		int oddCount=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				oddCount++;
			}
		}
		int[]result=new int[oddCount];
		int idx=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				result[idx]=arr[i];
				idx++;
				
			}
			
		}
		return result;
	}
	
	

	public static void main(String[] args) {
//		RemoveEvenIntegerFromArray reia=new RemoveEvenIntegerFromArray();
//		reia.removeEvenInteger();
		int arr[]= {3,2,4,7,10,6,9};
		printArray(arr);
		int[]result=removeEvenInteger(arr);
		printArray(result);

	}

}
