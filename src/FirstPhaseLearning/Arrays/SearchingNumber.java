package FirstPhaseLearning.Arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Created By:  Gyanendra_Yadav
 * on 2022-11-29,Nov,2022
 * in Project: DataStructuresJavaCode
 */

public class SearchingNumber {

    public static void main(String[]args){
        int N = 5, K = 98;
        int Arr[] = {9, 7, 2, 16, 4};
        int Arr2[]={1 ,22 ,57 ,47 ,34 ,18,66};
        System.out.println(search(Arr2,Arr2.length,K));
//        System.out.println(search(Arr, Arr.length,K));
    }


    public static int search(int arr[], int n, int k) {
        // code here
        int result=-1;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//        for (int i = 0; i <n ; i++) {
//            if(!map.containsValue(arr[i])){
//                map.put(arr[i],i);
//            }else {
//                continue;
//            }
//        }
//        if(map.containsKey(k)){
//            result=map.get(k);
//        }

        for (int i = 0; i <n ; i++) {
            if(arr[i]==k){
                result=i;
                break;
            }
        }
        return result+1;
    }
}
