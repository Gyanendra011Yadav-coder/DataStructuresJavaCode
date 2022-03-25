package Arrays;

import java.util.Arrays;

public class twoCitySchedulingLeetcode1029 {
    public int twoCitySchedCost(int[][] costs) {
        int numberOfPersons=costs.length;
        int prices=0;
        Arrays.sort(costs,(a,b)->{
           return (a[0]-a[1])-(b[0]-b[1]);
        });
        for (int i = 0; i <numberOfPersons/2 ; i++) {
            prices+=costs[i][0];
        }
        for (int j = numberOfPersons/2; j <numberOfPersons; j++) {
            prices+=costs[j][1];
        }
        return prices;
    }
}
