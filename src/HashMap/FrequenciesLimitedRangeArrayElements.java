package HashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created By:  Gyanendra_Yadav
 * on 2022-11-11,Nov,2022
 * in Project: DataStructuresJavaCode
 */
public class FrequenciesLimitedRangeArrayElements {
    //Method that will count Frequnency of elements less than P in the array
    public static void frequencyCount(int arr[], int N, int P) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        int []arrayResult=new int[P+2];
        for (int i = 1; i <=P ; i++) {
            for (int j = 0; j <N ; j++) {
                if(arr[j]==i){
                    if(!map.containsKey(i)){
                        map.put(i,1);
                    }else{
                        map.put(i,map.get(i)+1);
                    }
                }
            }
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            arrayResult[entry.getKey()]=entry.getValue();
//            System.out.print(entry.getValue()+" ");
        }
        for (int index=1;index<arrayResult.length;index++) {
            System.out.print(arrayResult[index]+" ");
        }
    }
    //Function to count the frequency of all elements from 1 to N in the array.
//    public static void frequencyCountOfElmentsInArray(int arr[], int N, int P) {
//        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//        int []arrayOfFreq=new int[P];
//        for (int p = 1; p <=P ; p++) {
//            for (int i = 0; i < N; i++) {
//            if (!map.containsKey(arr[i])) {
//                map.put(arr[i], 1);
//            } else {
//                map.put(arr[i], map.get(arr[i]) + 1);
//            }
//            }
//        }
//        for (Map.Entry<Integer, Integer> value : map.entrySet()) {
//            System.out.print(value.getValue() + " ");
//        }
//
//    }
//Main_Class
    public static void main(String[] args) {
        int[] arr =  {2, 3, 2, 3, 5};
        int n = arr.length;
        // Function call
//        frequencyCountOfElmentsInArray(arr,arr.length,5);
        frequencyCount(arr,arr.length,5);
    }
}
