package LinkedList;


public class doublyLinkedList {
    NodeList head; // This will be Denoting to the Head of The Node.
    NodeList tail;//This wil be Pointing to the Tail of The Node.
    int countNoNodes; // this will be counting the no Of Nodes available in the Doubly Linked List.
    //Node Class Of The Linked List
    class NodeList{
        int data;   //this will be storing the value in the Node.
        NodeList next; //This will be pointing to the next Node
        NodeList previous; //This will be pointing to the previous Node

        //This is the Constructor Of The Node
        NodeList(int data){
            this.data=data;
            next=null;
            previous=null;
        }
    }
    // Method To Check If The List Is Empty
    public int  isEmpty(){
        if (head==null){
            return 0;
        }else{
            return 1;
        }
    }

    //Method to add The Nodes at The Beginning Of The Linked List.
    public void insertAtBegin(int value){
        NodeList newNode= new NodeList(value);
        if(isEmpty()==0){
            head=tail=newNode;
        }else {
            newNode.previous=head.previous;
            newNode.next=head;
            head.previous=newNode;
            head=newNode;
        }
    }

    //Method to add Node at The End
    public void inserAtEnd(int value){
        NodeList newNode = new NodeList(value);
        if(isEmpty()==0){
            head=tail=newNode;
        }else{
           tail.next=newNode;
           newNode.previous=tail;
           tail=newNode;
        }
    }

    //Method to print the Node in Forward Direction
    public void printForwardDirection(){
        if(isEmpty()==0){
            System.out.println("null");
        }else{
            NodeList temp=head;
            while (temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.print("null");
        }
    }

    //Method to Print the Node in Backward Direction
    public void printNodeBackward(){
        if (isEmpty()==0){
            System.out.print("null");
        }else{
            NodeList temp=tail;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.previous;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        doublyLinkedList dll = new doublyLinkedList();
        dll.insertAtBegin(1);
        dll.inserAtEnd(2);
        dll.printForwardDirection();
        System.out.println();
        dll.printNodeBackward();
    }


}
