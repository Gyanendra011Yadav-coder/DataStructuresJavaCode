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


    //method to visit whole nodes and if any node is not visited this mehtod will made it visited.
    public void markVisited(int n, boolean []visited){
        visited[n]=true;
        for (int each : adjArrayList.get(n)){
            if (visited[each]!=true) {
                markVisited(n,visited);
            }
        }
    }

}
