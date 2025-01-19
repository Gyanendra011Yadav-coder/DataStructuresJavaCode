package FirstPhaseLearning.GraphDataStructure;

import java.util.Queue;

public class breadthFirstSearch {
    class Node {
        int data;
        boolean visited;
        Node(int data){
            this.data=data;
            visited = false;
        }
    }
    int noNodeCount;
    int adjMatrix[][];
    Node nodeList[];
    Queue<Integer> queue=new java.util.LinkedList<>();
    breadthFirstSearch(int size){
        int max_Size=size;
        noNodeCount=0;
        nodeList=new Node[max_Size];
        adjMatrix=new int [max_Size][max_Size];
    }

    public void addNode(int data){
        nodeList[++noNodeCount]=new Node(data);
    }

    public void addEdge(int start, int end){
        adjMatrix[start][end]=1;
        adjMatrix[end][start]=1;
    }

    public void printNode(int index){
        System.out.println(nodeList[index].data+" ");
    }

    public int isConnected(int index){
        for (int i = 0; i <noNodeCount; i++) {
            if (adjMatrix[index][i]== 1 && nodeList[index].visited==false){
                return i;
            }
        }
        return -1;
    }

    void bfs() {
        nodeList[0].visited = true;
        printNode(0);
        queue.add(0);
        int node1;
        while (!queue.isEmpty()) {
            int node2 = queue.poll();
            while ((node1 = isConnected(node2)) != -1) {       // if the node is not yet visited then mark it as visited and then print it and store the index value to traverse the adjacent node
                nodeList[node1].visited = true;
                printNode(node1);
                queue.add(node1);
            }
        }
    }

    public static void main(String[] args) {
        breadthFirstSearch BFS = new breadthFirstSearch(8);
        BFS.addNode(50);
        BFS.addNode(200);
        BFS.addNode(20);
        BFS.addNode(10);
        BFS.addNode(15);
        BFS.addNode(30);
        BFS.addNode(5);
        BFS.addNode(300);

        BFS.addEdge(0, 3);
        BFS.addEdge(1, 2);
        BFS.addEdge(3, 4);
        BFS.addEdge(3, 5);
        BFS.addEdge(4, 5);
        BFS.addEdge(4, 6);
        BFS.addEdge(5, 7);
        BFS.addEdge(5, 6);
        BFS.addEdge(6, 7);
        BFS.bfs();
    }
    }

