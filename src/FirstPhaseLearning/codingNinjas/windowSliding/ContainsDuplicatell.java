package FirstPhaseLearning.codingNinjas.windowSliding;

import java.util.HashMap;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-24,Aug,2023
 * in Project: DataStructuresJavaCode
 */
public class ContainsDuplicatell {
    public static void main(String[] args) {
//        int [] arr={3 ,4 ,9 ,4 ,2};
//        int [] arr={1 ,2, 3, 4, 5, 1};
        int [] arr={3 ,2, 0, -4, 7 ,-9, -8, 10, 5, -1};
        System.out.println(checkDuplicate(arr, arr.length, 4));
    }

    public static boolean checkDuplicate(int[] arr, int n, int k) {
        HashMap<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (m.get(arr[i]) == null)
                m.put(arr[i], i + 1);
            else if (m.get(arr[i]) > 0 && Math.abs(m.get(arr[i]) - (i + 1)) <= k)
                return true;
            else
                m.put(arr[i], i + 1);
        }
        return false;
    }
    /*public static boolean checkDuplicate(int[] arr, int n, int k) {
        //Base case
//        if(n<k) return false;

        Map<Integer, Integer> mapCounter;
        for (int i = 0; i < n-1; i++) {
            mapCounter=new FirstPhaseLearning.HashMap<>();
            mapCounter.put(arr[i], mapCounter.getOrDefault(arr[i],0)+1);
            int inIndex=i+1;
            while (inIndex<n && inIndex<=(i+k)){
                if(mapCounter.containsKey(arr[inIndex])){
                     if(mapCounter.get(arr[i])>=1){
                         return true;
                     }
                }
                mapCounter.put(arr[inIndex], mapCounter.getOrDefault(arr[i],0)+1);

                inIndex++;
            }
        }
        return false;
    }*/
}
