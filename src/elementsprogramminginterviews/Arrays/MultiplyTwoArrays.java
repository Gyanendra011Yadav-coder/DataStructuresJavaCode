package elementsprogramminginterviews.Arrays;

import java.math.BigInteger;
import java.util.Arrays;

// [1,2] & [3,4] return [4,0,8]
public class MultiplyTwoArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 9, 3, 7, 0, 7,7, 2, 1};
        int[] array2 = {-7, 6,1,8,3,8,2,5,7,2,8,7};
        BigInteger [] resultArr = multiplyArray(array1, array2);
        for (BigInteger num : resultArr){
            System.out.print(num +",");
        }
    }

//    public static int[] multiplyArray(int[] array1, int[] array2) {
//        int finalMultiplyRslt = 0;
//        int mulitplyer = 1;
//
//        int temp;
//        // first step is to multiply last digit number
//        for (int i = array2.length - 1; i >= 0; i--) {
//            if(i==array2.length-1) {
//                temp = multiplyArray(array1, array2[i]);
//                finalMultiplyRslt += temp;
//            } else {
//                temp = multiplyArray(array1, array2[i] * mulitplyer);
//                finalMultiplyRslt += temp;
//            }
//            mulitplyer*=10;
//        }
//
//        return numberToArray(finalMultiplyRslt);
//    }

    public static BigInteger[] multiplyArray(int[] array1, int[] array2) {
        BigInteger finalMultiplyRslt = BigInteger.ZERO;
        int multiplier = 1;

        BigInteger temp;
        for (int i = array2.length - 1; i >= 0; i--) {
            if(i==array2.length-1) {
                temp = multiplyArray(array1, array2[i]);
                finalMultiplyRslt.add(temp);
            } else {
                temp = multiplyArray(array1, array2[i] * multiplier);
                finalMultiplyRslt.add(temp);
            }
            multiplier*=10;
        }

        return numberToArray(finalMultiplyRslt);
    }


    public static BigInteger multiplyArray(int[] array1, int multiplier) {
        BigInteger number = arrayToNumber(array1);
        BigInteger result = number.multiply(BigInteger.valueOf(multiplier));
        return result;
    }

    public static BigInteger arrayToNumber(int[] array) {
        String number = "";
        for (int i = 0; i < array.length; i++) {
            number += array[i];
        }
        return BigInteger.valueOf(Long.parseLong(number));
    }

    public static BigInteger[] numberToArray(BigInteger finalMultiplyRslt){
        String stringFinalArr = String.valueOf(finalMultiplyRslt);
        BigInteger []array = new BigInteger[stringFinalArr.length()];
        for (int i = 0; i < stringFinalArr.length(); i++) {
            array[i] = BigInteger.valueOf(stringFinalArr.charAt(i));
        }
        return array;
    }
}
