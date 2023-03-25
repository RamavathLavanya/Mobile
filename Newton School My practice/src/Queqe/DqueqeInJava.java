package Queqe;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DqueqeInJava {

	public static void main(String[] args) {
		
		 Queue<Integer> queue=new LinkedList<>();
	        queue.add(19);   //<-[]<-
	        queue.remove();
	        Deque<Integer> deque=new LinkedList<>();
	        deque.addLast(56);
	        deque.addFirst(67);
	        deque.addLast(89);

	       // System.out.println(deque.removeLast());  //89
	       // System.out.println(deque.removeFirst()); //67

	        System.out.println(deque.isEmpty());
	        System.out.println(deque.size());

	        System.out.println(deque.peekLast());
	        System.out.println(deque.peekFirst());


	    }
	}

//	     67  56  89



	//Animal   -> Cow
//	         -> Ping

	// Animal cow=new Cow();

	