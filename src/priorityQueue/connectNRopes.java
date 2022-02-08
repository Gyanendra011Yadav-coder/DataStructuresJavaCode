package priorityQueue;

import java.util.PriorityQueue;

/**
 * @author Gyanendra Yadav
 * @created 08/02/2022- 6:08 PM
 * @project DataStructuresJavaCode
 */
public class connectNRopes {
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n)
    {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        long cost=0;
        // your code here
        for(int i=0; i<arr.length ; i++){
            pq.add(arr[i]);
        }
        while(pq.size()!=1){
            long firstNumber= pq.poll();
            long secondNumber=pq.poll();
            long sum=firstNumber+secondNumber;
            cost+=sum;
            pq.add(sum);
        }
        return cost;
    }
}
