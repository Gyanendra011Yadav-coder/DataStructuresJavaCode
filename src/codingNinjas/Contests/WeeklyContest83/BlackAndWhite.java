package codingNinjas.Contests.WeeklyContest83;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-07-22,Jul,2023
 * in Project: DataStructuresJavaCode
 */
public class BlackAndWhite {

    public static void main(String[] args) {
        System.out.println(minOperations(12,11,15));
    }

    public static int minOperations(int x, int a, int b) {
        // Write your code here.
        int result = -1;
        int blackBall=x;
        int whiteBall=0;

        int index = 0;
        while(index< Integer.MAX_VALUE){
            if((blackBall)==(whiteBall)){
                return index;
            }else{
                blackBall+=a;
                whiteBall+=b;
                index++;
            }

            if(index>4){
                return result;
            }
        }
        return index;
    }

}
