package DynamicProgramming;

import java.util.Arrays;

public class LongestCommonSubsequne {
    public static void main(String[] args) {
        String s1 = "pmjghexybyrgzczy";
        String s2 = "hafcdqbgncrcbihkd";
        //initilazing dp to reduce the execution time of our program
        int [][]dp= new int [s1.length()][s2.length()];
        //filling the dp with -1, because there is no variables
        for(int []array:dp){
            Arrays.fill(array,-1);
        }
        System.out.println(lcs(s1,s2,0,0,dp));
    }

    public static int lcs(String str1, String str2, int str1Pointer , int str2Pointer, int [][]dp ){
        if(str1Pointer==str1.length()| str2Pointer==str2.length()){
            return 0;
        }
        if(dp[str1Pointer][str2Pointer]!=-1){
            return dp[str1Pointer][str2Pointer];
        }
        int answer=0;
        if(str1.charAt(str1Pointer)==str2.charAt(str2Pointer)){
            answer=1+lcs(str1,str2,str1Pointer+1,str2Pointer+1,dp);
        }else{
            int ans2=lcs(str1,str2, str1Pointer+1, str2Pointer,dp);
            int ans3=lcs(str1,str2,str1Pointer, str2Pointer+1,dp);
            answer=Math.max(ans2,ans3);
        }
        return dp[str1Pointer][str2Pointer]=answer;

    }

    /*
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

     */

    /***
     * This, is the  Dyanmic PRogramming Code to Find Out LCS of two Strings
     */

    /**
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        int n= str1.length();
        int m=str2.length();
        int [][]dp= new int[n+1][m+1];
       for(int[] row: dp){
           Arrays.fill(row, -1);
       }
        System.out.println(LongestCommonSubsequne(str1,str2,n,m,dp));
    }
    public static int LongestCommonSubsequne(String str1, String str2, int len1,int len2, int [][]dp){
        //Base Case Can be That if we See Any length Become 0 then we will return
        if(len1==0 || len2==0 ){
            return 0;
        }
        if (dp[len1][len2]!=-1){
           return dp[len1][len2];
        }
        if(str1.charAt(len1-1)==str2.charAt(len2-1)){
            return 1+LongestCommonSubsequne(str1,str2,len1-1,len2-1,dp);
        }
        return dp[len1][len2]=Math.max(LongestCommonSubsequne(str1, str2, len1, len2-1,dp),LongestCommonSubsequne(str1, str2, len1-1, len2,dp));
    }
     **/
}
