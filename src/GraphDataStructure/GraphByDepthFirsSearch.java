package GraphDataStructure;

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
}
