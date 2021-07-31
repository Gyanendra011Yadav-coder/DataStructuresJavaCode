package TreeDataStructure;

public class replaceNodeWithDepthValue {
    static Node rootNode;
    static class Node {
        Node leftChild;
        Node rightChild;
        int data;
        Node(int value){
            this.data = value;
            leftChild=rightChild=null;
        }
    }

    public static void main(String[] args) {
        rootNode=new Node(3);
        rootNode.leftChild= new Node(2);
        rootNode.rightChild = new Node(5);
        rootNode.leftChild.leftChild=new Node(1);
        rootNode.leftChild.rightChild = new Node(4);
    }
}
