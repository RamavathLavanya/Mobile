package Arrays;

public class AddorUpdate {
	
	public void printArray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
			System.out.println();
		
	}
	public void Demo() {
//		int myArray=new int[6];
		int[] n = new int[5];
		n[0]=1;
		n[1]=10;
		n[2]=14;
		n[3]=17;
		n[4]=100;
		n[3]=50;
		printArray(n);
		System.out.println(n.length);  //length of array
		System.out.println(n[n.length-1]); // last index of array 
		
		
		
	}

	public static void main(String[] args) {
		AddorUpdate addorupdate=new AddorUpdate();
		addorupdate.Demo();
		

	}

}
