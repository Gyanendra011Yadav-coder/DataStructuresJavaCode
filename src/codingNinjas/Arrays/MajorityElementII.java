package codingNinjas.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-07-25,Jul,2023
 * in Project: DataStructuresJavaCode
 */
public class MajorityElementII {

    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(3);

        ArrayList<Integer> result = majorityElementII(list);


    }
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();

        int maxFreq= Math.floorDiv(arr.size(),3);
        Map<Integer,Integer> freqMap = new HashMap<Integer,Integer>();
        for (int i = 0; i < arr.size(); i++) {
            if(freqMap.containsKey(arr.get(i))) {
                int key = arr.get(i);
                int value = (freqMap.get(arr.get(i)))+1;
                freqMap.put(key, value);
            }else{
                freqMap.put(arr.get(i), 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry:freqMap.entrySet()) {
            if(entry.getValue()>maxFreq){
                result.add(entry.getKey());
            }
        }

        return result;
    }

}
