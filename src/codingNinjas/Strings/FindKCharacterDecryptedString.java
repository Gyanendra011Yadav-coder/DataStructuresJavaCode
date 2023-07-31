package codingNinjas.Strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-07-31,Jul,2023
 * in Project: DataStructuresJavaCode
 */
public class FindKCharacterDecryptedString {

    public static void main(String[] args) {

    }

    public static char kThCharaterOfDecryptedString(String s, Long k)
    {
        int findCharAt= Math.toIntExact((k));
        String result=decodeString(s);
        return result.charAt(findCharAt);
    }

    public static String decodeString(String str){
        String strResult="";
        Character repeatChar;
        Map<Character, Integer> map=new HashMap<>();



        for (int i = 0; i < str.length(); i++) {
            if(!Character.isDigit(str.charAt(i))){
                repeatChar=str.charAt(i);
            }
        }
        return strResult;
    }

    private static boolean isNumber(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
