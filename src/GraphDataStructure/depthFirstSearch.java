package GraphDataStructure;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class depthFirstSearch {
 int vertex;
 LinkedList adjList[];

 depthFirstSearch(int vertex) {
     this.vertex = vertex;
     adjList = new LinkedList[vertex];
     for (int i = 0; i < vertex; i++) {
         adjList[i] = new LinkedList();
     }
 }
     public void addEdge(int start, int end){
         adjList[start].add(end);
        // adjList[end].add(start);
 }
 void dfs(){
     boolean[] visited=new boolean[vertex];
     Arrays.fill(visited,false);
     for (int i = 0; i < vertex; i++) {
         DFSUtil(visited,i);
     }
    }
    private void DFSUtil(boolean[] visited, int vertexIndex) {
       visited[vertexIndex]=true;
        System.out.println(vertexIndex);
        Iterator<Integer> iterate=adjList[vertexIndex].listIterator();
        while(iterate.hasNext()){
            int value= iterate.next();
            if (visited[value]!=true){
                DFSUtil(visited,value);
            }
        }
    }

    public static void main(String[] args) {
        depthFirstSearch df = new depthFirstSearch(10);
        df.addEdge(0,1);
        df.addEdge(0,2);
        df.addEdge(1,2);
        df.addEdge(2,0);
        df.addEdge(2,3);
        df.addEdge(3,3);
        df.dfs();

    }


}
