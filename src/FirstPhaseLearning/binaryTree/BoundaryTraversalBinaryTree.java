package FirstPhaseLearning.binaryTree;

import java.util.ArrayList;

/**
 * Created By:  Gyanendra_Yadav
 * on 2022-12-31,Dec,2022
 * in Project: DataStructuresJavaCode
 */
public class BoundaryTraversalBinaryTree {
    static class Node {
        int data;
          Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.left.right = new Node(4);
        root.left.left.right.left = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right = new Node(7);
        root.right.right = new Node(8);
        root.right.right.left = new Node(9);
        root.right.right.left.left = new Node(10);
        root.right.right.left.right = new Node(11);

        ArrayList < Integer > boundaryTraversal;
        boundaryTraversal = boundary(root);

        System.out.println("The Boundary Traversal is : ");
        for (int i = 0; i < boundaryTraversal.size(); i++) {
            System.out.print(boundaryTraversal.get(i) + " ");
        }
    }

    /**
     *1. Tracverse at the Left--check if the node is leaf node
     *2. Traverse  at the Leaves
     *3. Traverse at the Right
     */

    static ArrayList<Integer> boundary(Node node)
    {
        ArrayList<Integer> traverseNodes=new ArrayList<Integer>();
// Check for the leaf if that leave is leaf node-for one node tree
        if(!isLeaf(node)) {
            traverseNodes.add(node.data);
        }
//Traversing one by one on the all three sides
        leftTraversal(node,traverseNodes);
        leavesTraversal(node,traverseNodes);
        rightTraversal(node,traverseNodes);

        return traverseNodes;
    }



    private static boolean isLeaf(Node node) {
        return (node.left==null) && (node.right==null);
    }

    private static void leftTraversal(Node node, ArrayList<Integer> leftTraverseList) {
        Node tempNode=node.left;
        while(tempNode!=null){
            if(isLeaf(tempNode)==false){
                leftTraverseList.add(tempNode.data);
            }
            if(tempNode.left!=null){
                tempNode=tempNode.left;
            }else{
                tempNode=tempNode.right;
            }
        }
    }

    private static void leavesTraversal(Node node, ArrayList<Integer> traverseNodes) {
        if(isLeaf(node)){
            traverseNodes.add(node.data);
            return;
        }

        if(node.left!=null){
            leavesTraversal(node.left, traverseNodes);
        }
        if(node.right!=null){
            leavesTraversal(node.right, traverseNodes);
        }
    }

    private static void rightTraversal(Node node, ArrayList<Integer> traverseNodes) {
        Node tempRight = node.right;

        ArrayList<Integer> traverseNodesRight=new ArrayList<Integer>();

        while(tempRight!=null){
            if(!isLeaf(tempRight)){
                traverseNodesRight.add(tempRight.data);
            }

            if(tempRight.right!=null){
                tempRight=tempRight.right;
            }else{
                tempRight=tempRight.left;
            }
        }

        for (int i = traverseNodesRight.size()-1; i>=0; i--) {
            traverseNodes.add(traverseNodesRight.get(i));
        }
    }



}
