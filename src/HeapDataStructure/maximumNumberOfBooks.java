package HeapDataStructure;

import java.io.IOException;

/***
 * ---------------------------------------------------------------
 * Maximum Books
 * Rahul is fond of books and has a list containing costs of
 * N
 *  books he wants to purchase but he has only
 * k
 *  amount of money available to purchase books. The task is to find the maximum number of books Rahul can buy with the amount
 * k
 * .
 *
 * Note - Use heap concepts to solve the problem.
 *
 * Input Format
 * The first line contains an integer
 * T
 *  denoting the number of test cases.
 * For each of the next
 * T
 *  lines
 * The first line contains an integer
 * N
 *  denoting the number of elements in the array and an integer
 * k
 * .
 * The second line contains
 * N
 *  space-separated integers.
 *
 * Output Format
 * For each test case print the maximum number of books that can be purchased.
 *
 * Constraints
 * 1
 * <=
 * T
 * <=
 * 10
 *
 * 1
 * <=
 * N
 * <=
 * 10
 * 5
 *
 * 1
 * <=
 * k
 * <=
 * 10
 * 7
 *
 * 1
 * <=
 * A
 * [
 * i
 * ]
 * <=
 * 10
 * 6
 *
 * Time Limit
 * 1
 *
 * Example
 * Sample Input
 * 2
 * 10 70
 * 55 85 10 77 35 30 100 28 59 60
 * 10 20
 * 53 31 61 21 99 30 73 38 10 59
 *
 * Sample Output
 * 3
 * 1
 *
 * ---------------------------------------------------------------
 */

public class maximumNumberOfBooks {
    public class Main {
        int []heap;
        int size;
        int maxSize;
        Main(int size){
            heap = new int[size];
            size=0;
            maxSize = size;
        }
        public static void main(String args[]) throws IOException {



        }
    }

}
