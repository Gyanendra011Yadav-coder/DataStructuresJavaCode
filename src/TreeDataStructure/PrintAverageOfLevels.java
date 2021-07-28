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
    public static void levelOrder(Node root){
        if(root==null){
            return ;
        }
        int sum=0, count=0;
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);
        while (!q.isEmpty()){
            Queue<Node> tempQueue=new LinkedList<Node>();
            while (!q.isEmpty()){
                Node tempNode=q.remove();
                sum += tempNode.data;
                count++;
                if(tempNode.leftChild!=null){
                    tempQueue.add(tempNode.leftChild);
                }
                if (tempNode.rightChild!=null){
                    tempQueue.add(tempNode.rightChild);
                }
            }
        }

    }

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
