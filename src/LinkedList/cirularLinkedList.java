package LinkedList;

import TreeDataStructure.binarySearchTree;

public class cirularLinkedList {
    NodeList last;
    int length;
    class NodeList{
        NodeList next;
        int data;
        public NodeList(int data){
            this.data=data;
        }
    }
    public cirularLinkedList(){
        last=null;
        length=0;
    }

    //Method to display
    public void display(){
        if (last==null){
            return;
        }
        NodeList temp=last.next; // so that it can start it self from the starting
        while(temp!=last){
            System.out.println(temp.data+"->");
            temp=temp.next;
        }
        System.out.println(); // we will write the first node
    }

    //method to add the Node at the Starting
    public void addBegin(int value){
        NodeList newNode = new NodeList(value);
        if (last==null){
            last=newNode;
        }else{
            newNode.next=last.next;
        }
        last.next=newNode;
        length++;
    }
}
