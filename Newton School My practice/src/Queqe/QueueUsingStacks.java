package Queqe;

import java.util.Stack;

public class QueueUsingStacks {
	
	Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();

    public void enqueue(int data){
        while(!s1.isEmpty()){
            s2.push(s1.pop()); //s1 to s2 
        }
        s1.push(data);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public int dequeue(){
        if(s1.empty()){
            return -1;
        }
        return s1.pop();
    }

    public static void main(String[] args) {
    	QueueUsingStacks queue=new QueueUsingStacks();

        queue.enqueue(7);
        queue.enqueue(11);
        queue.enqueue(4);
        queue.enqueue(19);

        System.out.println(queue.dequeue());  // 7
        System.out.println(queue.dequeue());  // 11

        queue.enqueue(99);

//        System.out.println(queue.dequeue());  // 4
//        System.out.println(queue.dequeue());  // 19
////        System.out.println(queue.dequeue());  // 99
//        System.out.println(queue.dequeue());  // -1

    }
}

	