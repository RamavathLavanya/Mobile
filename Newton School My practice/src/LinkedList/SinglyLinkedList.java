package LinkedList;

public class SinglyLinkedList {
	
	 ListNode head; //instant variable nd type listnode
	
	public static class ListNode{
		
		 int data;  // generic type
	     ListNode next; //will provide next element of the node
	
	    public ListNode(int data) {  //constructor
		this.data=data;
		this.next=null;   //default value null
	}
	
	}
	
	//print the list
	public void printList() {
		
		//10 1 2 3
		//h=current
		ListNode current=head; //temporary node
		while(current !=null) {
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.println("null");
	}
	
	//Length of linked list
	public int length() {
		if(head==null) {
			return 0;
		}
		int count=0;
		ListNode current=head;
		while(current!=null) {
			count++;
			current=current.next;
		}
		return count;
	}
	
	//insert beginning of node
	public void insertFirst(int value) {
		ListNode newNode=new ListNode(value);
		newNode.next=head;
		head=newNode;
	}
	
	//insert last
	public  void insertLast(int value) {
		ListNode newNode=new ListNode(value);
		if(head==null) {
			head=newNode;
			return;
		}
		ListNode current=head;
		while(current.next!=null) {
			current=current.next;
		}
		//new node refer to the current node  ex:10=current 2=new node 
		current.next=newNode;
	}
	
	//insert a node at given position
	public void insert(int position,int value) {
		//1->2-> 3
		//1->6->3->4
		ListNode node=new ListNode(value);
		if(position==1) {
		node.next=head;
		head=node;
		} else {
			ListNode previous=head;
			int count=1; //position-1
			while(count<position-1) {
				previous=previous.next;
				count++;
			}
			ListNode current=previous.next;
			previous.next=node;
			node.next=current;
			
			
			
		}
		
	}
	
	//delete first node of singlylinked list
	public ListNode deleteFirst() {
		if(head==null) {
			return null;
		}
		ListNode temp=head;
		head=head.next;
		temp.next=null;
		return temp;
	}
	
	//delete last node
	public ListNode deleteLast() {
		if(head==null ||head.next==null) {
			return head;
		}
		ListNode current=head;
		ListNode previous=null; //second last node
		
		while(current.next!=null) {
			previous=current;
			current=current.next;
		}
		previous.next=null; // break the link bt first nd last
	    return current;
	}
	
	public static void main(String[]args) {
		
		SinglyLinkedList sll = new SinglyLinkedList();

//        sll.head= new ListNode(10);
//		
//		ListNode second=new ListNode(1);
//		ListNode third=new ListNode(8);
//		ListNode fourth=new ListNode(11);
//		
//		//Connected together form a chain
//		sll.head.next=second; //10-->1
//		second.next=third;   //10-->1-->8
//		third.next=fourth; //10-->1-->8-->11-->null
	
	    
//		sll.insertFirst(11);
//		sll.insertFirst(10);
//		sll.insertFirst(19);
		
		sll.insertLast(19);
		sll.insertLast(22);
		sll.insertLast(20);
		sll.insertLast(25);
		

	  
//		sll.insert(Position:1 ,value:3);//3->null
//		sll.insert(Position:2 ,value:5);//3->5->null
//		sll.insert(Position:1 ,value:2);//2->3->5->null
//		sll.insert(Position:2 ,value:4);//2->4->3->5->null
		
		
		sll.printList();
		System.out.println(sll.deleteLast().data);
		System.out.println(sll.deleteLast().data);
		System.out.println(sll.deleteLast().data);
		
		//System.out.println(sll.deleteFirst().data);
//		System.out.println(sll.deleteFirst().data);
//		System.out.println(sll.deleteFirst().data);
		
		
		
		
		sll.printList();
		
		System.out.println("Length is -> " + sll.length());
		//System.out.println();
	}
	

}
