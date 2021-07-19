package GraphDataStructure;

import java.util.LinkedList;

public class GraphByDepthFirsSearch {
    private int vertex;
    private LinkedList<Integer>[] adj;
    @SuppressWarnings("unchecked")GraphByDepthFirsSearch (int size){
        this.vertex=size;
        adj=new LinkedList[size];
        for (int i = 0; i <size ; i++) {
            adj[i]=new LinkedList();   // creating the linked list ofn the Node ith.
        }
    }
}
