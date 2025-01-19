package FirstPhaseLearning.BinarySearchTree;

public class checkIfTreeIsBST {
    private class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
            left = right = null;
        }
    }

    /**
     * we will be doing Inorder Traverse to check if the tree is BST or not as BST gives sorting array if BST
     * is Reall a BST, else it will never give Sorted array
     * SO,
     */
    //Method will be called to check
    public boolean isValidBST(TreeNode root) {
        return isBSTUtil(root);
    }

    //this method contains the logic to check is the tree is BST or not
    TreeNode prev = null; // creating  this Node as it will contains the  previous node, so that we cam compare it wih next node values.

    private boolean isBSTUtil(TreeNode root) {
        //if node is not null then we will check else we will directly return true is node is null
        if (root != null) {
            if (!isBSTUtil(root.left)) {
                return false;
            }
            //if previous node's value is greater than current node that means it is not following sorting. So, returnign false
            if (prev != null && prev.data >= root.data) {
                return false;
            }
            //and if prev node value < current node then we will update the prev node with cuurent node
            prev = root;
            isBSTUtil(root.right);
        }
        return true;
    }

    boolean isBST(TreeNode root)
    {
        // code here.
        if(root==null) {
            return true;
        }

            if(root.left!=null && root.left.data>root.data){
                return false;
            }

            if(root.right!=null && root.right.data<root.data){
                return false;
            }

            //Recursive Call-1
            boolean isLeftBST=isBST(root.left);
            //Recursive Call-2
            boolean isRightBST=isBST(root.right);

            if(isLeftBST==true && isRightBST==true)
               return true;
            else
                return false;

    }
}
