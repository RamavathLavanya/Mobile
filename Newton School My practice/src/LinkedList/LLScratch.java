package LinkedList;

public class LLScratch {

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

// Ji->Hello->null
//  p

    //calculate count =2
    //9/2 - 0
    public void deleteMiddle(){
        // calculate no of nodes
        int cnt=0;
        Node ptr=head;

        while(ptr!=null){
            cnt++;
            ptr=ptr.next;
        }

        if(cnt==1){
            head.data="hh";
            return;
        }

        // delete
        cnt=(cnt/2)-1;
        ptr=head;

        while(cnt!=0){
            ptr=ptr.next;
            cnt--;
        }

        ptr.next=ptr.next.next;


    }


    //Ji->Hello->Soumya->Welcome->Hamara->Newton->School->null

    //null<-Ji<-Hello<-Soumya<-Welcome<-Hamara<-Newton<-School<-head

    // Recursion/Loops

    //null<-Ji<-Hello <-Soumya <-Welcome <-Hamara <-Newton  <-School
    //

    //head=ji

   // rev(Ji) -> rev(Hello) -> ........rev(Hamara)-> rev(Newton) -> rev(School) ->
    //                                   newHead=School       <- newHead=School     <-
    public Node reverseList(Node head){

        if(head==null || head.next==null){
            return head;
        }

        Node newHead=reverseList(head.next);
        head.next.next=head;  // reversing the reference
        head.next=null; // current node next
        return newHead;
    }



    //   n <-Ji<-Hello<-Soumya <-Welcome<- Hamara <-Newton <-School null
    //       H                                                   p    c        t

    public void reverseIterative(){

        Node prev=null;
        Node current=head;

        Node temp;

        while(current!=null){
            temp=current.next;
            current.next=prev;

            prev=current;
            current=temp;
        }

        head=prev;

    }


    //We->Love->Newton->Hello->null
    //                    ptr   
    public void deleteNode(Node ptr){
        Node temp=ptr.next;
        ptr.data=temp.data;
        ptr.next=ptr.next.next;
    }
    
    public Node intersectionPoint(){
        Node ptr1=head;//head1
        Node ptr2=head;//head2

        while(ptr1!=ptr2){
            ptr1=ptr1.next;
            ptr2=ptr2.next;


            if(ptr1==null){
                ptr1=head;//head2
            }

            if(ptr2==null){
                ptr2=head;//head1
            }
            
        }

        return ptr1;//ptr2
    }
    
//    public void splitCircularLL(){
//        Node ptr1=head;
//        Node ptr2=head;
//        Node head2;
//
//        while(ptr2.next!=head && ptr2.next.next!=head){
//            ptr1=ptr1.next;
//            ptr2=ptr2.next.next;
//        }
//
//        head2=ptr1.next;
//        ptr1.next=head;
//
//        if(ptr2.next==head){
//            ptr2.next=head2;
//        }
//        else{
//            ptr2.next.next=head2;
//        }
//
//        printCircularLL(head);
//        printCircularLL(head2);
//
//    }








    public static void main(String[] args) {

        LLScratch list=new LLScratch();
        list.removeFirst();
        list.addLast("We");
        list.addLast("Love");
        list.addLast("Newton");
        list.addLast("School");
        list.addLast("Hello");

        //We->Love->Newton->School->Hello->null
        //                    ptr

        Node delete=list.head.next.next.next;
        list.deleteNode(delete);

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

        list.deleteMiddle();
        list.printList();

        list.deleteMiddle();
        list.printList();


         list.head=list.reverseList(list.head);
        list.printList();

        list.head=list.reverseList(list.head);
        list.printList();


        list.reverseIterative();
        list.printList();


        // 1-10

    }


    //    [School,x]->[Newton,y]->[Love,z]->[We,null]
    // head-^                x         y        z

}







        