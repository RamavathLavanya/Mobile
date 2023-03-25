package DoubleLinkedList;

public class DLLScratchImpl {
	
	  Node head;
	    int size;

	    class Node{
	        String data;
	        Node next;
	        Node prev;

	        Node(String str){
	            this.data=str;
	            this.next=null;
	            this.prev=null;
	        }
	    }


	    // head->null  n1


	    // head -> [null<- My ->nnull]

	    public void addFirst(String str){
	        Node newNode=new Node(str);  //  [null My null]
	        newNode.next=head;
	        if(head!=null) {
	            head.prev = newNode;
	        }
	        head=newNode;
	        size++;
	    }

	    public int getSize(){
	     return size;
	    }


	    //  head->    [  null<-Manoj-><-Is-><-Friend-><-Best-><-My->null ]
	    //                                                            p
	    public void printList(){
	        Node ptr=head;
	        System.out.print("null");
	        while(ptr!=null){
	            System.out.print("<-" + ptr.data + "->");
	            ptr=ptr.next;
	        }
	        System.out.println("null");
	    }

	    public void recursivePrint(Node head){
	        if(head==null){
	            System.out.print("null");
	            return;
	        }
	        System.out.print("<-" + head.data + "->");
	        recursivePrint(head.next);
	    }
	// head -> [null A null]


	    //head ->   null<-Manoj-><-Is-><-Friend-><-Best-><-My->  <- A null]
	    //                                                 ptr
	    public void addLast(String str){
	        Node newNode=new Node(str);  //  [null A null]


	        if(head==null){ //list is empty
	            head=newNode;
	            return;
	        }
	        //
	        Node ptr=head;
	        while(ptr.next!=null){
	            ptr=ptr.next;
	        }
	        ptr.next=newNode;
	        newNode.prev=ptr;
	    }


	    //null<-Manoj-><-Is-><-Friend-><-Best-><-My-><-A-><-B-><-C-><-D-><-E->null
	    //                                n
	    public void deleteNode(Node n){
	        n.next.prev=n.prev;
	        n.prev.next=n.next;
	    }


	    //  head->    [  null<-Manoj-><-Is-><-Friend-><-Best-><-My->null ]
	    public static void main(String[] args) {
	    	DLLScratchImpl list=new DLLScratchImpl();

	        list.addFirst("My");  // to add a node at starting of DLL
	        list.addFirst("Best");
	        list.addFirst("Friend");
	        list.addFirst("Is");
	        list.addFirst("Manoj");

	        System.out.println(list.getSize()); // Tell the number of nodes in DLL

	        list.printList(); // to print the DLL

	        list.addLast("A");  // to add a node at starting of DLL
	        list.addLast("B");
	        list.addLast("C");
	        list.addLast("D");
	        list.addLast("E");


	        list.printList(); // to print the DLL

	        Node n1=list.head.next.next.next;
	        list.deleteNode(n1);
	        list.printList(); // to print the DLL

//	        System.out.print("null");
//	        list.recursivePrint(list.head);

	    }
	}









