package SearchingAlgorithm;

public class BinarySearch {
	
	int binarySearch(int arr[],int left,int right,int x) {
		
		if(right>=1) {
			int mid=left+(right-1);
			
			

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;
 
            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, left, mid - 1, x);
 
            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, right, x);
        }
 
        // We reach here when element is not present
        // in array
        return -1;
    }
		
	

	public static void main(String[] args) {
		BinarySearch obj=new BinarySearch();
		
		int arr[]= {2,4,5,6,10,8,6};
		int n=arr.length;
		int x=10;
		
		int result=obj.binarySearch(arr,0,n-1,x);
		if(result==-1) {
			System.out.println("Elemnt is not present");
		}else
			System.out.println("Elemnt is present"+" "+result);
			
		}
		

	}


