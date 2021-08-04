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

    /***
     * THIS,METHOD WILL HELP IN CREATING THE MIN HEAP
     */
    public void buildMinHeap(){
        int lastNonLeafMin=(int)Math.floor(sizeOfMinHeap/2);
        for (int i = lastNonLeafMin; i>=1 ; i--) {
            minHeapification(minHeapArray, i);
        }
    }

    public void minHeapification(int[] minHeapArray, int i) {

    }


}
