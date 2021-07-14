package HeapDataStructure;

import java.util.Scanner;
/*
[1,17,10,3,8,15,9,2,13,6]
          1
         / \
       17    10
      /  \  /  \
    3     8 15  9
   / \   /
  2  13 6
 */

public class maxHepification {
    int size;
    int heap_size;
    int[] heap;

    maxHepification(int heap_size) {
        this.heap_size = heap_size;
        this.size = 0;
        heap = new int[heap_size + 1]; //doing+1:-because the heap starts from 1
        heap[0] = Integer.MAX_VALUE; //because we don't want to use index 0
    }

    /*MAIN, CLASSS TO BUILD THE HEAP*/
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int size = scannerObject.nextInt();
        maxHepification heapObj = new maxHepification(size);
        for (int i = 0; i <= size + 1; i++) {
            int element = scannerObject.nextInt();
            heapObj.insert(element);
        }
        heapObj.printHeap();
        heapObj.buildHeap();
        heapObj.printHeap();


    }

    /*METHOD TO INSERT IN THE HEAP*/
    void insert(int element) {
        heap[size++] = element;
    }

    /*METHOD TO CHECK IF THE NODE IS LEAF OR NON-LEAF*/
    public boolean isLeaf(int position) {
        return position > (size / 2);
    }

    /*METHOD WILL SWAP THE VALUES*/
    public void swapValue(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    /*THIS METHOD WILL BUILD THE HEAP, UNTILL THE HEAP IS NOT GOING TO BE MAX HEAP*/
    void buildHeap() {
        int lastNonLeaf = (int) Math.floor(size / 2.0); // floor is double so we are typecasting it to int and using 2.0
        for (int i = lastNonLeaf; i > 0; i--) {
            maxheap(heap, i);
        }
    }

    /*THIS IS THE MAIN METHOD THAT WILL ARRANGE THE NODE IN THE FORM OF MAX HEAP*/
    public void maxheap(int[] heap, int i) {
        if (isLeaf(i))
            return;
        int leftChild = i * 2;
        int rightChild = i * 2 + 1;
        if (rightChild <= size) {  //[1,17,10,3,8,15,9,2,13,6]
            if (rightChild <= heap[i] && leftChild <= heap[i]) {
                return;
            }
        } else {
            if (heap[i] >= leftChild) {
                return;
            }
        }
        int largest;
        if (leftChild <= size && heap[leftChild] > heap[i]) {
            largest = leftChild;
        } else {
            largest = i;
            if (rightChild <= size && heap[rightChild] > heap[i]) {
                largest = rightChild;
            }
        }
        if (largest != i) {
            swapValue(largest, i);
        }
        maxheap(heap, largest);
    }

    /*THE METHOD TO PRINT THE HEAP */
    void printHeap() {
        for (int i = 1; i <= size; i++) {
            System.out.println(heap[i]);
        }
    }
}
