package GraphDataStructure;

public class depthFirstSearch {
 class Node{
     int data;
     boolean visited;
     Node(int data){
         this.data=data;
         visited=false;
     }
 }
 //REQUIRED COMPONENTS FOR THE TREE
 int noNodesInserted;
 int [][]adjMatrix;
 Node []nodeList;
 depthFirstSearch(int size){
     int max_Size=size;
     noNodesInserted=0;
     adjMatrix= new int[max_Size][max_Size];
     nodeList= new Node[max_Size];
 }
//method to add new  nodes in the Graph
    public void addVertex(int data){
     nodeList[noNodesInserted++]=new Node(data);
    }

    //method to add edges



}



