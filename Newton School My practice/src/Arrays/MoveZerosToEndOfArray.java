package Arrays;

public class MoveZerosToEndOfArray {
	
	public static void printArray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public void arrayDemo() {
		int n[]= {12,0,33,4,0,9};
		printArray(n);
		moveZeros(n,n.length);
		printArray(n);
		
		
	}
	
	public static void moveZeros(int[] arr, int n) {
		
//		focus on zeros elemnt
	     int j=0;  
		
//		j=0;n=7 i is focused on non zeros element
		for(int i=0;i<n;i++) {
			if(arr[i]!=0 && arr[j]==0) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			}
			if(arr[j]!=0) {
				j++;
				
			}
			
			
		}
	}

	public static void main(String[] args) {
//	
		MoveZerosToEndOfArray arrayUtil=new MoveZerosToEndOfArray();
		arrayUtil.arrayDemo();
		

	}

}
