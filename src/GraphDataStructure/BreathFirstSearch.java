package GraphDataStructure;

public class BreathFirstSearch {
    graphNode []nodeList;
    int [][]adjMatrix;
    int numberOfNodes;
/*CONSTRUCTOR OF CLASS*/
    BreathFirstSearch(int size){
        int MAX_SIZE=size;
        nodeList=new graphNode[MAX_SIZE];
        adjMatrix=new int[MAX_SIZE][MAX_SIZE];
        numberOfNodes=0;
    }
    /*THIS, METHOD WILL INSERT THE VALUES IN THE GRAPH*/
    void addNode(graphNode element){
        nodeList[numberOfNodes++]=element;
    }



}
