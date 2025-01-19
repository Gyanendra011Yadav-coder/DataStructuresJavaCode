package FirstPhaseLearning.Recursion;


/**
 * Created By:  Gyanendra_Yadav
 * on 2023-01-19,Jan,2023
 * in Project: DataStructuresJavaCode
 */
public class CarpetIntoBox {
    public static void main(String[] args) {
        System.out.println(  minMoves(1,100,100,1) );
//        Logger.getLogger(CarpetIntoBox.class.getName()).log(Level.FINE, "CarpetIntoBox for " + minMoves(4,8,3,10));
    }

    //Method to calculate
    int carpetBox(int carpetLength, int carpetBredth, int boxLength, int boxBredth) {
        //code here

        //base case
        if((carpetLength<boxLength && carpetBredth<boxBredth) || (carpetLength<boxBredth && carpetBredth<boxLength)){
            return 0;
        }

        int count=0;
        while((carpetLength<=boxLength) || carpetBredth<=boxBredth) {

        }
        return count;
    }

    static int minMoves(int carpetLength, int carpetBredth, int boxLength, int boxBredth) {
        int count = 0;
        while (carpetLength > boxLength || carpetBredth > boxBredth) {
            if (carpetLength > boxLength) {
                carpetLength = (int) Math.floor(carpetLength / 2.0);
                count++;
            }
            if (carpetBredth > boxBredth) {
                carpetBredth = (int) Math.floor(carpetBredth / 2.0);
                count++;
            }
        }
        return count;
    }
}
