package TreeDataStructure;

import com.sun.source.tree.Tree;

import java.util.*;
import java.util.zip.InflaterInputStream;

public class binaryTreeImplementation {

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

    TreeNode rootNode = null;

    //Insettion in Binary Tree
    public void insert(int data) {
        TreeNode newNode = new TreeNode(data);
        if (rootNode == null) {
            rootNode = newNode;
        }
        //This Code Will be traversing the tree
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode tempNode = rootNode;
        q.add(tempNode);
        while (!q.isEmpty()) {
            tempNode = q.poll();
            q.remove();
            if (tempNode.left == null) {
                tempNode.left = new TreeNode(data);
                break;
            } else {
                q.add(tempNode.left);
            }
            //this coondition will be checking if the right child of the node is null then create new tree Node at that location else add the rightNode of tree in the queue
            if (tempNode.right == null) {
                tempNode.right = new TreeNode(data);
                break;
            } else {
                q.add(tempNode.left);
            }
        }
    }

    //Method to Delete Node From The Binary Tree
    public boolean deleteNodeTree(int value) {
        if (rootNode == null) {
            return false;
        }

        return false;
    }

    //Traversal of the Tree

    /**
     * We know Inorder Traversal is done Using-> Left->RootNode->RightNode
     */
    public List<Integer> inOrderTraversalTree(TreeNode root) {
        List<Integer> traverseNodes = new ArrayList<>();
        if (root == null) {
            return traverseNodes;
        }
        inOrderTraversalTree(root.left);
        traverseNodes.add(root.left.val);
        inOrderTraversalTree(root.right);

        return traverseNodes;
    }

    /**
     * We know PreOrder Traversal is done Using: Root->LeftNode->RightNode
     */
    public void preOrderTraversal(TreeNode rootNode) {
        if (rootNode == null) {
            return;
        }
        System.out.println(rootNode.left.val);
        preOrderTraversal(rootNode.left);
        preOrderTraversal(rootNode.right);
    }


    /**
     * We know PostOrder-Traversal is done Using: LeftNode->RightNode->Root
     */
    public void postOrderTraversal(TreeNode rootNode) {
        if (rootNode == null) {
            return;
        }
        preOrderTraversal(rootNode.left);
        preOrderTraversal(rootNode.right);
        System.out.println(rootNode.left.val);
    }

    //Now, we will be adding the code to Travrese the Tree Level-wise
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result= new ArrayList<>();
        if(root==null){
            return result;
        }

        //Using Queue to Traverse the Tree
        Queue <TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            List <Integer> subList= new ArrayList<>();
            //this code will be taking the reords of all the values of the node at the same level
            while(size-- > 0){
                TreeNode temp=queue.poll();
                queue.remove();
                if(temp.left!=null){
                    queue.add(temp.left) ;
                }
                if(temp.right!=null){
                        queue.add(temp.right) ;
                }
                subList.add(temp.val);
            }
            result.add(subList);
        }
        return result;
    }
// print left view of the tree
    public void leftView(TreeNode root){
        ArrayList <Integer> list= new ArrayList<>();
        printLeftViewUtill(root,list,0);


    }
    /**this method will be used by Left View**/
    public void printLeftViewUtill(TreeNode root, ArrayList<Integer>list, int level){
        if(root==null){
            return;
        }
        if(list.get(level)==null){
            list.add(root.val);
        }
        printLeftViewUtill(root.left,list,level+1);
        printLeftViewUtill(root.right,list,level+1);
    }

    /**Method, to print right view of the tree*/
    public void rightView(TreeNode root){
        ArrayList <Integer> list= new ArrayList<>();
        printRightViewUtill(root,list,0);


    }
    /**this method will be used by Left View**/
    public void printRightViewUtill(TreeNode root, ArrayList<Integer>list, int level){
        if(root==null){
            return;
        }
            list.set(level,root.val);

        printLeftViewUtill(root.left,list,level+1);
        printLeftViewUtill(root.right,list,level+1);
    }
}

