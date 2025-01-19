package FirstPhaseLearning.Searching;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-03-13,Mar,2023
 * in Project: DataStructuresJavaCode
 * -------------------------------------------------------------
 * Books Left
 *
 * Bob has recently got his new collection of novels. He arranges all the books on a shelf. Because of his crazy rules, he only reads a book from one of the ends of the shelf. Thus, each book Bob reads is either leftmost or rightmost book from the shelf. Bob cannot read a book if it has more than K� chapters, again a crazy rule. When Bob has read a book, he removes it from the shelf. Bob stops when he is unable to read any book from any end of the shelf. How many books are still present on the shelf?
 *
 ***Input
 * The first line contains two space-separated integers N� and K�, the number of books and the maximum number of chapters Bob can read. The second line contains N� space-separated integers denoting the number of chapters in the ith��ℎ book.
 *
 ***Output
 * Print number of books left on the shelf.
 *
 * -------------------------------------------------------------------------
 * Input
 * 6 6 1 3 1 10 2 9
 * Output
 * 3
 * Sample test case explanation
 * Bob cannot read a book with more than 66 chapters. He will read the first 33 books and the last 33 will be left, as he can choose only the first or last each time, 99 will never be chosen.
 * -------------------------------------------------------------------------
 */
public class booksLeft {
    public static void main(String args[]) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int numOfBooks = scanner.nextInt();
        int maxLimitReadPages = scanner.nextInt();
        int[] books = new int[numOfBooks];
        for (int i = 0; i < numOfBooks; i++) {
            books[i] = scanner.nextInt();
        }
        System.out.println(findBooksLeftShelf(numOfBooks, books, maxLimitReadPages));
    }

    private static int findBooksLeftShelf(int numOfBooks, int[] books, int maxLimitReadPages) {
        int booksRead = 0;

        if (books[0] < maxLimitReadPages) {
            for (int i = 0; i < numOfBooks; i++) {
                if (books[i]>=maxLimitReadPages) {
                    return numOfBooks- booksRead;
                } else {
                    booksRead++;
                }
            }
        } else if(books[numOfBooks-1] < maxLimitReadPages){
            for (int i=  numOfBooks - 1; i >= 0; i--) {
                {
                    if (books[i] >= maxLimitReadPages) {
                        return numOfBooks- booksRead;
                    } else {
                        booksRead++;
                    }
                }
            }
        }
        return booksRead;
    }

    private static int findBooksLeftShelf2(int numOfBooks, int[] books, int maxLimitReadPages) {
        int booksRead = 0;

            for (int i=  numOfBooks - 1; i >= 0; i--) {
                {
                    if (books[i] >= maxLimitReadPages) {
                        return numOfBooks- booksRead;
                    } else {
                        booksRead++;
                    }
                }
            }
        return booksRead;
    }
}
