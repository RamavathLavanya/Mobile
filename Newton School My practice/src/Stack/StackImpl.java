package Stack;

import java.util.Scanner;

public class StackImpl {

	 int arr[];
	    int capacity; // how many elements stack can store
	    int top; // to keep track of top element
	    // n=7  -1[6,4,13,5,4,4, ]
	    //      t  0 1 2  3 4 5
	    // cap=7
	    // top =-1
	    StackImpl(int n){
	        arr=new int[n];
	        capacity=n;
	        top=-1; // stack is empty
	    }

	    public void push(int data){
	        if(top==capacity-1){ // overflow
	            System.out.println("Stack overflow");
	            return;
	        }
	        System.out.println("Adding the element in the stack");
	        top++;
	        arr[top]=data;
	    }

	    public int pop(){ // remove from stack and return
	        if(top==-1){
	            System.out.println("No elements");
	            return -1;
	        }
	        System.out.println("Removing the element from the stack");
	        int poppedElement=arr[top];
	        top--; //popping out the element
	        return poppedElement;
	    }

	    //  [ 3 4 7 13]
	    //          t

	    public int peek(){ //top
	        if(top==-1){
	            System.out.println("No elements");
	            return -1;
	        }
	        return arr[top];
	    }

	    public int size(){
	        return top+1;
	    }
	    // [4,6,134]
	    //  0 1  2

	    // stack using array  : using LL
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        StackImpl stack=new StackImpl(n); // create a stack of size n


	        System.out.println(stack.peek());
	        stack.push(6); //add an element in the stack
	        stack.push(13);
	        stack.push(4);

	        System.out.println(stack.pop()); //4
	        System.out.println(stack.pop()); //4
	        System.out.println(stack.pop()); //4
	        System.out.println(stack.pop()); //4

	        System.out.println(stack.peek()); //13

	        System.out.println(stack.size());


	    }
	}







