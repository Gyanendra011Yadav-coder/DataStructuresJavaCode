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

       /***
        *  THIS,METHOD WILL BE ADDING THE NODES IN THE NODELIST.
        */
       public void insertNodeGraph(int element){
           nodeList[++noNodesInserted]=new Node(element);
       }

       /**
        * THIS,METHOD WILL BE ADDING THE EDGES B/W THE VERTICES
        */
       public void addEdge(int start, int end){
           adjMatrix[start][end]=1;
   //   THIS,STATEMENT WE WILL ADD WHEN IT IS UN-DIRECTED GRAPH.
           adjMatrix[end][start]=1;
       }
       /**
        * this method wil be used to print the Nodes of  the graph.
        */
       public void printNode(int index){
           System.out.println(nodeList[index].data);
       }
   }





}
