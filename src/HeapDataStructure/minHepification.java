package HeapDataStructure;

public class minHepification {
    int []minHeapArray;
    int sizeOfMinHeap;
    int maxSizeMinHeap;
    minHepification(int size){
        this.sizeOfMinHeap=0;
        this.maxSizeMinHeap=size;
        minHeapArray = new int[size];
    }

    /***
     * THIS, METHOD WILL INSERT THE NODES IN THE TREE
     */
    public void insertMinHeap(int element){
        minHeapArray[++sizeOfMinHeap]=element;
    }

}
