package elementsprogramminginterviews.BitwiseProblems;

public class BitReversal {

    // Method to reverse the bits of a 64-bit word
    public static long reverseBits(long n) {
        long result = 0;
        for (int i = 0; i < 64; i++) {
            // Shift result to the left to make room for the next bit
            result <<= 1;
            // Add the least significant bit of n to the result
            result |= (n & 1);
            // Shift n to the right to process the next bit
            n >>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        // Example 64-bit input (binary representation)
        long input = 0b1011L; // input: (1011, .......,10)

        // Reverse the bits
        long reversed = reverseBits(input);

        // Print the input and output in binary format
        System.out.println("Input:  " + Long.toBinaryString(input));
        System.out.println("Output: " + Long.toBinaryString(reversed));
    }
}

