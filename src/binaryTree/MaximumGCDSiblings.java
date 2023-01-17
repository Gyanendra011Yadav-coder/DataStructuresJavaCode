package binaryTree;

import java.util.logging.Logger;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-01-17,Jan,2023
 * in Project: DataStructuresJavaCode
 */
public class MaximumGCDSiblings {

    public static final Logger LOGGER = Logger.getLogger(MaximumGCDSiblings.class.getName());
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node root=new Node(4);
        root.left=new Node(5);
        root.right=new Node(2);
        root.right.left=new Node(3);
        root.right.right=new Node(1);
        root.right.left.left=new Node(6);
        root.right.left.right=new Node(12);

        LOGGER.info("Return value from maxGCD = {} "+ maxGCD(root));
    }

    static int maxGCDVal = 0;
    static int overallMax = 0;

    public static int maxGCD(Node root) {
        if(root == null) return 0;
        if(root.left == null && root.right == null) return root.data;
        dfs(root);

        return overallMax;
    }

    public static void dfs(Node root) {
        LOGGER.info("Entering for Node Value="+root.data);
        if(root == null) return;
        if(root.left == null && root.right == null) return;

        dfs(root.left);
        dfs(root.right);

        if(root.left != null && root.right != null) {
            int left = root.left.data;
            int right = root.right.data;

            int GCD = gcd(left, right);
            if(GCD > maxGCDVal) {
                overallMax = root.data;
                maxGCDVal = GCD;
            }

            if(GCD == maxGCDVal && overallMax < root.data) {
                overallMax = root.data;
            }
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }



}
