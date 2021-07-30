package TreeDataStructure;

public class boundaryTraversalTree {
    static class Node{
        int value;
        Node left;
        Node right;
        Node (int data){
            this.value=data;
            left=right=null;
        }
    }

    /***
     *IN, THIS METHOD WE WILL BE PRINTING THE LEAVES OF THE TREE
     */
    public static void isLeave(Node node ){
        if(node==null){
            return;
        }
        isLeave(node.left); // THIS, WILL BE CHECKING THE LEAVES OF THE LEFT SUB-TREE
        if (node.left==null && node.right == null){  // HERE,WE ARE CHECKING IF THE LEFT AND RIGHT OF ANY NODE IS NULL THEN WE WILL BE PRINT ING IT AS AN LEAVE OF THE TREE
            System.out.println(node.value + " ");
        }
        isLeave(node.right);  // THIS, WILL BE CHECKING THE RIGHT SUB TREE
    }

    /*****
     * IN, THIS METHOD WE WILL BE PRINTING THE LEFT SUB-TREE'S LEFT SIDE NODES FROM TOP-BOTTOM
     */
    public static void leftSide(Node node){
        if(node == null){
            return;
        }
        if(node.left!=null){
            System.out.println(node.value);
            leftSide(node.left);
        }else if (node.right != null){
            System.out.println(node.value);
            leftSide(node.right);
        }
    }
/*****
 * IN, THS METHOD WE WILL BE PRINTING THE RIGht-SUB-TREE NODES FROM BOTTOM TO TOP FASHION
 */
        public static void rightSide(Node node){
            if(node == null){
                return;
            }
            if (node.right != null){
                rightSide(node.right);
                System.out.println(node.value);
            }else if (node.left != null) {
                rightSide(node.left);
                System.out.println(node.left);
            }
        }

}
