package Arrays;

public class MissingNumberInArray {
	
	public static void printArray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static int findMissingNumber(int[] arr) {
		int n=arr.length+1;
		int sum=n*(n+1)/2;
		for(int num:arr) {
			sum=sum-num;
		}
		return sum;
	}
	public void arryDemo() {
		int[] arr= {1,3,5,6,2,4,7};
		System.out.println(findMissingNumber(arr));
	}

	public static void main(String[] args) {
		MissingNumberInArray arrayUtil=new MissingNumberInArray();
		arrayUtil.arryDemo();

	}

}
