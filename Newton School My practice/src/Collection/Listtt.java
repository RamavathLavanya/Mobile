package Collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class Listtt {
	 public static void main(String[] args) {
		 
	        List<String> list1=new ArrayList<>();

	        list1.add("Rohit");
	        list1.add("Soumya");
	        list1.add("Rohit");
	        list1.add("Rakibul");
	        list1.add("Raef");
	        list1.add("Raksefewfew");
	        list1.add("Rewfewf");

	        System.out.println(list1);

	        Collections.sort(list1);
	        Collections.sort(list1,Collections.reverseOrder());

	        System.out.println(Collections.frequency(list1,"Rt"));
	        System.out.println(list1);

	        //comparators and comparables

	        //                  2

	        //arr [5, 7, 9, 4, 9 ,2 , , , ,  ]



	        List<Integer> list2=new LinkedList<>();
	        list2.add(5);
	        list2.add(7);
	        list2.add(4);
	        list2.add(8);

	        System.out.println(list2);


	        List<Integer> list3=new Vector<>();



	        // vecrot  [100,200,300,400]     500 ,removelast    user
	        // arraylist



	        Stack<Integer> list4=new Stack<Integer>();
	        list4.push(6);
	        list4.pop();


	        /// Queue -> Deququ  -> Arraydequq
	        //                      linkedlist

	        Deque<Integer> deque=new ArrayDeque<>();

	        deque.addLast(5);
	        deque.addLast(15);
	        deque.addLast(75);
	        deque.addLast(509);
	        deque.addFirst(5009);

	        System.out.println(deque);


	        //Set(unordered elements) (duplicates not allowed)

	        //Set  - hashset, linkedhasset
	        //sortedset NavigableSet-> treeset
	        Set<String> set=new HashSet<>();  //-> Hashtable -> Hashing (unique)
	        set.add("Rohit");
	        set.add("Mohit");
	        set.add("Newton");
	        set.add("Rohit");

	        System.out.println(set);

	        System.out.println("LikedHashset");
	        Set set1=new LinkedHashSet(); // Linked list implemenation  | order is maintained
	        set1.add("Rohit");
	        set1.add("Mohit");
	        set1.add("Newton");
	        set1.add("Rohit");

	        System.out.println(set1);


	        System.out.println("Treeset");
	        Set set2=new TreeSet(); // ascending order
	        set2.add("Rohit");
	        set2.add("Mohit");
	        set2.add("Newton");
	        set2.add("Rohit");

	        System.out.println(set2);
	        
	        // Map ()K,V pair - entry Faster search
             
	        System.out.println("HashMap");
	        Map<Integer,String> map=new HashMap<>(); // order is not maintained
	        map.put(2,"Rohit");
	        map.put(8,"Mohit");
	        map.put(4,"Nohit");
	        map.put(2,"Pohit");

	        System.out.println(map);

             
	        System.out.println("LinkedHashMap");
	        Map<Integer,String> map1=new LinkedHashMap<>(); // maintains order


	        map1.put(2,"Rohit");
	        map1.put(8,"Mohit");
	        map1.put(4,"Nohit");
	        map1.put(2,"Pohit");

	        System.out.println(map1);

	        Map<Integer,String> map2=new TreeMap<>();// ascending order

	        map2.put(2,"Rohit");
	        map2.put(8,"Mohit");
	        map2.put(4,"Nohit");
	        map2.put(2,"Pohit");

	        System.out.println(map2);
	 }
}













	        // Hashset [30 40 50]




//Collection ->   List  (Ordered collection)(can have duplicates)
//Linkedlist(doubly linked list), arraylist(non sychronized, dynamic array), vector(synchronized,dynamic array)-> Stack

//              Queue(FIFO)  - ordered  first in first out
//PriorityQueue (Heap)  , Deque interface(add , remove from both sides)  - Implemented by ArrayDeque & LinkedList

//              Set

//             Map







