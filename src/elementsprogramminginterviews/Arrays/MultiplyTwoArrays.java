package elementsprogramminginterviews.Arrays;

import java.math.BigInteger;
import java.util.Arrays;

// [1,2] & [3,4] return [4,0,8]
public class MultiplyTwoArrays {
    public static void main(String[] args) {
        int[] array1 = {1,2,3};
        int[] array2 = {9,8,7};
        BigInteger [] resultArr = multiplyArray(array1, array2);
        for (BigInteger num : resultArr){
            System.out.print(num +",");
        }
    }

    public static BigInteger[] multiplyArray(int[] array1, int[] array2) {
        BigInteger finalMultiplyRslt = BigInteger.ZERO;
        int multiplier = 1;

        BigInteger temp;
        for (int i = array2.length - 1; i >= 0; i--) {
            if (i == array2.length - 1) {
                temp = multiplyArray(array1, array2[i]);
                finalMultiplyRslt = finalMultiplyRslt.add(temp);
            } else {
                temp = multiplyArray(array1, array2[i] * multiplier);
                finalMultiplyRslt = finalMultiplyRslt.add(temp);
            }
            multiplier *= 10;
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
            char value = stringFinalArr.charAt(i);
            String stringVal = String.valueOf(value);
            array[i] = BigInteger.valueOf(Long.parseLong(stringVal));
        }
        return array;
    }
}
