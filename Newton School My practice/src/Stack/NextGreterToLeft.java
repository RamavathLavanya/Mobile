package Stack;

import java.util.Stack;

public class NextGreterToLeft {

	public static void main(String[] args) {
	      
		System.out.println();
		int[] arr= {5, 2, 3, 1, 9, 8}; //-1 5 5 3 -1 9 
		
		nextGreterToLeft(arr);
		

	}
	
	public static void nextGreterToLeft(int[] arr) {
		Stack<Integer> stack=new Stack<>();
		int[] result=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			while(!stack.empty() && stack.peek()< arr[i]) {
				stack.pop();
			}
			 // if stack is empty that means no greater element exsits in right
            // ans -1
            if(stack.isEmpty()){
                result[i] = -1;
            }
            
            // and is top of stack
            else{
                result[i] = stack.peek();
            }
            
            stack.push(arr[i]);
        }
        
        System.out.println("Next greater element to left");
        for(int val: result){
            System.out.print(val + " ");
        }
    }
		
		
	}


