package HeapDataStructure;

import java.util.Scanner;

public class minHeapification {
    int[] heap;
    int maxHeapSize;
    int size;

    minHeapification(int size) {  //constructor of the class
        this.maxHeapSize = size;
        size = 0;
        heap = new int[this.maxHeapSize + 1];
        heap[0] = Integer.MIN_VALUE;
    }

    /***
     * -----------------------------------------------------------
     *main method of the class
     * -----------------------------------------------------------
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases != 0) {
            int sizeOfHeap = sc.nextInt();
            minHeapification min = new minHeapification(sizeOfHeap);
            for (int i = 1; i <= sizeOfHeap; i++) {
                min.insert(sc.nextInt());
            }
            min.printHeap();
            System.out.println(min.extract_MinElement());
            testCases--;
        }
    }


    /***
     * -----------------------------------------------------------
     *Insert Method Of The MinHeapification Class
     * -----------------------------------------------------------
     */
    void insert(int data) {
        heap[++size] = data;
        int index = size;
        while (index > 1 && heap[index / 2] > heap[index]) {
            swap(index, index / 2);
            index = index / 2;
        }
    }


    /***
     * -----------------------------------------------------------
     *Method,To Extract The Min Element Form The Class
     * -----------------------------------------------------------
     */
    public int extract_MinElement() {
        if (size <= 0) {
            return -1;
        }
        int minElement = heap[1];
        heap[1] = heap[size];
        size--;
        minHeap(heap, 1);
        return minElement;
    }


    /***
     * -----------------------------------------------------------
     *Method, to Swap Values
     * -----------------------------------------------------------
     */
    void swap(int largestChild, int i) {
        int temp = heap[largestChild];
        heap[largestChild] = heap[i];
        heap[i] = temp;
    }


    /***
     * -----------------------------------------------------------
     *Method, That Will Check Passed Node Value Address Contains Leave Or Non-Leave
     * -----------------------------------------------------------
     */

    public boolean isLeaf(int i) {
        if (i > size / 2 && i < size) {
            return true;
        } else {
            return false;
        }
    }


    /***
     * -----------------------------------------------------------
     *Method,To Print Heap.
     * -----------------------------------------------------------
     */
    void printHeap() {
        for (int i = 1; i <= size; i++) {
            System.out.print(heap[i] + " ");
        }
    }


    /***
     * -----------------------------------------------------------
     *Method,To Build Heap That Will handle, Arranging The Nodes from The last Non-Leave Node.
     * -----------------------------------------------------------
     */
    public void buildHep() {
        int lastNonLeaf = (int) Math.floor(size / 2);
        for (int i = lastNonLeaf; i >= 1; i--) {
            minHeap(heap, i);
        }
    }


    /***
     * -----------------------------------------------------------
     *Method, that will Arrange the Nodes in the Min Heap Format
     * -----------------------------------------------------------
     */
    public void minHeap(int[] heap, int i) {
        if (isLeaf(i)) {
            return;
        }
        int leftChild = 2 * i;
        int rightChild = 2 * i + 1;
        if (rightChild <= size) {
            if (heap[leftChild] >= heap[i] && heap[rightChild] >= heap[i]) {
                return;
            }
        } else {
            if (heap[leftChild] >= heap[i]) {
                return;
            }
        }
        int smallest;
        if (leftChild <= size && heap[leftChild] < heap[i]) {
            smallest = i;
        } else {
            smallest = leftChild;
        }
        if (rightChild <= size && heap[rightChild] < heap[smallest]) {
            smallest = smallest;
        }
        if (i != smallest) {
            swap(i, smallest);
        }
        minHeap(heap, smallest);
    }

}



