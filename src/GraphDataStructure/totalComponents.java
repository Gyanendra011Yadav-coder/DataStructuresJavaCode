package GraphDataStructure;

import java.util.ArrayList;

class totalComponents {
    int vertex;
    ArrayList <ArrayList<Integer>> adjArrayList;
    totalComponents(int size){
        int max_Size=size;
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

    //METHOD TO PERFORM DFS
    public int traverseWholeNodes(){
        int countConnectedComp=0;
        boolean []visited = new boolean[vertex];
        for (int i = 0; i <vertex ; i++) {
            if (visited[i]!=true){
                countConnectedComp++;
                markVisited(i,visited);
            }
        }
        return countConnectedComp;
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
    //main method of  the class

    public static void  main(String[]args){

    }

}
