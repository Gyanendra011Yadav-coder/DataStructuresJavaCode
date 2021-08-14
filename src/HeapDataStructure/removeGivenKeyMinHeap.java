package HeapDataStructure;

import java.util.Scanner;

public class removeGivenKeyMinHeap {
    static class Main {
        int[] heap;
        int maxHeapSize;
        int size;
        //constructor of the class
        Main(int size) {
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
                int keyToDelete = sc.nextInt();
                Main min = new Main(sizeOfHeap);
                for (int i = 1; i <= sizeOfHeap; i++) {
                    min.insert(sc.nextInt());
                }
                min.removeKey(keyToDelete);
                min.printHeap();
                System.out.println();
                testCases--;
            }
        }


        /***
         * -----------------------------------------------------------
         *Insert Method Of The MinHeapification Class
         * -----------------------------------------------------------
         */
        public void insert(int data) {
            heap[++size] = data;
            int index = size;
            while (index > 1 && heap[index / 2] > heap[index]) {
                swap(index, index / 2);
                index = index / 2;
            }
        }

        /***
         * -------------------------------------------------------------
         * THIS, IS THE METHOD WE WILL BE DOING THE REMOVING OF THE KEY
         * -------------------------------------------------------------
         */
        public void removeKey(int key) {
            if (size < 1) {
                return;
            }
            int index=1;
            while(index!=key){
                index++;
            }
            heap[index]=-1;
            buildHep();
            heap[1]=heap[size];
            size--;
            buildHep();


        }


        /***
         * -----------------------------------------------------------
         *Method, to Swap Values
         * -----------------------------------------------------------
         */
        public void swap(int largestChild, int i) {
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
            return i >(size / 2) && i <= size;
        }


        /***
         * -----------------------------------------------------------
         *Method,To Print Heap.
         * -----------------------------------------------------------
         */
        public void printHeap() {
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
                smallest =leftChild;
            } else {
                smallest = i;
            }
            if (rightChild <= size && heap[rightChild] < heap[smallest]) {
                smallest = rightChild;
            }
            if (i != smallest) {
                swap(i, smallest);
            }
            minHeap(heap, smallest);
        }
    }

}



