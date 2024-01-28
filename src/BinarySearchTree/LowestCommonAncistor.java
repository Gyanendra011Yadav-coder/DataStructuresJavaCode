package BinarySearchTree;


/**
 * Created By:  Gyanendra_Yadav
 * on 2022-12-29,Dec,2022
 * in Project: DataStructuresJavaCode
 */
public class LowestCommonAncistor {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(6);
        root.left.left = new Node(3);
        root.right.right = new Node(7);
        root.right.right = new Node(8);

        BST bstClassObject=new BST();
        Node rootResult=bstClassObject.LCA(root,7,8);
        System.out.println("Root Result: " + rootResult.data);
    }




// } Driver Code Ends


//User function Template for Java

static class BST {

    /**
     * TODO: Lowest Ancistor of Node is:To find the LCA of two nodes in a BST, you can start at the root of the tree and compare the values of the nodes to the value of the root. If the values of both nodes are less than the value of the root, you can search for the LCA in the left subtree. If the values of both nodes are greater than the value of the root, you can search for the LCA in the right subtree. If one value is less than the root and the other is greater, then the root is the LCA. You can continue this process until you find the LCA or you reach a leaf node without finding the LCA, in which case the LCA does not exist in the tree.
     */
    //Function to find the lowest common ancestor in a BST.
        Node LCA(Node root, int n1, int n2) {

            if(root==null) return null;

            if(root.data==n1 || root.data==n2){
                return root;
            }
            //1.
           Node leftAns=LCA(root.left, n1,n2);
           Node rightAns=LCA(root.right,n1,n2);

           if(leftAns!=null && rightAns!=null) return root;


            return (leftAns!=null ? leftAns : rightAns);
        }

    }

}
