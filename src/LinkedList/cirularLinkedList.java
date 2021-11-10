package LinkedList;

import TreeDataStructure.binarySearchTree;

public class cirularLinkedList {
    NodeList last;
    int length;
    public static class NodeList{
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
            newNode.next=last;
        }else{
            newNode.next=last.next;
        }
        last.next=newNode;
        length++;
    }

    //method to add the NewNode at the end of the LL
    public void addEnd(int value){
        NodeList newNode= new NodeList(value);
        if (last==null){
            last=newNode;
            newNode.next=last;
        }else{
            newNode.next=last.next;
            last.next=newNode;
            last=newNode;
        }
        length++;
    }

    //main method of the class

    public static void main(String[] args) {
        cirularLinkedList cll = new cirularLinkedList();
        NodeList first= new NodeList(1);
        NodeList second= new NodeList(2);
        NodeList third= new NodeList(3);
        NodeList fourth= new NodeList(4);
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=first;
    }
}
