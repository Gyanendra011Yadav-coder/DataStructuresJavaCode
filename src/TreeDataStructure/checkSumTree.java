package TreeDataStructure;


public class checkSumTree {
    static Node root;

    /***.
     *intilized this clas in whuch we will be chekcing if the node that is passed is
     * is it, equal to the sum of there child or not
     */
    public static boolean checkSumTree(Node node) {
        if (node == null || node.right == null && node.left == null) {
            return true;
        }
        long leftSubTreeSum = sum(node.left);
        long rightSubTreeSum = sum(node.right);
        return node.value == leftSubTreeSum + rightSubTreeSum &&
                checkSumTree(node.left) && checkSumTree(node.right);

    }

    /***
     *this, method will be performing the sum of the nodes of the tree
     */
    public static long sum(Node root) {
        if (root == null) {
            return 0;
        }
        return ((root.value) + sum(root.left) + sum(root.right));
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.value + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        root = new Node(48);
        root.left = new Node(12);
        root.right = new Node(12);
        root.left.left = new Node(6);
        root.left.right = new Node(6);
        root.right.left = new Node(6);
        root.right.right = new Node(6);
        inOrder(root);
        System.out.println();
        if (checkSumTree(root)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    static class Node {
        long value;
        Node left;
        Node right;

        Node(long data) {
            this.value = data;
            left = right = null;
        }
    }
}


