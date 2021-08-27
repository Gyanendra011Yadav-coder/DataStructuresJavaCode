package GraphDataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class breadthFirstSearch {
    //THIS IS THE NODE CLASS OF THE GRAPH.
   class Node {
       int data;
       boolean visited;
       Node(int data){
           this.data = data;
           visited = false;
       }
   }

   class Graph{
       int noNodesInserted;
       Node nodeList[];
       int adjMatrix[][];
       Queue<Integer> queue = new LinkedList<>();
       Graph(int length){
            int max_Length=length;
            noNodesInserted=0;
            nodeList = new Node[max_Length];
            adjMatrix=new int[max_Length][max_Length];
       }
   }


}
