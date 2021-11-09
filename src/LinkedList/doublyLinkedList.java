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


}
