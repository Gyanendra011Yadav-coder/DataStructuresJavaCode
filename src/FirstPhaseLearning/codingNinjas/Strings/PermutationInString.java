package FirstPhaseLearning.codingNinjas.Strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-07,Aug,2023
 * in Project: DataStructuresJavaCode
 */
public class PermutationInString {
    private static List<String> result = new ArrayList<>();
    public static void main(String [] args) throws Exception {
        System.out.println(permutationExist("abcd","aoba", 2,4));
    }
    public static String permutationExist(String str1, String str2, int n, int m){
        List<String> permutation = new ArrayList<String>();
        ArrayList<String> subString=new ArrayList<>();

        permutation=findPermutations(str1);
        subString=findSubString(str2);

        for (int i = 0; i < permutation.size(); i++) {
            if(subString.contains(permutation.get(i))){
                return permutation.get(i);
            }
        }
        return "";
    }

    private static ArrayList<String> findSubString(String str2) {
        ArrayList<String> subString=new ArrayList<>();
        String val="";
        for (int i = 0; i < str2.length(); i++) {
            subString.add(String.valueOf(str2.charAt(i)));
            subString.add(String.valueOf(str2.charAt(i+1)));
            for (int j = i+1; j < str2.length(); j++) {
                
            }
        }
        return subString;
    }

    public static List<String> findPermutations(String input) {
        List<String> permutations = new ArrayList<>();
        findPermutationsHelper("", input, permutations);
        return permutations;
    }

    private static void findPermutationsHelper(String prefix, String remaining, List<String> permutations) {
        int n = remaining.length();
        if (n == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                findPermutationsHelper(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1), permutations);
            }
        }
    }


}
