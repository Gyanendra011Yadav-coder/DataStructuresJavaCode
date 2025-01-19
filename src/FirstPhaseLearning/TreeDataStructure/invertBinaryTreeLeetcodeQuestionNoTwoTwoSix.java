package FirstPhaseLearning.TreeDataStructure;

public class invertBinaryTreeLeetcodeQuestionNoTwoTwoSix {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value) {
            val = value;
            left = null;
            right = null;
        }
    }

    binaryTreeImplementation.TreeNode rootNode = null;

    public TreeNode invertTree(TreeNode root) {
        if(root!=null){
            TreeNode temp=root.left;
            temp.left=temp.right;
            temp.right=temp;
            invertTree(temp.left);
            invertTree(temp.right);
        }
        return root;
    }
}
