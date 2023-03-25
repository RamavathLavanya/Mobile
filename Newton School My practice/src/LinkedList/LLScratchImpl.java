package LinkedList;

public class LLScratchImpl {
	

    Node head; // reference/object of the first node

    class Node{
        String data;
        Node next;

        Node(String str){
            this.data=str;
            this.next=null;
        }
    }

    //    [data,reference to next node/element]
    //             data/element/node


    //      [School,x]->[Mr,y] ->[Mrs,z]-> [Newton,g]->[Love,h] ->[Sanjay,null]
    //  head  --^
    //                                              ptr----^
    public void addLast(String str){ //"Sanjay"
        Node newNode=new Node(str); // ["",null]

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
    }


//
// head->Soumya->We->Love->Newton->School->Hello->null
    public void addFirst(String str){
        Node newNode=new Node(str); // ["Soumya",null]
        newNode.next=head;
        head=newNode;
    }


    // [Divyanshi,v]   ->Rajat->Soumya->We->Love->Newton->School->Hello->null
    //       head-^
    public void removeFirst(){
        if(head==null){
            System.out.println("Nothing to remove. Get lost.");
            return;
        }
        head=head.next;

    }


   // head->null
    //  p
    public void removeLast(){
        if(head==null){
            System.out.println("Nothing to remove. Get lost.");
            return;
        }

        if(head.next==null){ // only single node
            head=null;
            return;
        }

        Node ptr=head;
        while(ptr.next.next!=null){
            ptr=ptr.next;
        }
        ptr.next=null;

    }

    //    [School,x]->[Newton,y]->[Love,z]->[We,null]
    //    head-^                            ptr-^
    public void printList(){
        Node ptr=head;
        while(ptr!=null){
            System.out.print(ptr.data + "->");
            ptr=ptr.next;
        }
        System.out.println("null");
    }
//                                                                   ji->null
  //  Ji->Hello->Soumya->Welcome->We->Love->Hamara->Newton->School->Hello->null
//                                                                   p
    public void addSomeWhere(String str,int pos){ //5
        if(pos<=0){
            System.out.println("Get lost");
            return;
        }
        Node newNode=new Node(str); // ["Hamara",null]

        if(pos==1){
            newNode.next=head;
            head=newNode;
            return;
        }
        Node ptr=head;
        int count=0;
        while(count!=pos-2 && ptr!=null){
            ptr=ptr.next;
            count++;
        }
        if(ptr==null){
            System.out.println("Insuficient nodes to add at particular position. Get lost.");
            return;
        }
        newNode.next=ptr.next;
        ptr.next=newNode;

    }
    //Circular
    public void makeCircular(){
        Node temp=head;

        while(temp.next!=null){
            temp=temp.next;
        }

        temp.next=head;
    }
    
    //print circular
    public void printCircularLL(){

        Node ptr=head;

        while(ptr.next!=head){
            System.out.print(ptr.data+"->");
            ptr=ptr.next;
        }

        System.out.print(ptr.data+"->"+ptr.next.data);

    }


    public static void main(String[] args) {

        LLScratchImpl list=new LLScratchImpl();
        list.removeFirst();
        list.addLast("We");
        list.addLast("Love");
        list.addLast("Newton");
        list.addLast("School");
        list.addLast("Hello");

        list.printList();

        list.addFirst("Soumya");
        list.printList();

        list.addFirst("Rajat");
        list.printList();

        list.addFirst("Divyanshi");
        list.printList();


        list.removeFirst();
        list.printList();

        list.removeFirst();
        list.printList();



        list.addFirst("Hello");
        list.printList();

        list.removeLast();
        list.printList();

                             // Hamara
        //Hello->Soumya->We->Love->Newton->School->Hello->null
        list.addSomeWhere("Hamara",5);
        list.printList();

        list.addSomeWhere("Welcome",3);
        list.printList();

        list.addSomeWhere("Ji",1);
        list.printList();

        list.addSomeWhere("Mr",11);
        list.printList();
        
//        list.makeCircular("Anu",15);
//        list.printList();
//        
//        list.addSomeWhere("Sree",15);
//        list.printList();


        // 1-10

    }


//	public void reverseIterative() {
//		// TODO Auto-generated method stub
//		
//	}
//
//
//    //    [School,x]->[Newton,y]->[Love,z]->[We,null]
    // head-^                x         y        z

}


