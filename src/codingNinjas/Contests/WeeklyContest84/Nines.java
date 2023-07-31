package codingNinjas.Contests.WeeklyContest84;

import java.util.HashMap;
import java.util.Map;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-07-30,Jul,2023
 * in Project: DataStructuresJavaCode
 */
public class Nines {

    public static void main(String[] args) {

    }

    public static int nines(int n, int[] a, int k) {
//        Map<Integer, Integer> freqMap=new HashMap<>();

        int numK=0;
        for (int i = 0; i < n ; i++) {
            if(a[i]==9){
                numK++;
            }
        }

        return (numK>0 && numK>=k)?1:0;
    }
}
