package SecondPhaseLearning.BinaryTree;

import SecondPhaseLearning.TreeNode;

public class BinaryTreeTraversal {

    /**
     * Root-> Left -> Right
     * @param treeNode
     */
    public static void BinaryTreeTraversalIPreOrder(TreeNode treeNode){
        if(treeNode==null){
            return;
        }

        System.out.print(treeNode.value +"_>");
        BinaryTreeTraversalIPreOrder(treeNode.leftNode);
        BinaryTreeTraversalIPreOrder(treeNode.rightNode);
    }

    /**
     * Left -> Root -> Right
     * @param treeNode
     */
    public static void BinaryTreeInOrderTraversal(TreeNode treeNode){
        if(treeNode==null){
            return;
        }
        BinaryTreeInOrderTraversal(treeNode.leftNode);
        System.out.print(treeNode.value +"_>");
        BinaryTreeInOrderTraversal(treeNode.rightNode);

    }

    /**
     * Left -> Right -> Root
     * @param treeNode
     */
    public static void BinaryTreePostOrderTraversal(TreeNode treeNode){
        if(treeNode==null){
            return;
        }

        BinaryTreePostOrderTraversal(treeNode.leftNode);
        BinaryTreePostOrderTraversal(treeNode.rightNode);
        System.out.print(treeNode.value +"_>");
    }


    public static void main(String []args){
        TreeNode treeNode = new TreeNode(1);
        treeNode.leftNode = new TreeNode(2);
        treeNode.rightNode = new TreeNode(3);
        treeNode.leftNode.leftNode = new TreeNode(4);
        treeNode.leftNode.rightNode = new TreeNode(5);
        treeNode.rightNode.leftNode = new TreeNode(6);
        treeNode.rightNode.rightNode = new TreeNode(7);
        System.out.println("PreOrder-Traversal:");
        BinaryTreeTraversalIPreOrder(treeNode);

        System.out.println();
        System.out.println("InOrder-Traversal:");
        BinaryTreeInOrderTraversal(treeNode);

        System.out.println();
        System.out.println("PostOrder-Traversal:");
        BinaryTreePostOrderTraversal(treeNode);
    }
}
