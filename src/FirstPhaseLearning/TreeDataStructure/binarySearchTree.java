package FirstPhaseLearning.TreeDataStructure;

public class binarySearchTree {
    /*THE ROOT NODE OF THE TREE*/
    static Node rootNode;

    /**
     *
     * THIS, IS THE METHOD OF INSERTING THE NODES IN THE BINARY SERACH TREE
     */
     void insert(int key){
         rootNode= recurInsert(rootNode,key);
    }
     Node recurInsert(Node root, int value){
        if (root==null){
            root=new Node(value);
            return root;
        }
        if (root.data>value){
            root.leftChild=recurInsert(root.leftChild,value);
        }
        else
            root.rightChild=recurInsert(root.rightChild,value);
        return root;
    }

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
    public static int recurMinElementTree(Node node, int key) {
        if (node.leftChild == null) {
            return node.data;
        }
        return recurMinElementTree(node.leftChild, key);
    }

    /**
     * THIS, IS THE RECURSIVE APPROACH TO FIND OUT THE MAXIMUM ELEMENT,IN THE BINARY SERACH TREE
     */
    public static int maxElementTree(Node node) {
        if (node.rightChild == null) {
            return node.data;
        }
        return maxElementTree(node.rightChild);
    }

    /***
     *
     * THIS, IS THE RECURSIVE APPROACH TO FIND OUT?
     * wheather, element is present in the tree or not?
     */
    public static void searchNode(int key, Node root) {
        if (root == null) {
            System.out.println(key + ",NOT FOUND IN THE TREE.");
        } else if (root.data == key) {
            System.out.println(key + ", is Present in the Tree.");
        } else {
            if (key < root.data) {
                searchNode(key, root.leftChild);
            } else {
                searchNode(key, root.rightChild);
            }
        }
    }

    /****
     *IN, THIS METHOD WE WILL BE DELETING THE NODE OF HE TREE
     */
    public static Node deleteNode(Node root, int delValue){
        //STEP-01:- WE WILL BW CHECKING WHEATHER THE NODE IS NULL OR NOT
        if(root==null){
            return root;
        }
        //STEP-02:- WE WILL BE NOW CHECKING, IF THE NODE TO BE DELETED IS GREATER THAN THAN THE ROOT OR NOT
        else if(root.data>delValue){
            root.leftChild=deleteNode(root.leftChild,delValue);
        }else if (root.data < delValue){
            root.rightChild=deleteNode(root.rightChild, delValue);
        }
        //STEP-03:- NOW, WE WILL BE LOOKING FOR THE THIRD STEP,HERE WE WILL BE CHECKING IF THE
        // NODE TO BE DELETE IS LEAF NODE OR IT HAS ONE CHILD OR IT HAS TWO CHILD
        else{
            if(root.leftChild==null){
                return root.rightChild;
            }else if (root.rightChild==null){
                return root.leftChild;
            }else{
         // step-04:- NOW, WE WILL BE CHECKING IF THE NODE HAS TWO CHILDREN OR NOT
            Node successorParent=root;
            Node successorNode=root.rightChild; // WE ARE STARING IT FORM THE ROIGHT OF THE ROOT,BECAUSE WE KNOW THE SUCCESOR IS ALWAYS PRESENT IN THE RIGHT SUB-TREE OF THE BST.
            while (successorNode.leftChild!=null){
                successorParent = successorNode;
                successorNode= successorNode.leftChild;
            }
            if(successorParent!= root){
                successorParent.leftChild=successorNode.rightChild;
            }else {
                successorParent.rightChild=successorNode.rightChild;
            }
                root.data=successorNode.data;
            }

        }
        return root;
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
        binarySearchTree tree = new binarySearchTree();
        int []treeNode={50,25,15,75,30,70,85,10,23,46,84,90};
        for (int nodeVaue:treeNode) {
            tree.insert(nodeVaue);
        }
        System.out.println("TRAVERSAL OF THE BINARY TREE IS:-");
        inOrderTraversal(rootNode);
        System.out.println("\n");
        System.out.println("THE MINIMUM VALUE IN THE BINARY SERACH TREE IS:-");
        System.out.println(minNode(rootNode));
        System.out.println("THIS, IS THE MINIMUM ELEMENT FIND USING RECURSION");
        System.out.println(recurMinElementTree(rootNode, 100));
        System.out.println("THE MAXIMUM ELEMENT IN THE TREE IS:=>");
        System.out.println(maxElementTree(rootNode));
        System.out.println("SERACHING THE VALUE IN THE TREE:-");
        searchNode(100, rootNode);

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




