package GraphDataStructure;

import java.util.LinkedList;

class totalComponents {
     int vertex;
     LinkedList<Integer> adj[];
     totalComponents(int size){
         vertex=size;
         for (int i = 0; i <size ; i++) {
            adj[i] = new LinkedList<Integer>();
         }
     }
}
