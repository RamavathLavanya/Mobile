package Queqe;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueqeImp {
	
	public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        Queue<Integer> queue=new LinkedList<>();
        //int n=sc.nextInt();
        queue.add(sc.nextInt());  // enqueue
        queue.add(sc.nextInt());
        queue.add(sc.nextInt());
        queue.add(sc.nextInt());

        System.out.println(queue.remove());  // dequeue
        System.out.println(queue.remove());  // dequeue

        System.out.println(queue.size());

        System.out.println(queue.isEmpty());

        System.out.println(queue.peek());
    }
}

//    Front <-3 7<-  Rear
//           peek



