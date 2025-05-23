package FirstPhaseLearning.BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By:  Gyanendra_Yadav
 * on 2022-12-29,Dec,2022
 * in Project: DataStructuresJavaCode
 */
public class MinimumElementBST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        LowestCommonAncistor.Node root = new LowestCommonAncistor.Node(5);
        root.left = new LowestCommonAncistor.Node(4);
        root.right = new LowestCommonAncistor.Node(6);
        root.left.left = new LowestCommonAncistor.Node(3);
        root.left.left=new LowestCommonAncistor.Node(1);
        root.right.right = new LowestCommonAncistor.Node(7);
        root.right.right = new LowestCommonAncistor.Node(8);


        System.out.println("Root Result: " );
    }


    List<Integer> inorderValue=new ArrayList<>();
    int minValue(Node node) {
        inorderTraversal(node);
        return inorderValue.get(0);
    }

//    INorder Traversal Value
    public void inorderTraversal(Node node){
        if(node==null) return;

        inorderTraversal(node.left);
        inorderValue.add(node.data);
        inorderTraversal(node.right);
    }

}
