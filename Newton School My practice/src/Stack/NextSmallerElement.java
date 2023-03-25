package Stack;

public class NextSmallerElement {
	
	static void nextSmallerElement(int[] arr,int n) {
		
		int next = 0,i,j;
		
		// check ecah nd every elemnt
		for(i=0;i<n;i++) {
			
			//check smaller elemnets
			for(j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					next=arr[j];
					break;
					
				}
			}
			System.out.print(arr[i]+next+" ");
			
		}
	}

	public static void main(String[] args) {
		int[] arr= {2,4,6,8,9,10}; //
		int n=arr.length;
		nextSmallerElement(arr,n);

	}

}
