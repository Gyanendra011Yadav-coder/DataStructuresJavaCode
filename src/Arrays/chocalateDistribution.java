package Arrays;

/**
 * @author Gyanendra Yadav
 * @created 27/01/2022- 7:01 AM
 * @project DataStructuresJavaCode
 */
public class chocalateDistribution {
    public static void main(String[] args) {

    }

    private static int countMinChocalteLeft(int []chocalte,int numberOfChocaltesPack, int numberOfBoys){
        if(numberOfBoys==0 || numberOfChocaltesPack==0 ){
            return 0;
        }
        if(numberOfBoys==numberOfChocaltesPack){
            return chocalte[numberOfChocaltesPack-1]-chocalte[0];
        }
        if(numberOfBoys>numberOfChocaltesPack){
            return -1;
        }
        int min_Diff=Integer.MAX_VALUE;
        for (int i = 0; i <numberOfChocaltesPack ; i++) {
            min_Diff=Math.min((chocalte(i+numberOfBoys-1)-chocalte(i)),min_Diff);
        }
        return min_Diff;
    }
}
