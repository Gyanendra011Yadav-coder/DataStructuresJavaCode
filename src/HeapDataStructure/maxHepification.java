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
    /*METHOD WILL SWAP THE VALUES*/
    public void swapValue(int a, int b){
        int temp=a;
        a=b;
        b=temp;
    }
/*THIS METHOD WILL BUILD THE HEAP, UNTILL THE HEAP IS NOT GOING TO BE MAX HEAP*/
    void buildHeap(){
        int lastNonLeaf=(int)Math.floor(size/2.0); // floor is double so we are typecasting it to int and using 2.0
        for (int i = lastNonLeaf; i>0 ; i--) {
            maxheap(heap,i);
        }
    }
    /*THIS IS THE MAIN METHOD THAT WILL ARRANGE THE NODE IN THE FORM OF MAX HEAP*/
    public void  maxheap(int []heap, int i){

    }

}
