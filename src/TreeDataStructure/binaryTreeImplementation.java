package TreeDataStructure;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class binaryTreeImplementation {

    public class treeNode{
        int data;
        treeNode leftChild;
        treeNode rightChild;
        public treeNode(int value){
            data=value;
            leftChild=null;
            rightChild=null;
        }
    }
    treeNode rootNode=null;
    //Insettion in Binary Tree
    public void insert(int data){
        treeNode newNode= new treeNode(data);
        if(rootNode==null){
            rootNode=newNode;
        }
        //This Code Will be traversing the tree
        Queue<treeNode> q = new LinkedList<>();
        treeNode tempNode=rootNode;
        q.add(tempNode);
        while(!q.isEmpty()){
            tempNode=q.poll();
            q.remove();
            if(tempNode.leftChild==null){
                tempNode.leftChild=new treeNode(data);
                break;
            }else{
                q.add(tempNode.leftChild);
            }
            //this coondition will be checking if the right child of the node is null then create new tree Node at that location else add the rightNode of tree in the queue
            if(tempNode.rightChild==null){
                tempNode.rightChild=new treeNode(data);
                break;
            }else{
                q.add(tempNode.leftChild);
            }
        }
    }


}

