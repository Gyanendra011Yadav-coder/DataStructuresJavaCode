package FirstPhaseLearning.codingNinjas.problemOfTheDay;

import java.util.*;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-21,Aug,2023
 * in Project: DataStructuresJavaCode
 */
public class StringBreaker {
    public static void main(String[] args) {
//        String[] dictionary = {"BROKE", "ME", "BREAKM" };
        String[] dictionary = {"COD","CODE","ESTU","DIO","STUDIO" };
        System.out.println(stringBreaker("CODESTUDIO", 5, dictionary));
    }

    public static int stringBreakerBrutt(String s, int n, String[] dictionary) {
        int counter = 0;
        List<String> list = new ArrayList<>();
        for (String str : dictionary) {
            list.add(str);
        }
        //base case if s present in dictionary, then return 0
        if (list.contains(s)) return 0;

        for (String str : list) {
            //If any index is present in String then, any portion above then
            int index = s.indexOf(str);
            if (index > -1) {
                if (index < s.length()) {
                    String subString = s.substring(index + str.length());
                    if (list.contains(subString)) {
//                        counter++;
                        break;
                    }
                }
            }
        }
        return (counter == 0) ? -1 : counter;

    }

    public static int stringBreaker(String s, int n, String[] dictionary) {
        // Create a set to store the words in the dictionary for quick lookup
        Set<String> dictSet = new HashSet<>(Arrays.asList(dictionary));

        int len = s.length();
        // dp[i] represents the minimum number of breaks needed for the substring s[0...i-1]
        int[] dp = new int[len + 1];

        // Initialize the dp array with a value greater than the length of s
        Arrays.fill(dp, len + 1);
        dp[0] = 0; // Base case

        for (int i = 1; i <= len; i++) {
            // Try all possible prefixes of s[0...i-1]
            for (int j = i - 1; j >= 0; j--) {
                if (dictSet.contains(s.substring(j, i))) {
                    // If the current substring is in the dictionary, update dp[i]
                    dp[i] = Math.min(dp[i], dp[j] + 1);
                }
            }
        }

        return dp[len] <= len ? dp[len] - 1 : -1; // Return -1 if not possible, otherwise dp[len] - 1
    }
}
