package TreeDataStructure;

public class replaceNodeWithDepthValue {

    static class Node {
        Node leftChild;
        Node rightChild;
        int data;
        Node(int value){
            this.data = value;
            leftChild=rightChild=null;
        }
    }

    /*****
     * IN,THIS METHOD WE WILL BE REPLACING THE NODE WITH IT'S DEPTH VALUE
     */
    public static void replaceNodeWithDepth(Node root,int level){
        if (root == null) {
            return;
        }
        root.data=level;


    }

    /**
     *IN, THIS METHOD WE WILL DOING THE INORDER TRAVERSAL OF THE TREE
     */
    public static void inOrderTraversal(Node node){
        if (node == null) {
            return;
        }
        inOrderTraversal(node.leftChild);
        System.out.println(node.data);
        inOrderTraversal(node.rightChild);
    }

    public static void main(String[] args) {
        rootNode=new Node(3);
        rootNode.leftChild= new Node(2);
        rootNode.rightChild = new Node(5);
        rootNode.leftChild.leftChild=new Node(1);
        rootNode.leftChild.rightChild = new Node(4);
        inOrderTraversal(rootNode);
    }

    static Node rootNode;
}