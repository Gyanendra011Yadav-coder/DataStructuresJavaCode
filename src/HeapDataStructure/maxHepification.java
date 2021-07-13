package HeapDataStructure;

import java.util.Scanner;

public class maxHepification {
    int size;
    int heap_size;
    int []heap;
    maxHepification(int heap_size){
        this.heap_size=heap_size;
        this.size=0;
        heap=new int[heap_size+1]; //doing+1:-because the heap starts from 1
        heap[0]=Integer.MAX_VALUE; //because we don't want to use index 0
    }
    /*METHOD TO INSERT IN THE HEAP*/
    void insert(int element){
        heap[heap_size++]=element;
    }

    /*METHOD TO CHECK IF THE NODE IS LEAF OR NON-LEAF*/
    public boolean isLeaf(int position){
        if(position>(size/2)){
            return true;
        }else
            return false;
    }
}
