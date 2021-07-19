package GraphDataStructure;

public class BreathFirstSearch {
    graphNode[] nodeList;
    int[][] adjMatrix;
    int numberOfNodes;

    /*CONSTRUCTOR OF CLASS*/
    BreathFirstSearch(int size) {
        int MAX_SIZE = size;
        nodeList = new graphNode[MAX_SIZE];
        adjMatrix = new int[MAX_SIZE][MAX_SIZE];
        numberOfNodes = 0;
    }

    /*THIS, METHOD WILL INSERT THE VALUES IN THE GRAPH*/
    public void addNode(graphNode element) {
        nodeList[numberOfNodes++] = element;
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


}
