package FirstPhaseLearning.binaryTree;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-01-05,Jan,2023
 * in Project: DataStructuresJavaCode
 */
public class DiameterOfTree {

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
        System.out.println(diameter(root));
    }

    // Function to return the diameter of a Binary Tree.
    static int diameter(Node root) {
        // Your code here
        int []diamter=new int[1];
        postOrderTraversal(root,diamter);
        return diamter[0];
    }

//Post-Order Traversal of Tree
    public static int postOrderTraversal(Node root, int[] diamter) {
        if(root==null){
            return 0;
        }

        //call left-right-root
        int leftHeight=postOrderTraversal(root.left,diamter);
        int rightHeight=postOrderTraversal(root.right,diamter);
        diamter[0]=Math.max(diamter[0],leftHeight+rightHeight);

        return 1+Math.max(leftHeight,rightHeight);
    }
}