package HeapDataStructure;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sizeOfHeap=sc.nextInt();
        MaxHepification max = new MaxHepification(sizeOfHeap);
        for (int i=1; i<=sizeOfHeap; i++) {
            max.insert(sc.nextInt());
        }
        System.out.println("HEAP BEFORE BUILD:-");
        max.printHeap();
        max.build_Heap();
        System.out.println("THE HEAP AFTER BUILD");
        System.out.println("\n");
        max.build_Heap();

    }
}
