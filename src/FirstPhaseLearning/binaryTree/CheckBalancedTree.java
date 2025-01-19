package FirstPhaseLearning.binaryTree;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-01-06,Jan,2023
 * in Project: DataStructuresJavaCode
 *
 * @implNote A tree is height balanced if difference between heights of left and right subtrees is not more than one for all nodes of tree.
 */
public class CheckBalancedTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.left.left = new Node(3);
//        root.left.left.right = new Node(4);
//        root.left.left.right.left = new Node(5);
//        root.left.left.right.right = new Node(6);
//        root.right = new Node(7);
//        root.right.right = new Node(8);
//        root.right.right.left = new Node(9);
//        root.right.right.left.left = new Node(10);
//        root.right.right.left.right = new Node(11);

        Node root = new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(60);

        System.out.println(isBalanced(root));
    }
    
    //Function to check whether a binary tree is balanced or not.
    private static boolean isBalanced(Node root)
    {
        // Your code here
        if(root==null){
            return false;
        }
        int leftHeight=postOrderTraversal(root.left);
        int rightHeight=postOrderTraversal(root.right);
        if(Math.abs(leftHeight-rightHeight)>1){
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);
    }

    //Check using Post-Order Traversal
    public static int postOrderTraversal(Node root){
        if(root==null){
            return 0;
        }

        return 1+(Math.max(postOrderTraversal(root.left),postOrderTraversal(root.right)));
    }
}
