package FirstPhaseLearning.codingNinjas.Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-07-28,Jul,2023
 * in Project: DataStructuresJavaCode
 */
public class MatchSpecificPattern {
    public static boolean check(String str,String pattern){

        HashMap<Character,Character> map = new HashMap<>();
        for(int i =0; i<pattern.length(); i++){
            if(map.containsKey(str.charAt(i))){
                if(map.get(str.charAt(i)) !=pattern.charAt(i)){
                    return false;
                }
            }else{
                if(map.containsValue(pattern.charAt(i))){
                    return false;
                }
                map.put(str.charAt(i),pattern.charAt(i));
            }
        }
        return true;
    }
    public static List<String> matchSpecificPattern(List<String> words, int n, String pattern) {
        // Write you code here.
        ArrayList<String> list = new ArrayList<String>();
        for(int i =0; i<words.size(); i++){
            if(words.get(i).length() != pattern.length()){
                continue;
            }
            if(check(words.get(i),pattern)){
                list.add(words.get(i));
            }
        }
        return list;
    }
}
