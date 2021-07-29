package TreeDataStructure;


public class checkSumTree {
     static class Node {
        long value;
        Node left;
        Node right;

        Node(long data) {
            this.value = data;
            left = right = null;
        }
    }
        static Node root;

    public static void inOrder(Node root){
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.value+" ");
        inOrder(root.right);
    }
    public static void main(String[] args) {
            root = new Node(48);
            root.left = new Node(12);
            root.right = new Node(12);
            root.left.left= new Node (6);
            root.left.right = new Node(6);
            root.right.left = new Node(6);
            root.right.right = new Node(6);
            inOrder(root);
            System.out.println();
      //      if(checkSumTree(root)){
                System.out.println("True");
       //     }else{
                System.out.println("False");
            }
        }


