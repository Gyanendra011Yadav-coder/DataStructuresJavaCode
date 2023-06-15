package GeeksForGeeks.Searching;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-03-15,Mar,2023
 * in Project: DataStructuresJavaCode
 */
public class SquareRootNumber {
    public static void main(String[] args) {
        System.out.println(floorSqrt(10));
    }

    static long floorSqrt(long x)
    {
        return (long) Math.floor( Math.sqrt(x));
    }
}
