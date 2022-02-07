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

    }

    private static void findKDistinctElement(int []array, int k){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<k ;i++){
            //this is checking if the defined number is present then it will increase it's count else we will add it and increase it's count
            map.put(array[i],map.getOrDefault(array[i],0)+1);
        }
    }
}
