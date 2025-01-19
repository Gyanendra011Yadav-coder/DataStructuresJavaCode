package FirstPhaseLearning.Arrays;

import java.util.ArrayList;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-07-19,Jul,2023
 * in Project: DataStructuresJavaCode
 */
public class MagicalProblem {
    public static void main(String[] args) {

    }

    public static int magicIndex(ArrayList<Integer> a, int n) {
        // Write your code here

        for (int i = 0; i < a.size(); i++) {
            if(a.get(i)==i){
                return i;
            }else{
                continue;
            }
        }
        return -1;
    }
}
