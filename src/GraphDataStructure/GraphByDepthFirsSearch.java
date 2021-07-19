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
     * this mmethod takes: input as bertex that shows that we are STARTING IT FROM VERTEX TO ADD
     *
     */
    public void depthFirstSearchNodeNotSpecified() {
        boolean[] visited = new boolean[vertex];
        for (int i = 0; i < vertex; i++) {
            if (visited[i]==false) {
                //DFSUtil(i, visited);  //RECURSION
            }
        }
    }



    }
}
