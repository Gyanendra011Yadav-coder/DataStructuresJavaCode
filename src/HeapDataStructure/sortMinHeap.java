package HeapDataStructure;

import java.util.Scanner;

public class sortMinHeap {
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
                Main min = new Main(sizeOfHeap);
                for (int i = 1; i <= sizeOfHeap; i++) {
                    min.insert(sc.nextInt());
                }
                min.printHeap();
                System.out.println();
                min.sortHeapDes();
                min.printHeap();
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

        /* -----------------------------------------------------------
         *Method,To SORT THE HEAP IN DESCENING ORDER
         * -----------------------------------------------------------
         */

        public void sortHeapDes() {
            for (int i = size; i >= 1; i--) {
                for (int j = 1; j < i; j++) {
                    if (heap[i] > heap[j]) {
                        swap(i, j);
                    }
                }
            }
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
         *Method,To Print Heap.
         * -----------------------------------------------------------
         */
        public void printHeap() {
            for (int i = 1; i <= size; i++) {
                System.out.print(heap[i] + " ");
            }
        }

    }


}
