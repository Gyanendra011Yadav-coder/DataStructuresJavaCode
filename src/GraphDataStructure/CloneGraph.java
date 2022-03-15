package GraphDataStructure;

import java.util.ArrayList;
import java.util.List;

public class CloneGraph {
    class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    public Node cloneGraph(Node node) {
        //base case
        if(node==null){
            return null;
        }
        //this will keep track of the nodes, which node has visited or which one not
        Node []visited= new Node[1000];
        //creating the copy of the very first node that is passed
        Node copy= new Node(node.val);

    }
}
