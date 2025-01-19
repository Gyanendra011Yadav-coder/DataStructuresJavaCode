package FirstPhaseLearning.LinkedList;

public class singlyLinkedList {
    private ListNode head;

    public static class ListNode {
        private int data;
        private ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    //method to print the node of the LL
        void printNode(ListNode head) {
            ListNode temp = head;
            while (temp.next != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
    }

    //The Method to Calculate The Length Of The FirstPhaseLearning.LinkedList
    public  int lengthSinglyLinkedList(ListNode Head){
        //variable to count the Length
        int count=0;
        ListNode temp=Head;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
//This, is the method that will insert The Node at the Begin of the Linked List
    public void insertFirst(int value){
        ListNode newNode=new ListNode(value);
        if(head==null){
            head=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
    }

    //Method to add the Node at the end of the LL
    public void addAtEnd(int value){
        ListNode newNode = new ListNode(value);
        if(head==null){
            head=newNode;
        }
        ListNode current =head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }
    //method to delete the First Node From the SinglyLinkedLisyt
    public ListNode deleteFirstNode(int value){
        if(head==null){
            return null;
        }
        ListNode temp=head;
        head=head.next;
        temp.next=null;
        return temp;
    }

    ///Deletion Of The Node At The Last.

    public ListNode deletionnAtEnd(){
        if (head==null || head.next==null){
            return head;
        }
        ListNode temp =head;
        ListNode previous = null;
        while(temp.next!=null){
            previous=temp;
            temp=temp.next;
        }
        previous.next=null;
        return previous;
    }


    //Adding the Node at The Specific Position
    public void insert(int data, int position){
        ListNode newNode= new ListNode(data);
        if(position==1){
            head.next=head;
            head=newNode;
        }
        ListNode previous=head;
        int count=1;
        while(count<position-1){
            previous=previous.next;
        }
        ListNode current=previous.next;
        previous.next=newNode;
        newNode.next=current;
    }
    public static void main(String[] args) {
        singlyLinkedList sll = new singlyLinkedList();
        sll.head = new ListNode(8);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);
        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        sll.printNode(sll.head);
        //calling the method to find out the Length of the FirstPhaseLearning.LinkedList and passing it with the Head.
        System.out.println("The Length Of The LL is:-");
        System.out.println(sll.lengthSinglyLinkedList(sll.head));
    }
}
