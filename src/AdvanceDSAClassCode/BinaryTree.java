package AdvanceDSAClassCode;

public class BinaryTree {
    TreeNode root;
    private class TreeNode{
        private TreeNode leftChild;
        private TreeNode rightChild;
        private int data;
        TreeNode(int data){
            this.data=data;
        }
    }
//Traversal Of The Tree

    /**
     *Root->Left->Right
     */
    private void preOrderTraversal(TreeNode node){
        if(node==null){
            return;
        }
        System.out.println(node.data);
        preOrderTraversal(node.leftChild);
        preOrderTraversal(node.rightChild);
    }

    //InOrder Traversal Of Tree
    /**
     * Left->Root->Right
     */
    private void inOrderTraversal(TreeNode node){
        if(node==null){
            return;
        }
        inOrderTraversal(node.leftChild);
        System.out.println(node.data);
        inOrderTraversal(node.rightChild);
    }

    public static void main(String[] args) {
        BinaryTree binaryTreeObject = new BinaryTree();

    }
}
