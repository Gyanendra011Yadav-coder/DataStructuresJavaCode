package HeapDataStructure;

public class MaxHepification {
    int[] heap; // This, is the heap Array that will be storing the nodes of the tree
    int maxHeapSize;   // this will be storing the total Length of the heap
    int size;         // this will storing the no of nodes inserted in the heap

    MaxHepification(int size) {  //constructor of the class
        this.maxHeapSize = size;
        size = 0;
        heap = new int[this.maxHeapSize + 1];
        heap[0] = Integer.MAX_VALUE;  // HERE, WE ARE MAKING THE VALUE AT THE INDEX 0, AS WE DO NOT USE 0 INDEX IN THE HEAPS
    }

    /******
     * IN, THIS METHOD WE WILL BE ADDING THE NODES IN THE HEAP
     */
    public void insert(int data) {
        heap[++size] = data;
        /**
         int index=size;
         while(index>1 && heap[index/2]>heap[index]){
         swap(index,index/2);
         index=index/2;
         */
    }

    /*****
     * In, this method we will be Converting the heap to Max_Heap
     */
    public void build_Heap() {
        int lastNonLeaveNode = (int) Math.floor(size / 2.0); // BY, USING THS WE ARE FINDING THE LAST NON-LEAVE NODES
// THIS,LOOP WILL BE ITERATING FROM THE LAST NON-LEAVE NODE TO 1ST NON-LEAVE NODE
        for (int i = lastNonLeaveNode; i >= 1; i--) {
            max_Heap(heap, i);
        }
    }

    /*****
     *THIS, WILL BE CONVERTING THE HEAP TO THE MAX HEAP
     */
    private void max_Heap(int[] heap, int i) {
        if (isLeaf(i)) {
            return;
        }
        int leftChild = 2 * i;
        int rightChild = (2 * i) + 1;
        /*
        if (rightChild<=size ){
            if(heap[leftChild]<=heap[i] && heap[rightChild] <=heap[i]){
                return;
            }
        }else{
            if (heap[leftChild]<=heap[i]){
                return;
            }
        }
        int largest;
        if (leftChild<=size && heap[leftChild]>heap[i])
        {
            largest = leftChild;
        }else {
            largest=i;
        }
        if (rightChild<=size && heap[rightChild]>heap[largest]){
            largest = rightChild;
        }
        if(i!=largest){
            swap(i,largest);
        }
        max_Heap(heap, largest);
        */
        if (leftChild < maxHeapSize && heap[i] < heap[leftChild]) {
            if (heap[leftChild] > heap[rightChild]) {
                swap(i, leftChild);
                max_Heap(heap, leftChild);
            } else {
                swap(i, rightChild);
                max_Heap(heap, rightChild);
            }
        }
        if (rightChild < maxHeapSize && heap[i] < heap[rightChild]) {
            if (heap[leftChild] > heap[rightChild]) {
                swap(i, leftChild);
                max_Heap(heap, leftChild);
            } else {
                swap(i, rightChild);
                max_Heap(heap, rightChild);
            }
        }

    }

    /****
     * THIS, METHOD WILL BE REMOVING THE LARGEST ELEMENT OF THE HEAP
     */
    public int remove_Max_Element() {
        if (size <= 0) {
            return -1;
        }
        int max = heap[1];
        heap[1] = heap[size];
        size--;
        max_Heap(heap, 1);
        return max;
    }

    /******
     *THIS, METHOD WILL BE SWAPING THE VALUES
     */
    private void swap(int largestChild, int i) {
        int temp = heap[largestChild];
        heap[largestChild] = heap[i];
        heap[i] = temp;
    }

    /******
     *THIS,METHOD WILL BE CHECKING IF THE THE CURRENT NODE IS A LEAF OR NOT
     * */
    public boolean isLeaf(int positionOfTheNode) {
        // HENCE, OUR LEAVE EXISTS,BETWEEN (SIZE/2)+1 TO SIZE
        if (positionOfTheNode > (size / 2) && positionOfTheNode <= size) {
            return true;
        } else {
            return false;
        }
    }

    /****
     * in THI, METHOD WILL BE PRINTING THE HEAPS
     */
    public void printHeap() {
        for (int i = 1; i <= size; i++) {
            System.out.print(heap[i] + " ");
        }
    }


}
