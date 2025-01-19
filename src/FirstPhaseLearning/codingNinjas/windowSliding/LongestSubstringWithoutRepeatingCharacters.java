package FirstPhaseLearning.codingNinjas.windowSliding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-26,Aug,2023
 * in Project: DataStructuresJavaCode
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring(" abc 342 ()&*5 xyz"));
//        System.out.println(lengthOfLongestSubstring("abcabcbbb 697@@@9abc "));
    }

    public static int lengthOfLongestSubstring2(String s) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            String str= String.valueOf(s.charAt(i));
            if(!str.equals(" ") ) {
                set.add(str);
            }
        }

        set.stream().forEach(System.out::println);
        return set.size();
    }

    public static int lengthOfLongestSubstring(String s) {
        int[] count=new int[256];
        Arrays.fill(count,0);
        int i=0;
        int j=0;
        int ans=0;
        while(j<s.length())
        {
            count[s.charAt(j)]++;
            while(count[s.charAt(j)]>1)
            {
                count[s.charAt(i)]--;
                i++;
            }
            ans=Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }

    public static int ninjaAndTriangle(int n) {
        // Sridharacharya Formula x = (-b ± √(b2 - 4ac)) / 2a;

        int d = 1 + 8 * n;

        int x = (int) ((Math.sqrt(d)-1)/2);


        return x;
    }


}
