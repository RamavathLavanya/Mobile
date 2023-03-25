package SearchingAlgorithm;

public class Linear {
	
	public static int search(int arr[],int x) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]==x) {
				return i;
			}
		}
			
		
		return -1;
		
		
	}

	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6,10};
		int x=6;
		
		//function call
		int result=search(arr,x);
		if(result==-1) {
			System.out.println("Elemnt is not present");
		}else
			System.out.println("Elemnt is present"+" "+result);
			
		}
	}


