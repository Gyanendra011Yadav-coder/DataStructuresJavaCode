package FirstPhaseLearning.BinarySearchTree;

public class implementationOfBST {
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.val = data;
            left = right = null;
        }
    }

    private TreeNode root = null;

    /**
     * Method to insert Data in BST
     */
    private void insert(int data) {
        root = insertUtil(root, data);
    }

    //this method will be used to insert the newNodes in BST
    private TreeNode insertUtil(TreeNode root, int data) {
        TreeNode newNode = new TreeNode(data);
        if (root == null) {
            root = newNode;
            return root;
        }
        /**Now, we will check, if the newNode has the value greater than root node or
         less than the root value.
         1) if it is greater than root than it will be kept at the right side of root
         2)else, we will be keep it at left side.
         */
        if (data < root.val) {
            insertUtil(root.left, data);
        } else {
            insertUtil(root.right, data);
        }
        return root;
    }

    //Method to print the tree
    private void printNodesBST(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        printNodesBST(root.left);
        printNodesBST(root.right);
    }

    /**This method will be deleting the Node from BST*/
    private TreeNode deleteNode(TreeNode root, int valueToDelete){
        if(root==null){
            return root;
        }
        if(root.val>valueToDelete){
            root.left=deleteNode(root.left,valueToDelete);
        }
        else if(root.val<valueToDelete){
            root.right=deleteNode(root.right,valueToDelete);
        }else{
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }else{
                TreeNode successorParent=root;
                TreeNode successor=root.right;
                while(successor.left!=null){
                    successorParent=successor;
                    successor=successor.left;
                }
                if(successorParent!=root){
                    successorParent.left=successor.right;
                }else{
                    successorParent.right=successor.right;
                }
                root.val=successor.val;
            }
        }
    return root;
    }


    /**This, Method will be used for seraching in Tree*/
    private boolean serachInBST(TreeNode root,int valueToDelete){
        if(root==null){
            return false;
        }else if(root.val==valueToDelete){
            return true;
        }else if(root.val>valueToDelete){
            return serachInBST(root.left,valueToDelete);
        }else if(root.val<valueToDelete){
            return serachInBST(root.right,valueToDelete);
        }
        return false;
    }
}
