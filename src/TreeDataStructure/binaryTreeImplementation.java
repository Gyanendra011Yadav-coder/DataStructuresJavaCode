package TreeDataStructure;

import java.util.*;

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

    //Method to Delete Node From The Binary Tree
    public boolean deleteNodeTree(int value){
        if(rootNode==null){
            return false;
        }

        return false;
    }

    //Traversal of the Tree

    /**
     *We know Inorder Traversal is done Using-> Left->RootNode->RightNode
     */
    public List<Integer> inOrderTraversalTree(treeNode root){
        List <Integer> traverseNodes= new ArrayList<>();
        if(root ==null){
            return traverseNodes;
        }
        inOrderTraversalTree(root.leftChild);
        traverseNodes.add(root.leftChild.data);
        inOrderTraversalTree(root.rightChild);

        return traverseNodes;
    }
    /**
     *We know PreOrder Traversal is done Using: Root->LeftNode->RightNode
     */
    public void preOrderTraversal(treeNode rootNode){
        if(rootNode==null){
            return;
        }
        System.out.println(rootNode.leftChild.data);
        preOrderTraversal(rootNode.leftChild);
        preOrderTraversal(rootNode.rightChild);
    }


    /**
     *We know PostOrder-Traversal is done Using: LeftNode->RightNode->Root
     */
    public void postOrderTraversal(treeNode rootNode){
        if(rootNode==null){
            return;
        }
        preOrderTraversal(rootNode.leftChild);
        preOrderTraversal(rootNode.rightChild);
        System.out.println(rootNode.leftChild.data);
    }


}

