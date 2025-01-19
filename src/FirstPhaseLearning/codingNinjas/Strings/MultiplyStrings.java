package FirstPhaseLearning.codingNinjas.Strings;

import java.math.BigInteger;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-07-29,Jul,2023
 * in Project: DataStructuresJavaCode
 */
public class MultiplyStrings {

    public static void main(String[] args) {

    }

    public static String multiplyStrings(String a, String b) {
        // Write your code here!

        BigInteger num=new BigInteger(a);
        BigInteger num2=new BigInteger(b);


        return String.valueOf(num.multiply(num2));
    }
}
