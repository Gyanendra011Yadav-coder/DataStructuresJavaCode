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
    public void addNode(int data){
     nodeList[noNodesInserted++]=new Node(data);
    }

    //method to add edges
public void addEdge(int start, int end) {
    adjMatrix[start][end]=1;
    //if,BI-DIRECTIONAL GRAPH IS GIVEN THEN WE WILL ADD THIS LINE
    adjMatrix[end][start]=1;
}

//METHOD TO PRINT THE NODES OF THE GRAPH
    public void printNodes(int index){
      System.out.print(nodeList[index].data+" ");
 }

 //method to check if the node is visited or not
    public  int isVisited(int index){
        for (int i = 0; i <noNodesInserted ; i++) {
            if (adjMatrix[i][index]==1 && nodeList[i].visited==false){
                return i;
            }
        }
        return -1;
 }

 //Main method that will be used to Print DFS
    public void dfs(int n){
      nodeList[n].visited=true;
      printNodes(n);
      int node1;
      if((node1=isVisited(n))!=-1){
          dfs(node1);
        }
    }
    //this is the main method of the class
    public static void main(String[]args){
     depthFirstSearch d = new depthFirstSearch(8);
        d.addNode(50);
        d.addNode(200);
        d.addNode(20);
        d.addNode(10);
        d.addNode(15);
        d.addNode(30);
        d.addNode(5);
        d.addNode(300);

        d.addEdge(0, 3);
        d.addEdge(0,1);
        d.addEdge(1, 2);
        d.addEdge(3, 4);
        d.addEdge(3, 5);
        d.addEdge(4, 5);
        d.addEdge(4, 6);
        d.addEdge(5, 7);
        d.addEdge(5, 6);
        d.addEdge(6, 7);
        d.dfs(0);
    }




}



