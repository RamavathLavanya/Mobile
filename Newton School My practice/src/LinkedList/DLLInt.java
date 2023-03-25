package LinkedList;

public class DLLInt {


    Node head;
    int size;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int str) {
            this.data = str;
            this.next = null;
            this.prev = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
        size++;
    }

    public void printList() {
        Node ptr = head;
        System.out.print("null");
        while (ptr != null) {
            System.out.print("<-" + ptr.data + "->");
            ptr = ptr.next;
        }
        System.out.println("null");
    }


    //null<-1-><-2-><-4-><-5-><-6-><-8-><-9->null

    //                                    p

    //                                    t

    // k=7
    public void printPairsWithGivenSum(int sum){

        Node ptr=head;

        while(ptr.next!=null){
            Node temp=ptr.next;

            while(temp!=null){
                if(ptr.data+ temp.data==sum){
                    System.out.println(ptr.data+" "+temp.data);
                }
                temp=temp.next;
            }

            ptr=ptr.next;
        }

    }


    //null<-1-><-2-><-4-><-5-><-6-><-8-><-9->null

    //                 p2  p1

    public void printPairsWithGivenSumTwoPointer(int sum){
        Node ptr1=head;

        Node ptr2=head;
        while(ptr2.next!=null){
            ptr2=ptr2.next;
        }

        while(ptr1!=ptr2 && ptr2.next!=ptr1){

            if(ptr1.data+ ptr2.data  < sum){
                ptr1=ptr1.next;
            }
            else if(ptr1.data+ ptr2.data  > sum){
                ptr2=ptr2.prev;
            }
            else{
                System.out.println(ptr1.data+" "+ptr2.data);
                ptr1=ptr1.next;
                ptr2=ptr2.prev;
            }

        }
    }

    public static void main(String[] args) {
        DLLInt list = new DLLInt();

        list.addFirst(9);
        list.addFirst(8);
        list.addFirst(6);
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(2);
        list.addFirst(1);

        int k=7;

        list.printPairsWithGivenSum(k);
        list.printPairsWithGivenSumTwoPointer(k);

        list.printList();


    }
}
