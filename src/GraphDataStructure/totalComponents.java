package GraphDataStructure;

import java.util.ArrayList;

class totalComponents {
    int vertex;
    ArrayList <ArrayList<Integer>> adjArrayList;
    totalComponents(int size){
        vertex=size;
        for (int i = 0; i <size; i++) {
            adjArrayList.add(i,new ArrayList<>());
        }
    }
    //method to add edges between the Nodes.
    public void addEdges(int start, int end){
        adjArrayList.get(start).add(end);
        adjArrayList.get(end).get(start);
    }
}
