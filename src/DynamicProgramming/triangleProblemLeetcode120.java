package DynamicProgramming;

import java.util.List;

/**
 * @author Gyanendra Yadav
 * @created 20/01/2022- 7:52 PM
 * @project DataStructuresJavaCode
 */
public class triangleProblemLeetcode120 {
    public static void main(String[] args) {
      /*
        List<List<Integer>> triangle= {{2},{3,4},{6,5,7}};
        int [][]dp= new int[triangle.size()][];
        System.out.println(minimumTotalTriangle(triangle,0,0));

       */
    }
    public static int minimumTotalTriangle(List<List<Integer>> triangle, int currentRow, int currentColumn){
        if(currentRow==triangle.size()-1){
            return triangle.get(currentRow).get(currentColumn);
        }
        int ans1=minimumTotalTriangle(triangle,currentRow+1,currentColumn);
        int ans2=minimumTotalTriangle(triangle,currentRow+1,currentColumn+1);

        return Math.min(ans1,ans2)+triangle.get(currentRow).get(currentColumn);
    }

}
