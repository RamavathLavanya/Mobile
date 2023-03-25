package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
	
	 Queue<Integer> queue=new LinkedList();

	    public void push(int data){
	        int n=queue.size(); //5

	        queue.add(data);  //6th

	        while(n-- >0){
	            queue.add(queue.remove());
	        }

	    }

	    public int pop(){
	        if(queue.isEmpty()){
	            return -1;
	        }
	        return queue.remove();
	    }


	    public static void main(String[] args) {
	        StackUsingQueue stack=new StackUsingQueue();
	        stack.push(9);
	        stack.push(14);
	        stack.push(7);
	        stack.push(98);

	        System.out.println(stack.pop()); // 98

	        stack.push(78);

	        System.out.println(stack.pop()); // 78
	        System.out.println(stack.pop()); // 7
	        System.out.println(stack.pop()); // 14
	        System.out.println(stack.pop()); // 9
	        System.out.println(stack.pop()); // -1


	    }
	}


