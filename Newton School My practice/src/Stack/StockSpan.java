package Stack;

import java.util.Stack;

public class StockSpan {
	
	 public static void stockSpan(int[] arr){
		 
	        Stack<Integer> st = new Stack<>();
	        int[] ans = new int[arr.length];

	        for(int i = 0; i < arr.length ; i++){
	            while(!st.isEmpty() && arr[st.peek()] < arr[i]){
	                st.pop();
	            }

	            if(st.isEmpty()){
	                ans[i] = 1;
	            }

	            else{
	                ans[i] = i - st.peek();
	            }

	            st.push(i);
	        }
	        
	        System.out.println("Stock Span Problem");
	        for(int val: ans){
	            System.out.print(val + " ");
	        }
	    }
	    
	    
	    
	    

	public static void main(String[] args) {
		
		int[] arr = {100, 80, 60, 70, 60, 75, 85}; // 
        stockSpan(arr);

	}

}
