package TreeDataStructure;

import java.util.LinkedList;
import java.util.Queue;

/****
 * IN THIS, WE WILL BE FINDING THE LOWEST COMMON ANCESTOR OF THE GIVEN NODES.
 * Ancestors
 * PrepBuddy is researching about different kinds of mammals and their ancestors.
 * He has assigned a unique integer number to each mammal and has arranged them in a binary search tree format. He needs your help to create a program that outputs lowest common ancestor of two mammals.
 *
 * Note
 * -You have to complete findLowestAncestor() function, no need to implement the tree.
 * Lowest common ancestor of two node n1 and n2 is the lowest node in the tree that has
 * both n1 and n2 as descendents(where we allow a node to be a descendant of itself).
 */

public class findLowestAncistor {
    static class Node {
        int data;
        Node leftChild;
        Node rightChild;

        Node(int data) {
            this.data = data;
            leftChild = rightChild = null;
        }
    }

        static Node rootNode;


        /***
         *THE STEPS WE HAVE TO FOLLOW, IS:-
         * 1) FIRST, WE CHJECK IF THE NODE IS NULL, IF YES THEN WE WILL RETURN IT
         *2) SECOND, IF THE ROOT.DATA IS GREATER THAN THAN ROOTS DATA THAT IS PASSED TO CHECK. IF YES THEN WE WILL SIMPLY PASS LEFT OF THE TREE
         * 3) THIRD, WE CHECK IF ROOT DATA IS LESSER THAN THE NODES VALUE THAT WE PASS RIGHT SUB TREE
         */
        public static Node findLowestAncistor(Node root,int root1, int root2){
            if (root == null)
                return null;
            if(root.data>root1 && root.data > root2)
                return findLowestAncistor(root.leftChild,root1,root2);
            if (root.data<root1 && root.data<root2)
                return findLowestAncistor(root.rightChild,root1, root2);
            return root;
        }
        public static void levelOrderTraversal(Node root){
            if (root==null){
                return;
            }
            Queue <Node> q = new LinkedList<>();
            q.add(root);
            while (q.isEmpty()!=true){
                Node node=q.remove();
                System.out.print(node.data+" ");
                if (node.leftChild!=null){
                    q.add(node.leftChild);
                }
                if (node.rightChild != null){
                    q.add(node.rightChild);
                }
            }
        }

        public static void main(String[] args) {
        rootNode=new Node(20);
        rootNode.leftChild=new Node(8);
        rootNode.rightChild=new Node(22);
        rootNode.leftChild.leftChild=new Node(4);
        rootNode.leftChild.rightChild=new Node(12);
        rootNode.leftChild.rightChild.leftChild=new Node(10);
        rootNode.leftChild.rightChild.rightChild=new Node(14);
        levelOrderTraversal(rootNode);
            System.out.println("THE LOWEST ANCISTOR IS:-");
            Node tempNode=findLowestAncistor(rootNode,10,14);
            System.out.println(tempNode.data);


    }
}
