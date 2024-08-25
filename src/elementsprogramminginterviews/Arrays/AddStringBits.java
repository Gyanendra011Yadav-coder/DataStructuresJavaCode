package elementsprogramminginterviews.Arrays;

public class AddStringBits {
    public static void main(String[] args) {
        String resultBits = sumOfBits("1101101", "1101101");
        System.out.println(resultBits+", Iinteger number is:");
        System.out.println( Integer.parseInt(resultBits));
    }

    public static String sumOfBits(String bitString1, String bitString2) {
        return Integer.toBinaryString(Integer.parseInt(bitString1,2)+Integer.parseInt(bitString2,2));
    }
}
