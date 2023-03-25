package Stack;

import java.util.Stack;

public class NextSmallerElementToLeft {

	public static void main(String[] args) {
		
		int[] arr= {2, 5, 4, 8, 1}; //-1, 2, 2, 4, -1
		        //i=0  1  2  3  4
		nextSmallerElementToLeft(arr);

	}
	
	public static void nextSmallerElementToLeft(int[] arr) {
		
		Stack<Integer> st=new Stack<>();
		int[] result=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			while(!st.empty() && st.peek()>arr[i] ) { //5>1
				st.pop();
			}
			if(st.empty()) {
				result[i]=-1;
				
			}
			
		
		 else { 
			 
			 result[i]= st.peek();
		 }
	
	    st.push(arr[i]);
		}
		System.out.println("Next small elenmets:");
		for(int val:result) {
			System.out.print(val+" ");

			
		}
	}

}
     
