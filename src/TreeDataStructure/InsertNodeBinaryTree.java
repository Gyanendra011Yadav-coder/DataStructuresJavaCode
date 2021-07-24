package TreeDataStructure;
import java.util.LinkedList;
import java.util.Queue;

public class InsertNodeBinaryTree {
    /*THIS, IS THE NODE CLASS OF THE TREE*/
    static class Node{
        int data;
        Node leftChild;
        Node rightChild;
        /*CONSTRUCTOR*/
        Node(int data){
            this.data=data;
            leftChild=rightChild=null;
        }
    }
    static class Graph {
        static Node root;// making the node of the tree
        static Node temp=root;
        Graph(){
            root=null;   // making the root null
        }
        static void insert(Node temp, int key)
        {

            if (temp == null) {
                root = new Node(key);
                return;
            }
            Queue<Node> q = new LinkedList<Node>();
            q.add(temp);

            // Do level order traversal until we find
            // an empty place.
            while (!q.isEmpty()) {
                temp = q.peek();
                q.remove();

                if (temp.leftChild == null) {
                    temp.leftChild = new Node(key);
                    break;
                }
                else
                    q.add(temp.leftChild);

                if (temp.rightChild == null) {
                    temp.rightChild = new Node(key);
                    break;
                }
                else
                    q.add(temp.rightChild);
            }
        }
        /*WE WILL BE TRAVERSING THE TREE USING INORDER TRAVERSAL*/
        public static void inOrder(Node root){
            if (root==null){
                return;
            }
            Node temp=root;
            inOrder(temp.leftChild);
            System.out.println(temp.data);
            inOrder(temp.rightChild);
        }

        public static void main(String[] args){
            root=new Node(10);
            root.leftChild= new Node(20);
            root.rightChild= new Node(30);
            root.leftChild.leftChild = new Node(7);
            root.rightChild.leftChild = new Node(15);
            root.rightChild.rightChild = new Node(8);

            System.out.println("TREE BEFORE INSETTING ANY  NODE ");
            inOrder(root);

            insert(root,14);
            System.out.println("TREE AFTER TTRAVERSING THE ARRAY:");
            inOrder(root);
        }


    }
}
