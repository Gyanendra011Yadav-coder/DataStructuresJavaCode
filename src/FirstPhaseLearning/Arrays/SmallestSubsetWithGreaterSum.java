package FirstPhaseLearning.Arrays;

import java.util.Arrays;

/**
 * Created By: Gyanendra-Yadav on 2022-09-15,Sep,2022
 */
public class SmallestSubsetWithGreaterSum {
    int minSubset(int[] Arr,int N) {
        Arrays.sort(Arr);
       int sum = 0;
       int count=1;
       int add = 0;
        for (int i = 0; i <N ; i++) {
            sum+=Arr[i];
        }
        if(sum>Arr[N-1]){
            return 1;
        }
        for(int i=N-1;i>=0;i--)
        {
            add=add+Arr[i];
            if(add>sum-add)
            {
                return count;
            }
            count++;
        }
        return count;
    }
}
