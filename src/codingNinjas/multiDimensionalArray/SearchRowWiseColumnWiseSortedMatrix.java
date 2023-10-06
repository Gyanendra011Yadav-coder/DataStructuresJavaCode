package codingNinjas.multiDimensionalArray;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-10-06,Oct,2023
 * in Project: DataStructuresJavaCode
 */
public class SearchRowWiseColumnWiseSortedMatrix {
    static class Pair{
        int x; int y;

        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }

    }
    public static void main(String[] args) {
//        int [][] arr={{1,2,5},{3,4,9},{6,7,10}};
        int [][] arr2={{4,5},{8,6}};
        Pair result=search(arr2,5);

        System.out.println(result.x + " && " + result.y);
    }

    public static Pair search(int [][] sortedMatrix, int valFind) {
        // Write your code here.
        Pair pair=null;

        for (int rowIndex = 0; rowIndex < sortedMatrix[0].length ; rowIndex++) {

            // Handling case, If Starting index value is greater than the searchingValue
            if(sortedMatrix[rowIndex][0]>valFind){
                break;
            }
            for (int colmIndex = 0; colmIndex < sortedMatrix.length; colmIndex++) {
                if(sortedMatrix[rowIndex][colmIndex]==valFind){
                    pair = new Pair(rowIndex, colmIndex);
                    break;
                } else if(sortedMatrix[rowIndex][colmIndex]>valFind){
                    break;
                }
            }
            // Handling this case, because if index foudn then non need to itereate more indexes
            if(pair!=null){
                break;
            }
        }

        // Condition when searching value not found
        if(pair==null){
            pair = new Pair(-1,-1);
        }

        return pair;
    }

}
