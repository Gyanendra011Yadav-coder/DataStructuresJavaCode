package elementsprogramminginterviews.BitwiseProblems;

public class MultiplyWithoutArithmatic {

    public static void main(String[] args) {
        System.out.println("Sum of two integers is:" + multiply(3,4));
    }

    public static int  multiply(int x, int y) {
        int result = 0;
        while (y != 0) {
            if ((y & 1) !=0){
                result=bitwiseAddition(result, y);
            }
            x <<= 1;
            y >>= 1;
        }
        return result;
    }

    public static int bitwiseAddition(int num1, int num2) {
        while (num2 != 0) {
            int carry = num1 & num2;
            num1 = num1 ^ num2;
            num2 = carry << 1;
        }
        return num1;
    }

}
