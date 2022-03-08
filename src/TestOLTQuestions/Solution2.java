package TestOLTQuestions;

import java.util.HashMap;

public class Solution2 {
    public static int[][] neighbouringElements(int num[][]) {
        int [][]result= new int[num.length][num[0].length];
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[0].length;j++) {
                if (i == j) {
                    result[i][j] = num[i][j] + num[j][i];
                } else {
                    result[i][j] = num[i][j] + num[i][j];
                }
            }
        }
        /**
        result[0][0]=num[0][1]+num[1][0];
        result[0][1]=num[0][0]+num[1][1];
        result[1][0]=num[1][1]+num[0][0];
        result[1][1]=num[0][1]+num[1][0];
         */

        return result;
    }

    public static void main(String[] args) {
        HashMap <Integer,Integer> map= new HashMap<>();

    }
}
