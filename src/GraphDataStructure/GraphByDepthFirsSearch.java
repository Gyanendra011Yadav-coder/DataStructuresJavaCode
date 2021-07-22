package GraphDataStructure;

import java.util.Iterator;
import java.util.LinkedList;

public class GraphByDepthFirsSearch {
    private int vertex;         //STORE THE NO. OF THE VERTICES
    private LinkedList<Integer>[] adj;
    @SuppressWarnings("unchecked")GraphByDepthFirsSearch (int size){
        this.vertex=size;
        adj=new LinkedList[size];
        for (int i = 0; i <size ; i++) {
            adj[i]=new LinkedList();   // creating the linked list ofn the Node ith.
        }
    }
    /*this, method will add edges */
    public void addEdge(int vertex, int vertexConnected ){
        /*
        vertex= the vertex which we want to connect it with
        vertexConnected: the vertex from which vertex s connected
         */
        adj[vertex].add(vertexConnected);
    }

    /*THIS FUNCTION WILL CREATE THE GRAPH AND WILL APPLY RECURSION */

    /**
     * this method takes: input as bertex that shows that we are STARTING IT FROM VERTEX TO ADD
     *
     */
    public void depthFirstSearchNodeNotSpecified() {
        boolean[] visited = new boolean[vertex];
        for (int i = 0; i < vertex; i++) {
            if (visited[i]==false) {
                DFSUtil(i, visited);  //RECURSION
            }
        }
    }
    public void depthFirstSearchNodeSpecified(int vertexAfterWhichDFSApplied){
        boolean []visited = new boolean[vertex];
        DFSUtil(vertexAfterWhichDFSApplied,visited);
    }
    /*THIS IS METHOD, THAT WILL BE CALLED FOR THE RECURSION*/
    public void DFSUtil(int vertex, boolean[]visited){
        visited[vertex]=true;
        System.out.println(vertex);
        //we, will check wheather all nodes are covered or not
        Iterator<Integer> i = adj[vertex].listIterator();
        while (i.hasNext()){
            int n = i.next();
            if (!visited[n]){
                DFSUtil(n,visited);
            }
        }
    }
    /**
     * this is the main method of this:-    GRAPH BY DFS
     */
    public static void main(String[] args) {
        GraphByDepthFirsSearch gd = new GraphByDepthFirsSearch(4);
        gd.addEdge(0,1);
        gd.addEdge(0,2);
        gd.addEdge(2,0);
        gd.addEdge(2,3);
        gd.addEdge(3,3);
        System.out.println("NO NODE IS SPECIFIED:");
        gd.depthFirstSearchNodeNotSpecified();
        System.out.println("NODE SPECIFIED:-");
        gd.depthFirstSearchNodeSpecified(2);
    }



}
