package TreeDataStructure;

public class binarySearchTree {
    /*THE ROOT NODE OF THE TREE*/
    static Node rootNode;

    /*IN THIS METHOD, WE WILL BE FINDING THE MINIMUM ELEMENT FROM THE BINARY SEARCH TREE*/
    /*THIS, IS ITERATIVE WAY OF FINDING*/
    public static int minNode(Node node) {
        int minElement = 0;
        if (node == null)
            return -1;
        else if (node.leftChild == null)
            return node.data;
        else {
            while (node.leftChild != null) {
                minElement = node.leftChild.data;
                node = node.leftChild;
            }
        }
        return minElement;
    }

    /**
     * RECURSIVE APPROACH TO FIND MINIMUM ELEMENT
     */
    public static int recurMinElementTree(Node node) {
        if (node.leftChild == null) {
            return node.data;
        }
        return recurMinElementTree(node.leftChild);
    }

    /*TRAVERSING, THE BINARY SEARCH TREE */
    public static void inOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.leftChild);
        System.out.print(node.data + " ");
        inOrderTraversal(node.rightChild);
    }

    /*THIS, IS THE MAIN METHOD OF THE TREE*/
    public static void main(String[] args) {
        rootNode = new Node(8);
        rootNode.leftChild = new Node(3);
        rootNode.rightChild = new Node(10);
        rootNode.leftChild.leftChild = new Node(1);
        rootNode.leftChild.rightChild = new Node(6);
        rootNode.rightChild.leftChild = new Node(9);
        rootNode.rightChild.rightChild = new Node(4);
        System.out.println("TRAVERSAL OF THE BINARY TREE IS:-");
        inOrderTraversal(rootNode);
        System.out.println("\n");
        System.out.println("THE MINIMUM VALUE IN THE BINARY SERACH TREE IS:-");
        System.out.println(minNode(rootNode));
        System.out.println(recurMinElementTree(rootNode));


    }

    /*THIS, IS THE NODE CLASS OF THE BINARY TREE*/
    public static class Node {
        int data;
        Node leftChild;
        Node rightChild;

        Node(int data) {
            this.data = data;
            leftChild = rightChild = null;
        }
    }
}




