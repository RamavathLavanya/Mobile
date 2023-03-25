package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoqueqes {
	
	Queue<Integer> q1=new LinkedList<>();
    Queue<Integer> q2=new LinkedList<>();


    public void push(int data){
        q2.add(data); //1
        while(!q1.isEmpty()){ //2   q1->q2
            q2.add(q1.remove());
        }
        // q2->q1 //3 swapping references
        Queue<Integer> temp=q1;
        q1=q2;
        q2=temp;
    }


    //  q1 ->   7 3 8 5

    //  q2->  -> ->
    //  temp---^
    //  q2->  [     ]
    //  q1->  [     ]

    public int pop(){
        if(q1.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return q1.remove();
    }

    public static void main(String[] args) {
        StackUsingTwoqueqes stack=new StackUsingTwoqueqes();
        stack.push(7);
        stack.push(11);
        stack.push(3);
        stack.push(89);

        System.out.println(stack.pop());//89
        System.out.println(stack.pop());//89
        System.out.println(stack.pop());
    }
}


