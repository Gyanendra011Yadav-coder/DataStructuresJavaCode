package TreeDataStructure;

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
    }


}
