package GraphDataStructure;


import java.util.LinkedList;

public class graphImplementation {
    private class graph{
        static int [][]adjMatrix;
        LinkedList<Integer>[]adjList;
        graph(int node){
            this.adjMatrix=new int[node][node];
            this.adjList= new LinkedList[node];
            for(int i =0;i<node;i++){
                adjList[i]=new LinkedList<>();
            }
        }
    }

    /**Method to Insert Element in the Matrix*/
    private static void addEdge(int initialNode, int finalNode){
        graph.adjMatrix[initialNode][finalNode]=1;
        graph.adjMatrix[finalNode][initialNode]=1;
    }

}
