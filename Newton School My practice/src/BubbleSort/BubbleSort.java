package BubbleSort;

public class BubbleSort {
	
	 void bubbleSort(int[] arr) {
		 int n=arr.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		
		
	}
	public static void printArray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		}
	

	public static void main(String[] args) {
		BubbleSort obj=new BubbleSort();
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int[] arr=new int[n];
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
		int[] arr= {64,25,12,22,11};//1 2 2 2 3 4
			
		//	bs.printArray(arr, n);
			obj.bubbleSort(arr);
			System.out.println("Sorted Array");
			obj.printArray(arr);
		}

	}


