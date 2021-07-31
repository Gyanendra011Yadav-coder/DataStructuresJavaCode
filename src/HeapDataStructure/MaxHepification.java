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
    /******
     * IN, THIS METHOD WE WILL BE ADDING THE NODES IN THE HEAP
     */
    public void insert(int data){
        heap[++size] = data;
    }
    /*****
     * In, this method we will be Converting the heap to Max_Heap
     */
    public void build_Heap(){
        int lastNonLeaveNode= (int) Math.floor(size/2.0); // BY, USING THS WE ARE FINDING THE LAST NON-LEAVE NODES
// THIS,LOOP WILL BE ITERATING FROM THE LAST NON-LEAVE NODE TO 1ST NON-LEAVE NODE
        for (int i =lastNonLeaveNode; i>1 ; i--) {
            max_Heap(heap,i);
        }
    }

    /*****
     *THIS, WILL BE CONVERTING THE HEAP TO THE MAX HEAP
     */
    private void max_Heap(int[] heap, int i) {
        if (isLeaf(i)) {
            return;
        }
    }

    private boolean isLeaf(int positionOfTheNode) {
 // HENCE, OUR LEAVE EXISTS,BETWEEN (SIZE/2)+1 TO SIZE
        if (positionOfTheNode>(size)/2 && positionOfTheNode<size){
            return true;
        }else{
            return false;

        }
    }


}
