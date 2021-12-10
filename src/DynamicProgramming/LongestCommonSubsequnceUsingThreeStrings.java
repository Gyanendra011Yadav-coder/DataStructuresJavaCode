package DynamicProgramming;

import java.util.Scanner;

public class LongestCommonSubsequnceUsingThreeStrings {
    public static void main(String[] args) {
        Scanner scannerObject =new Scanner(System.in);
        String str1=scannerObject.next();
        String str2=scannerObject.next();
        String str3=scannerObject.next();
        System.out.println(LCSUsingThreeString(str1,str2,str3,str1.length()-1,str2.length()-1,str3.length()-1));
    }

    public static int LCSUsingThreeString(String str1,String str2, String str3,int len1, int len2, int len3){
          int [][][]dp=new int[len1+1][len2+1][len3+1];
        for (int i = 0; i <=len1 ; i++) {
            for (int j=0 ;j<=len2;j++){
                for(int k=0;k<=len3;k++){
                    if(i==0 || j==0 || k==0){
                        dp[i][j][k]=0;
                    }else if(str1.charAt(i-1)==str2.charAt(j-1) && str2.charAt(j-1)==str3.charAt(k-1)){
                        dp[i][j][k]=dp[i-1][j-1][k-1]+1;
                    }else{
                        dp[i][j][k]=Math.max(dp[i-1][j][k],Math.max(dp[i][j-1][k],dp[i][j][k-1]));
                    }
                }
            }
        }
        return dp[len1][len2][len3];
    }
}
