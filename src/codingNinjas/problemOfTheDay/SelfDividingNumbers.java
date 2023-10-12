package codingNinjas.problemOfTheDay;

import java.util.ArrayList;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-10-07,Oct,2023
 * in Project: DataStructuresJavaCode
 */
public class SelfDividingNumbers {
    public static void main(String[] args) {
        findAllSelfDividingNumbers(1, 22).forEach(System.out::println);
    }

    public static ArrayList<Integer> findAllSelfDividingNumbers(int lower, int upper) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int val = lower; val <= upper; val++) { // Use <= to include the upper limit
            String valStr = String.valueOf(val);
            boolean isSelfDividing = true;

            for (int i = 0; i < valStr.length(); i++) {
                int digit = Character.getNumericValue(valStr.charAt(i));

                if (digit == 0 || val % digit != 0) {
                    isSelfDividing = false;
                    break; // Break if not self-dividing
                }
            }

            if (isSelfDividing) {
                list.add(val);
            }
        }

        return list;
    }
}
