package LinkedList;

public class doublyLinkedList {

    //Node Class Of The Linked List
    class NodeList{
        //this will be storing the value in the Node.
        int data;
        //This will be pointing to the next Node
        NodeList next;
        //This will be pointing to the previous Node
        NodeList previous;
        //This is the Constructor Of The Node
        NodeList(int data){
            this.data=data;
            next=null;
            previous=null;
        }
    }

}
