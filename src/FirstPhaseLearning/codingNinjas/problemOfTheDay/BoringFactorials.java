package FirstPhaseLearning.codingNinjas.problemOfTheDay;

import java.math.BigInteger;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-22,Aug,2023
 * in Project: DataStructuresJavaCode
 */
public class BoringFactorials {

    public static void main(String[] args) {
        System.out.println(boringFactorials(23, 29));
    }
    public static int boringFactorials(int n, int p) {
        BigInteger factorial = calculateFactorial(BigInteger.valueOf(n));
        BigInteger mod = factorial.mod(BigInteger.valueOf(p));
        return mod.intValue();
    }

    public static BigInteger calculateFactorial(BigInteger num) {
        if (num.equals(BigInteger.ONE)) return BigInteger.ONE;
        return num.multiply(calculateFactorial(num.subtract(BigInteger.ONE)));
    }

}
