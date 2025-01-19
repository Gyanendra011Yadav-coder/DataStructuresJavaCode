package FirstPhaseLearning.codingNinjas.Contests.WeeklyContest83;

import java.util.HashMap;
import java.util.Map;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-07-22,Jul,2023
 * in Project: DataStructuresJavaCode
 */
public class CountElements {
    public static void main(String[] args) {

    }

    static int countElements(int x, int []a) {
        // Write your code here.
        int ttlCount=0;
        Map<Integer, Integer> map=new HashMap<>();
        for (int i = 0; i <a.length ; i++) {
            if(map.containsKey(a[i])){
                if(map.get(a[i])<x){
                    map.put(a[i], map.get(a[i]) +1);
                    ttlCount++;
                }else{
                    break;
                }
            }else{
                ttlCount++;
                map.put(a[i],1);
            }
        }
        return ttlCount;
    }
}
