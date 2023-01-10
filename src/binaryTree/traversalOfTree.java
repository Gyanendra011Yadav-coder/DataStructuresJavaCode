package binaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-01-09,Jan,2023
 * in Project: DataStructuresJavaCode
 */
public class traversalOfTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(60);

        System.out.println(preorderTraversal(root));
    }


    static List<Integer> finalListPreOrderTraverse= new ArrayList<>();
    public static List<Integer> preorderTraversal(Node root) {
        if(root==null) return null;

        finalListPreOrderTraverse.add(root.data);
        preorderTraversal(root.left);
        preorderTraversal(root.right);

        return finalListPreOrderTraverse;
    }
}
