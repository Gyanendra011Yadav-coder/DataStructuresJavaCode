package StartRevisingDSA;

import java.util.HashMap;
import java.util.Map;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-06-20,Jun,2023
 * in Project: DataStructuresJavaCode
 *
 * Isomorphic Strings
 * Given two strings s and t, determine if they are isomorphic. Two strings are isomorphic if the characters
 * in s can be replaced to get t.
 * For example,"egg" and "add" are isomorphic, "foo" and "bar" are not.
 *
 */
public class Question3 {
    public static void main(String[] args) {
//        System.out.println(isomorphicString("aitg","dphc"));
        System.out.println(isIsomorphic("pijthbsfy","fvladzpbf"));
    }

    private static boolean isomorphicString(String str1, String str2) {
        boolean result=true;
        Map<Character, Character> map=new HashMap<>();
        if((str1.length())!=str2.length()){
            return false;
        }else{
            for (int i = 0; i <str1.length(); i++) {
                if(!map.containsKey(str1.charAt(i))){
                    map.put(str1.charAt(i),str2.charAt(i));
                }else{
                    Character strCharacterCheck=map.get(str1.charAt(i));
                    if(strCharacterCheck.equals(str2.charAt(i))){
                        result=true;
                    }else{
                        return false;
                    }
                }
            }
        }
        return result;
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s == null || t == null)
            return false;
        if (s.length() != t.length())
            return false;
        if (s.length() == 0 && t.length() == 0)
            return true;
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            Character c = getKey(map, c2);
            if (c != null && c != c1) {  //This is to check if the previously stored value
                return false;
            } else if (map.containsKey(c1)) {
                if (c2 != map.get(c1))
                    return false;
            } else {
                map.put(c1, c2);
            }
        }
        return true;
    }

    // a method for getting key of a target value
    public static Character getKey(HashMap<Character,Character> map, Character target){
        for (Map.Entry<Character,Character> entry : map.entrySet()) {
            if (entry.getValue().equals(target)) {
                return entry.getKey();
            }
        }
        return null;
    }

}
