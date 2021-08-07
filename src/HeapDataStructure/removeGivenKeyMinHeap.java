package HeapDataStructure;

import java.util.Scanner;

public class removeGivenKeyMinHeap {
    int []heap;
    int size;
    int maxSize;
    removeGivenKeyMinHeap(int size){
        heap=new int[size];
        size=0;
        maxSize = size;
        heap[0]=Integer.MAX_VALUE;

    }
    public void insertKey(int data){
        heap[++size] = data;
        int index=size;
        while (index>1 && heap[index/2]>heap[index]) {
            swap(index/2, index);
            index=index/2;
        }
    }

    private void swap(int i, int index) {
        int temp=i;
        i=index;
        index=temp;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        removeGivenKeyMinHeap rem = new removeGivenKeyMinHeap(size);
        for (int i =1;i<=size;i++){
            rem.insertKey(sc.nextInt());
        }

    }

}

