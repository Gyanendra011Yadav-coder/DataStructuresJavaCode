package DynamicProgramming;

import java.util.Scanner;

/**
 * @author lenovo
 * @created 21/01/2022- 10:59 PM
 * @project DataStructuresJavaCode
 */
public class valentineMagicCodingBlockQuestion {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int numberOfBoys=scannerObject.nextInt();
        int numberOfGirls=scannerObject.nextInt();
        int []arrayCandies= new int[numberOfGirls];
        int []arrayChoclates=new int[numberOfBoys];
        for (int i = 0; i <numberOfBoys ; i++) {
            arrayChoclates[i]= scannerObject.nextInt();
        }
        for (int i = 0; i <numberOfGirls ; i++) {
           arrayCandies[i]=scannerObject.nextInt();
        }
        System.out.println(valentineMagic(arrayChoclates,arrayCandies,0,0));
    }

    private static int valentineMagic(int []chocalate,int []candies,int i,int j){
        if (i==chocalate.length){
            return 0;
        }
        if(j==candies.length)
        {
            return 100000;
        }

        int answer1= Math.abs(chocalate[i]-candies[j]+valentineMagic(chocalate,candies,i+1,j+1));
        int answer2=valentineMagic(chocalate,candies, i, j+1);

        return Math.min(answer1,answer2);
    }
}
