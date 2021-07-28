package TreeDataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class PrintAverageOfLevels {
    static class Node{
        long value;
        Node left;
        Node right;
        Node(int data){
            this.value=data;
            left = right =null;
        }
    }
    static Node root;
    public static void levelOrder(Node node){
        if(node ==null){
            return ;
        }
        int sum=0, count=0;
        Queue <Node> q = new LinkedList<Node>();
        q.add(node);
        while (!q.isEmpty()){
            sum=0;count=0;
            Queue<Node> tempQueue=new LinkedList<Node>();
            while (!q.isEmpty()){
                Node tempNode=q.remove();
                sum += tempNode.value;
                count++;
                if(tempNode.left !=null){
                    tempQueue.add(tempNode.left);
                }
                if (tempNode.right !=null){
                    tempQueue.add(tempNode.right);
                }
            }
            q=tempQueue;
            System.out.println(sum*1.0/count);
        }

    }

    public static void main(String[] args) {
        root = new Node(50);
        root.left = new Node(25);
        root.right = new Node(75);
        root.left.left = new Node(15);
        root.left.right = new Node(30);
        root.right.left = new Node(70);
        root.right.right = new Node(85);
        levelOrder(root);






    }
}
