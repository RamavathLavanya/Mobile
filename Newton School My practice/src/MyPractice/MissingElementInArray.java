package MyPractice;

public class MissingElementInArray {
	
	public static void findMissing(int[] arr,int n) {
		int i;
		int temp[]=new int[n+1];
		for(i=0;i<n;i++) {
			temp[i]=0;
			
		}
		for(i=0;i<n;i++) {
			temp[arr[i]-1]=1;
		}
		
		int ans=0;
		for(i=0;i<=n;i++) {
			if(temp[i]==0) {
				ans=i+1;
			}
		}
			System.out.println(ans);
		
	}

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int[] arr=new int[n];
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
		int[] arr= {1, 3, 7, 5, 6, 2 };
		int n=arr.length;
			findMissing(arr,n);
		}
		

	}


