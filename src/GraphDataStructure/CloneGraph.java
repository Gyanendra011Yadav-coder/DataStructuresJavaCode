package GraphDataStructure;

import java.util.ArrayList;
import java.util.List;

public class CloneGraph {
    class  Node {
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
        //Calling the DFS on the graph
        dfs(node,copy,visited);
        return copy;
    }

    // method that will help to print the DFS of the graph
    public  void dfs(Node node , Node copy, Node []visited){
        //marking the copy node visited in the visited array
        visited[copy.val]=copy;
        //Now, we will be Traversing the Neighboiurs of the current Node
        for(Node n: node.neighbors){
            //checking if the current Node is Visited or not
            if(visited[n.val]==null){
                //it is not visited, so we will be just making it's copy and adding it in the list of Neighbours to the current Node
                Node newNode= new Node(n.val);
                copy.neighbors.add(newNode);
                //Again, calling dfs function with node as the current node and copy will be neighbour of current node
                dfs(n,newNode,visited);
            }else{
                //if it is already visited then, we will be just taking out the node from visited and mark it visited
                copy.neighbors.add(visited[n.val]);
            }
        }
    }
}
