package setAndMapQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourSumLeetcodeQuestionEighteen {

    private static List<List<Integer>> fourSum(int[] num, int target) {
        List<List<Integer>> resultList = new ArrayList<>();
        if (num.length < 4) {
            return resultList;
        }
        Arrays.sort(num);
        for (int i = 0; i < num.length; i++) {
            if (i != 0 && num[i] == num[i - 1]) {
                continue;
            }
            int val1 = num[i];
            List<List<Integer>> subResult = threeSum(num, target - val1, i);
            for (List<Integer> list : subResult) {
                list.add(val1);
                resultList.add(list);
            }
        }
        return resultList;
    }

    private static List<List<Integer>> threeSum(int[] num, int target, int startingIndex) {
        List<List<Integer>> resultList= new ArrayList<>();
        if(num.length<3){
            return resultList;
        }
        for(int i=0; i<=num.length-3;i++){
            List<List<Integer>> subResult= new ArrayList<>();

        }
    }

    public static void main(String[] args) {

    }
}
