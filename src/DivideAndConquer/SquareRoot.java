package DivideAndConquer;

import java.util.Scanner;

public class SquareRoot {

    public static int findSquareRoot(int number){
        if (number== 0) {
            return 0;
        }
        if (number==1){
            return 1;
        }
        int index=1;
        while(index<number/2){
            if(index * index == number){
                return index;

            }else{
                index++;
            }
        }
        return 0;
    }

    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int numberFindSquareRoot = sc.nextInt();
    }
}
