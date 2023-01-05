package BinarySearchTree;

/**
 * Created By:  Gyanendra_Yadav
 * on 2022-12-29,Dec,2022
 * in Project: DataStructuresJavaCode
 */
public class InsertNodeBST {

     static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left=new Node(1);
        root.right=new Node(3);

    }

    // Function to insert a node in a BST.
    Node insert(Node root, int Key) {
        // your code here
        if(root==null) return new Node(Key);

        if(Key<root.data){
            root.left=insert(root.left,Key);
        }
        if(Key> root.data){
            root.right=insert(root.right,Key);
        }

        return root;
    }
}
