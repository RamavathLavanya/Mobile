package Queqe;

public class QueqeImpl {
	
	 int queue[];
	    int front;
	    int rear;
	    int capacity;

	    QueqeImpl(int n){
	        queue=new int[n]; //[ 3,8 ,7 ,7  , , , ]
	        capacity=n;//        f
	        front=0;//                     r
	        rear=0;
	    }

	    public void enqueue(int data){
	        if(rear==capacity){
	            System.out.println("Queue is full");
	            return;
	        }
	        queue[rear]=data;
	        rear++;
	    }

	    public int size(){
	        return rear;
	    }

	    public int peek(){
	        if(rear==0){
	            System.out.println("No elements present");
	            return -1;
	        }
	        return queue[front];
	    }

	    public boolean isEmpty(){
	        return (rear==0);
	    }

	    public int deque(){
	        if(rear==0){
	            System.out.println("No elements present");
	            return -1;
	        }
	        int dequeueElement=queue[front];

	        for(int i=0;i<=rear-2;i++){
	            queue[i]=queue[i+1];
	        }
	        rear--;

	        return dequeueElement;
	    }

	    public static void main(String[] args) {
	        QueqeImpl queue=new QueqeImpl(7);

	        queue.enqueue(97);
	        queue.enqueue(5);
	        queue.enqueue(3);
	        queue.enqueue(8);

	        System.out.println(queue.deque());
	        System.out.println(queue.deque());
	        System.out.println(queue.deque());
	        System.out.println(queue.deque());
	        System.out.println(queue.deque());

	        System.out.println(queue.size());
	        System.out.println(queue.peek());
	        System.out.println(queue.isEmpty());
	    }
	}

//	    Front <-3 7<-  Rear
//	           peek







