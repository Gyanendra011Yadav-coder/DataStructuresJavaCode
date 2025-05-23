package FirstPhaseLearning.HeapDataStructure;

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
        if (isLeaf(i)){
            return;
        }
        int leftChild=2*i;
        int rightChild=2*i+1;
        if (rightChild<=sizeOfMinHeap && leftChild <= sizeOfMinHeap){
            if (minHeapArray[i]>minHeapArray[leftChild]){
                if (minHeapArray[leftChild]<minHeapArray[rightChild]){
                    swap(leftChild,i);
                    minHeapification(minHeapArray,rightChild);
                }else{
                    swap(i,rightChild);
                    minHeapification(minHeapArray,rightChild);
                }
            }
            if (minHeapArray[i]>minHeapArray[rightChild]){
                if (minHeapArray[rightChild]<minHeapArray[leftChild]){
                    swap(rightChild, i);
                    minHeapification(minHeapArray,rightChild);
                }else {
                    swap(i,leftChild);
                    minHeapification(minHeapArray,leftChild);
                }
            }
        }
    }

    /***
     * THIS,METHOD WILL BE CHECKING IF THE PASSED INDEX KEY IS LEAF OR  NOT
     */
    private boolean isLeaf(int i) {
        if (i>(sizeOfMinHeap/2) && i<sizeOfMinHeap){
            return true;
        }
        return false;
    }
    /***
     * THIS,METHOD WILL BE USED FOR SWAPPING
     */
    public void swap(int num1, int num2){
        int temp=num1;
        num1= num2;
        num2=temp;
    }


}
