package SevenDaysStrategySheetSolution;

/**
 * @author Gyanendra Yadav
 * @created 06/01/2022- 2:16 PM
 * @project DataStructuresJavaCode
 */
public class questionNumberOneKadanesAlgorithm {
    public static void main(String[] args) {
        int []array={-2,-3,4,-1,-2,1,5,-3};
        System.out.println(kadanesAlgorithm(array));
    }

    private static int kadanesAlgorithm(int[] array) {
        int overallMax=0;
        int currentMax=0;
        for (int i = 0; i < array.length ; i++) {
            if(currentMax>=0){
                currentMax=currentMax+array[i];
            }else{
                currentMax=array[i];
            }
            if(currentMax>overallMax){
                overallMax=currentMax;
            }
        }
        return overallMax;
    }

}
