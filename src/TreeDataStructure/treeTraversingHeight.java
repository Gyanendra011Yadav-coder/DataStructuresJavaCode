package TreeDataStructure;

public class treeTraversingHeight {
    static class  Node{
        int data;
        Node leftChild, rightChild;
        Node(int data){
            this.data=data;
            leftChild=rightChild=null;
        }
    }
    /*NODE OF THE TREE*/
    static Node root;
/**
 * TRAVERSING THE TREE TECHNIQUES
 */
    /*TRAVERSING THE TREE USING INORDER APPROACH*/
    public static void inOrder (Node root){
        if (root==null){
            return;
        }
        inOrder(root.leftChild);
        System.out.print(root.data+",");
        inOrder(root.rightChild);
    }

    /*TRAVERSE THE TREE USING PRE-ORDER APPROACH*/
    public static void preOrder(Node root){
        if (root==null){
            return;
        }
        System.out.print(root.data+",");
        preOrder(root.leftChild);
        preOrder(root.rightChild);
    }

    /*NOW,WE WILL BE TRAVERSING THE TREE USING THE POST ORDER APPROACH*/
    public static void postOrder(Node root){
        if (root==null){
            return;
        }else {
            postOrder(root.leftChild);
            preOrder(root.rightChild);
            System.out.print(root.data+",");
        }
    }

    /**
     * NOW, WE WILL BE TRYING TO FIND OUT THE HEIGHT OF THE TREE.
     * @return
     */
    public static int heightOfTree(Node root){
        if (root== null){
            return -1;
        }
        int leftHeight =heightOfTree(root.leftChild);
        int rightHeight=heightOfTree(root.rightChild);
        if (leftHeight>rightHeight) {
            return leftHeight+1;
        }else {
            return rightHeight+1;
        }
    }
    /*   NOW,WE WILL BE FINDING OUT THE SIZE OF TREE   */
    public static int sizeOfTree(Node root){
        if (root==null){
             return 0;
        }
       //int leftSize=sizeOfTree(root.leftChild);
       //int rightSize=sizeOfTree(root.rightChild);
        //int size= (leftSize+rightSize)+1;
        //return size;
/***
 * NOW, WE CAN DO THIS ONLY INA SINGLE LINE
 */
        return (sizeOfTree(root.leftChild)+sizeOfTree(root.rightChild)+1);

    }

/*THIS,IS THE MAIN METHOD OF THE CLASS.*/
    public static void main(String[] args) {
       root=new Node(1);
       root.leftChild=new Node(2);
        root.rightChild=new Node(3);
        root.leftChild.leftChild=new Node(4);
        root.leftChild.rightChild=new Node(5);
        root.rightChild.leftChild=new Node(6);
        root.rightChild.rightChild=new Node(7);
        System.out.println("THE HEIGHT OF THE TREE IS:");
        System.out.println(heightOfTree(root));
        System.out.println("THE SIZE OF THE TREE IS:-");
        System.out.println(sizeOfTree(root));
        System.out.println("IN-ORDER TRAVERSAL OF THE TREE:-");

        inOrder(root);
        System.out.print("\n");
        System.out.println("PRE-ORER TRAVERSAL OF THE TREE:-");

        preOrder(root);
        System.out.print("\n");
        System.out.println("POST ORDER TRAVERSAL OF THE TREE:-");

        postOrder(root);
        System.out.print("\n");

    }

    }

