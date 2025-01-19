package FirstPhaseLearning.binaryTree;

import java.util.logging.Logger;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-01-16,Jan,2023
 * in Project: DataStructuresJavaCode
 */
public class HeightBinaryTree {

    public static final Logger LOGGER = Logger.getLogger(HeightBinaryTree.class.getName());
    //Node class to create binary Tree
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    //Main Method
    public static void main(String[] args) {
        Node root=new Node(4);
        root.left=new Node(5);
        root.right=new Node(2);
        root.right.left=new Node(3);
        root.right.right=new Node(1);
        root.right.left.left=new Node(6);
        root.right.left.right=new Node(12);

        LOGGER.info("Return value from maxGCD = {} "+ height(root));
    }

    private static int heightTree=0;
    private static int leftHeight=0;
    private static int rightHeight=0;
    //Function to find the height of a binary tree.
    static int height(Node node)
    {
        // code here
        if(node==null){
            return 0;
        }
        return Math.max(height(node.left), height(node.right))+1;
    }































}
