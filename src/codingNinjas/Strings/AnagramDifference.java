package codingNinjas.Strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-07-27,Jul,2023
 * in Project: DataStructuresJavaCode
 */
public class AnagramDifference {

    public static void main(String[] args) {
        String str1="xiscodingninja";
        String str2="codingninjaisx";

        System.out.println(getMinimumAnagramDifference(str1, str2));
    }
    public static int getMinimumAnagramDifference(String str1, String str2) {
        int minManipulationReq=0;
        Map<Character,Integer> charFreqMap = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            if(charFreqMap.containsKey(str1.charAt(i))){
              charFreqMap.put(str1.charAt(i), charFreqMap.get(str1.charAt(i)) + 1);
            }else{
                charFreqMap.put(str1.charAt(i), 1);
            }
        }

        System.out.println("Putting in map task is done for String1");
        System.out.println(charFreqMap.toString());

        for (int i = 0; i < str2.length(); i++) {
            if(charFreqMap.containsKey(str2.charAt(i)) && charFreqMap.get(str2.charAt(i))>0) {
                charFreqMap.put(str2.charAt(i), charFreqMap.get(str2.charAt(i)) - 1);
            } else {
                minManipulationReq++;
            }
        }

        return minManipulationReq;
    }
}
