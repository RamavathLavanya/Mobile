package Stack;

import java.util.Stack;

public class NextGreaterToRight {

	public static void main(String[] args) {
		 int[] arr1 = {2, 5, 4, 1, 6};
         nextGreaterToRight(arr1);
         //  arr1=2, 5, 4, 1, 6
         // ans = 5 6 6 6 -1
	

	}
	
	 public static void nextGreaterToRight(int[] arr){
	        Stack<Integer> st = new Stack<>();
	        int[] result = new int[arr.length];
	        
	        // process array from right
	        for(int i = arr.length -1; i>=0; i--){
	            while(!st.isEmpty() && st.peek() < arr[i]){
	                st.pop();
	            }
	            
	            // if stack is empty that means no greater element exsits in right
	            // ans -1
	            if(st.isEmpty()){
	               result[i] = -1;
	            	
	            }
	            
	            // and is top of stack
	            else{
	                result[i] = st.peek();
	            }
	            
	            st.push(arr[i]);
	        }
	        
	        System.out.println("Next greater element to right");
	        for(int val: result){
	            System.out.print(val + " ");
	        }
	    }

}
