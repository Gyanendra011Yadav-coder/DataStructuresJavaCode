package TreeDataStructure;

public class mirrorTreesCheck {
    static class Node{
        int value;
        Node left;
        Node right;
        Node (int data){
            this.value=data;
            left=right=null;
        }
    }
    static Node rootNodeTree1;
    static Node rootNodeTree2;
    /**********
     * IN, THIS METHOD WE WILL BE CHECKING IF THE TWO TREES ARE MIRROF EACH OTHER OR NOT
     */
    public static boolean isMirrorTrees(Node node1, Node node2){
        if(node1==null && node2==null){
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        return ((node1.value==node2.value)&&
                (isMirrorTrees(node1.left,node2.right)&&
                        isMirrorTrees(node1.right, node2.left)));
    }

    /******
     * IN, THIS METHOD I WILL DOING INORDER TRAVERSAL OF THE TREE
     * @return
     */
    public static void inOrder(Node root){

        if (root == null) {
            return ;
        }else {
            inOrder(root.left);
           System.out.print(root.value+" ");
            inOrder(root.right);
        }
    }


    public static void main(String[] args) {
        rootNodeTree1 = new Node(2);
        rootNodeTree1.left= new Node(1);
        rootNodeTree1.right = new Node(3);
        rootNodeTree1.left.left= new Node(4);
        rootNodeTree1.left.right=  new Node(5);
        rootNodeTree1.right.left = new Node(6);
        rootNodeTree1.right.right= new Node (8);

        rootNodeTree2 = new Node(2);
        rootNodeTree2.left= new Node(3);
        rootNodeTree2.right = new Node(1);
        rootNodeTree2.left.left= new Node(8);
        rootNodeTree2.left.right=  new Node(6);
        rootNodeTree2.right.left = new Node(5);
        rootNodeTree2.right.right= new Node (4);

    }

}
