package HeapDataStructure;

public class MaxHepification {
    int []heap; // This, is the heap Array that will be storing the nodes of the tree
    int maxHeapSize;   // this will be storing the total Length of the heap
    int size;         // this will storing the no of nodes inserted in the heap
    MaxHepification(int size){
        maxHeapSize = size;
        size=0;
        heap=new int[size];
        heap[0] = Integer.MAX_VALUE;
    }
    

}
