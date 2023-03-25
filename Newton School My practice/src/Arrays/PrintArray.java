package Arrays;

public class PrintArray {
	
	public static void printArray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		
	}
	public static void Demo() {
		int[] n= new int[5];
		n[0]=10;
		n[1]=20;
		n[2]=30;
		n[3]=40;
		n[4]=50;
		printArray(n);
		
	}

	public static void main(String[] args) {
		PrintArray printarray=new PrintArray();
		printarray.Demo();

	}

}
