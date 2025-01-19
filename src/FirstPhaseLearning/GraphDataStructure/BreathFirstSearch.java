package FirstPhaseLearning.GraphDataStructure;

public class BreathFirstSearch {
    graphNode[] nodeList;
    int[][] adjMatrix;
    int numberOfNodes;
    QueueClass queue;
    /*CONSTRUCTOR OF CLASS*/
    BreathFirstSearch(int size) {
        int MAX_SIZE = size;
        nodeList = new graphNode[MAX_SIZE];
        adjMatrix = new int[MAX_SIZE][MAX_SIZE];
        numberOfNodes = 0;
        queue=new QueueClass(MAX_SIZE);
    }

    /*THIS, METHOD WILL INSERT THE VALUES IN THE GRAPH*/
    public void addNode(int element) {
        nodeList[numberOfNodes++] = new graphNode(element);
    }

    /*THIS METHOD WILL ADD EDGES IN THE GRAPH*/
    public void addEdge(int start, int end) {
        adjMatrix[start][end] = 1;
        adjMatrix[end][start] = 1;
    }

    /*this method wil print the Node */
    public void print(int index) {           //PASSING:-  index-->> because to access the element at specified position
        System.out.println(nodeList[index].data);
    }

    /*THIS, METHOD WILL SE UNVISITED NODE */
    public int unvisitedNode(int node) {
        boolean result=false;
        int indexResult = 0;
        for (int i = 0; i < numberOfNodes; i++) {
            if (adjMatrix[node][i] == 1 && nodeList[i].visited == false)
                indexResult=i;
                 result = true;
        }
        if (result==true){
            return indexResult;
        }else{
            return -1;
        }
    }

    /*THIS, METHOD WILL APPLY THE BREADTH FIRST SEARCH APPROACH*/

    public void breathForstSearch(){
        /*
           we are taking,0 that that shows that we are starting it from index, as it is Graph
           we  can take any node to start.
         */
        nodeList[0].visited=true;
   // printing the node
        print(0);
   // Enqueuing In the FirstPhaseLearning.Queue
        queue.enqueue(0);
        int node1;
        while (!queue.isEmpty()){
            int node2= queue.dequeue();
            while ((node1=unvisitedNode(node2))!=-1){
                nodeList[node1].visited=true;
                print(node1);
                queue.enqueue(node1);
            }
        }

    }


}
