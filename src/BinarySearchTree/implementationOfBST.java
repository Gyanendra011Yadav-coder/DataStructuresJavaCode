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
    //Method to insert Data in BST
    private void insert(int data){
        TreeNode newNode= new TreeNode(data);
        if(root==null){
            root=newNode;
        }
        //Now, we will check if


    }
}
