package Hashing.hashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Gyanendra Yadav
 * @created 07/02/2022- 3:34 PM
 * @project DataStructuresJavaCode
 */
public class findDistinctElementFromKSizeWindow {
    public static void main(String[] args) {
        int []array= {1,2,2,1,3,1,1,3};
        int windowSize=4;
         findKDistinctElement(array,windowSize);
    }

    public static void findKDistinctElement(int []array, int k){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<k ;i++){
            //this is checking if the defined number is present then it will increase it's count else we will add it and increase it's count
            map.put(array[i],map.getOrDefault(array[i],0)+1);
        }
        System.out.println(map.size());
        //this loop will be running from the size of the Window untill end of the array
        for (int i = k; i <array.length ; i++) {
            if (array[i - k] == 1) {
                map.remove(array[i-k]);
            }else{
                map.put(array[i - k], map.get(array[i-k])-1);
            }
            map.put(array[i-k],map.getOrDefault(array[i],0)+1);
            System.out.println(map.size());
        }
    }
}

