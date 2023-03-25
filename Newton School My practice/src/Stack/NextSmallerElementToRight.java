package Stack;

import java.util.Stack;

public class NextSmallerElementToRight {

	public static void main(String[] args) {
		int[] arr= {2, 5, 4, 8, 10};//-1 4 -1 -1 -1
		
		nextSmallerElementToRight(arr);

	}

	public static void nextSmallerElementToRight(int[] arr) {
		
		Stack<Integer> st=new Stack<>();
		int[] result=new int[arr.length];
		
		for(int i = arr.length -1; i>=0; i--){
            while(!st.isEmpty() && st.peek() > arr[i]){
                st.pop();
            }
            
            if(st.empty()) {
            	result[i]=-1;
            }
            
            else {
            	result[i]=st.peek();
            }
            st.push(arr[i]);
		
		
	}
		System.out.println("NextSmallerElementToRight");
		for(int val:result) {
			
			System.out.print(val+" ");
		}
			
		}

}
