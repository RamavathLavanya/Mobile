package Stack;

import java.util.Stack;

public class PushPop {

	public static void main(String[] args) {
	     
		 Stack<Integer> stack=new Stack<>();
	        stack.push(6);
	        stack.push(5);
	        stack.push(20);

	        System.out.println(stack.pop());
	        System.out.println(stack.pop());

	        System.out.println(stack.peek());
	        System.out.println(stack.size());
	        System.out.println(stack.isEmpty());

	}

}
