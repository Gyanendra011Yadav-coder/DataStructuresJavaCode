package BinarySearchTree;

import com.sun.source.tree.Tree;

public class implementationOfBST {
    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data){
            this.val=data;
            left=right=null;
        }
    }

    private TreeNode root=null;

    /**Method to insert Data in BST*/
    private void insert(int data){
        root=insertUtil(root,data);
    }
    //this method will be used to insert the newNodes in BST
    private TreeNode insertUtil(TreeNode root, int data) {
        TreeNode newNode= new TreeNode(data);
        if(root==null){
            root=newNode;
            return root;
        }
        /**Now, we will check, if the newNode has the value greater than root node or
         less than the root value.
         1) if it is greater than root than it will be kept at the right side of root
         2)else, we will be keep it at left side.
         */
        if(data<root.val){
            insertUtil(root.left,data);
        }else{
            insertUtil(root.right,data);
        }
        return root;
    }
    //Method to print the tree
    private void printNodesBST(TreeNode root){
        if(root==null){
            return;
        }
        System.out.println(root.val);
        printNodesBST(root.left);
        printNodesBST(root.right);
    }
}
