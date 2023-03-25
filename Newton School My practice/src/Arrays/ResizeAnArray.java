package Arrays;

public class ResizeAnArray {
	
	public static void printArray(int[] arr) {
		
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public int[] reSize(int[] arr,int capacity) {
		
		int [] temp=new int[capacity];
		for(int i=0;i<arr.length;i++) {
			temp[i]=arr[i];
		}
		arr=temp;
		return arr;
	}

	public static void main(String[] args) {
		
		ResizeAnArray arrayUtil=new ResizeAnArray();
		int[] original=new int[] {1,2,3,4,5};
		System.out.println("The Size of An Original Array:"+original.length);
		original=arrayUtil.reSize(original,10);
		System.out.println("The Size of An Original Array after resize:"+original.length);
		
		

	}

}
