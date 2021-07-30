package TreeDataStructure;

import java.util.Stack;

public class zigZagTraversalTree {
    static Node rootNode;  //THIS, IS THE ROOT NODE OF THE TREE
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }

    /*********
     *NOW, WE WILL BE CREATING THE METHOD TO PERFORM THE ZIG-ZAG TRAVERSAL OF THE TREE
     */
    public static void zigZagTraversal(Node node){
        if (node == null) {
            return;
        }
        Stack <Node> current = new Stack();
        Stack <Node> currentChild=new Stack();
        boolean isLeftTORight=true;
        current.push(node);
        while(current.isEmpty()!=true){
            Node temp = current.pop();
            System.out.println(temp.data);

        }
    }



    public static void main(String[] args) {
        rootNode=new Node(2);
        rootNode.left=new Node(3);
        rootNode.right=new Node(1);
        rootNode.left.left=new Node(8);
        rootNode.left.right=new Node(6);
        rootNode.right.left=new Node(5);
        rootNode.right.right=new Node(4);
    }


}
