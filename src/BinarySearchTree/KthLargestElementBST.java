package BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By:  Gyanendra_Yadav
 * on 2022-12-29,Dec,2022
 * in Project: DataStructuresJavaCode
 */
public class KthLargestElementBST {

     class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        InsertNodeBST.Node root = new InsertNodeBST.Node(5);
        root.left=new InsertNodeBST.Node(1);
        root.right=new InsertNodeBST.Node(3);

    }

    int largest=0;
    public int kthLargest(Node root,int K){
        int[] ans = new int[1];
        find(root, K, ans);
        return ans[0];
    }


    public void find(Node node, int K, int[] ans){
        if(node==null){
            return;
        }

        find(node.right, K, ans);

        largest+=1;
        if(largest==K){
            ans[0]=node.data;
            return;
        }

        find(node.left, K, ans);
    }
}
