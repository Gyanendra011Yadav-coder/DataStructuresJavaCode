package DynamicProgramming;
import java.util.Scanner;
public class LongestCommonSubsequne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        int n= str1.length();
        int m=str2.length();
        System.out.println(LongestCommonSubsequne(str1,str2,n,m));
    }
    public static int LongestCommonSubsequne(String str1, String str2, int len1,int len2){
        //Base Case Can be That if we See Any length Become 0 then we will return
        if(len1==0 || len2==0 ){
            return 0;
        }
        if(str1.charAt(len1-1)==str2.charAt(len2-1)){
            return 1+LongestCommonSubsequne(str1,str2,len1-1,len2-1);
        }
        return Math.max(LongestCommonSubsequne(str1, str2, len1, len2-1),LongestCommonSubsequne(str1, str2, len1-1, len2));
    }
}
