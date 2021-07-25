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

    /*TRAVERSING THE TREE USING INORDER APPROACH*/
    public static void inOrder (Node root){
        if (root==null){
            return;
        }
        inOrder(root.leftChild);
        System.out.println(root.data);
        inOrder(root.rightChild);
    }

    /*TRAVERSE THE TREE USING PRE-ORDER APPROACH*/
    public static void preOrder(Node root){
        if (root==null){
            return;
        }
        System.out.println(root.data);
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
            System.out.println(root.data);
        }
    }

/*THIS , IS THE MAIN METHOD OF THE CLASS.*/
    public static void main(String[] args) {
       root=new Node(1);
       root.leftChild=new Node(2);
        root.rightChild=new Node(3);
        root.leftChild.leftChild=new Node(4);
        root.leftChild.rightChild=new Node(5);
        root.rightChild.leftChild=new Node(6);
        root.rightChild.leftChild=new Node(7);
        System.out.println("IN-ORDER TRAVERSAL OF THE TREE:-");
        System.out.println("\n");
        inOrder(root);
        System.out.println("PRE-ORER TRAVERSAL OF THE TREE:-");
        System.out.println("\n");
        preOrder(root);
        System.out.println("POST ORDER TRAVERSAL OF THE TREE:-");
        System.out.println("\n");
        postOrder(root);

    }

    }

