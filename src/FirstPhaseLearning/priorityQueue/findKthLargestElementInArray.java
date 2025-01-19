package FirstPhaseLearning.priorityQueue;

import java.util.PriorityQueue;

/**
 * @author lenovo
 * @created 08/02/2022- 4:48 PM
 * @project DataStructuresJavaCode
 */
public class findKthLargestElementInArray {
    public int findKthLargest(int[] nums, int k) {
        int result=-1;
        PriorityQueue <Integer>pq= new PriorityQueue<>();
        for(int element: nums){
            pq.add(-1*element);
        }
        int count=0;
        while(count!=k){
            result=-1*pq.peek();
            pq.poll();
            count++;
        }
        return result;
    }
    public static void main(String[] args) {

    }
}
