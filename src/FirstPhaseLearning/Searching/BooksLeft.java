package FirstPhaseLearning.Searching;

public class BooksLeft {
    public static void main(String[] args) {
        int[] booksPage = {1 ,14 ,6, 13, 7, 2, 11, 4};
        System.out.println(bookLeftCount(booksPage.length, booksPage, 9));
//        Scanner scanner = new Scanner(System.in);
//        int totalBooks = scanner.nextInt();
//        int maxPageCanRead = scanner.nextInt();
//        int []totalBookPage=new int[totalBooks];
//        for (int i = 0; i < totalBooks ; i++) {
//            totalBookPage[i] = scanner.nextInt();
//        }
//
//        System.out.println(bookLeftCount(totalBooks, totalBookPage, maxPageCanRead));
    }

    public static int bookLeftCount(int totalBooks, int []booksPage, int canRead){

        int bookReadCount = 0;
        // if traverse from starting
        for (int i = 0; i < totalBooks; i++) {
            if(booksPage[i]<=canRead){
                bookReadCount++;
            } else {
                bookReadCount = traverseBookDesk(totalBooks, booksPage, totalBooks-1, i, bookReadCount, canRead);
                break;
            }
        }


        return totalBooks-bookReadCount;
    }

    public static int traverseBookDesk(int totalBooks, int []booksPage, int startReading, int endReading, int bookReadCount, int pageCanRead){
        while (startReading > endReading) {
            if(booksPage[startReading]>pageCanRead){
                break;
            }
            bookReadCount++;
            startReading--;
        }

        return bookReadCount;
    }
}
