package TreeDataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class PrintAverageOfLevels {
    static class Node{
        int data;
        Node leftChild;
        Node rightChild;
        Node(int data){
            this.data=data;
            leftChild=rightChild=null;
        }
    }
    static Node root;


    public static void main(String[] args) {
        root = new Node(50);
        root.leftChild = new Node(25);
        root.rightChild = new Node(75);
        root.leftChild.leftChild = new Node(15);
        root.leftChild.rightChild = new Node(30);
        root.rightChild.leftChild = new Node(70);
        root.rightChild.rightChild = new Node(85);
        levelOrder(root);






    }
}
