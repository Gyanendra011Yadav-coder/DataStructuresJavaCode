package codingNinjas.Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-07-20,Jul,2023
 * in Project: DataStructuresJavaCode
 *
 * https://www.codingninjas.com/studio/guided-paths/data-structures-algorithms/content/118820/offering/1381864?leftPanelTab=0
 */
public class XORQuery {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> queries=createQueryToTest();
        ArrayList <Integer> result=xorQuery(queries);
        for(Integer val: result) {
            System.out.println(val+" ");
        }
    }

    public static ArrayList<Integer> xorQuery(ArrayList<ArrayList<Integer>> queries) {
        ArrayList<Integer> result=new ArrayList<>();

        for(ArrayList<Integer> query: queries) {
            int leftIndex=query.get(0);
            int rightIndex=query.get(1);
            if(leftIndex==1){
                result.add(rightIndex);
//                result.add(rightIndex);
            }else if(leftIndex==2){
                for (int i = 0; i < result.size(); i++) {
                    result.set(i,findXOR(result.get(i),rightIndex));
                }
            }else{
                break;
            }
        }
        return result;
    }

    public static int findXOR(int x, int y) {
        return x ^ y;
    }


    private static ArrayList<ArrayList<Integer>> createQueryToTest() {
        ArrayList<ArrayList<Integer>> queries = new ArrayList<>();

        // Create a query with start index 1 and end index 3.
//        ArrayList<Integer> query1 = new ArrayList<>();
//        query1.add(1);
//        query1.add(3);
//        queries.add(query1);
//
//// Create a query with start index 2 and end index 2.
//        ArrayList<Integer> query2 = new ArrayList<>();
//        query2.add(2);
//        query2.add(2);
//        queries.add(query2);
//
//// Create a query with start index 1 and end index 2.
//        ArrayList<Integer> query3 = new ArrayList<>();
//        query3.add(1);
//        query3.add(2);
//        queries.add(query3);
//
//// Create a query with start index 2 and end index 3.
//        ArrayList<Integer> query4 = new ArrayList<>();
//        query4.add(2);
//        query4.add(3);
//        queries.add(query4);
//
//// Create a query with start index 2 and end index 1.
//        ArrayList<Integer> query5 = new ArrayList<>();
//        query5.add(2);
//        query5.add(1);
//        queries.add(query5);

// Create a query with start index 1 and end index 4.
        ArrayList<Integer> query6 = new ArrayList<>();
        query6.add(1);
        query6.add(4);
        queries.add(query6);

// Create a query with start index 1 and end index 5.
        ArrayList<Integer> query7 = new ArrayList<>();
        query7.add(1);
        query7.add(5);
        queries.add(query7);

// Create a query with start index 2 and end index 1.
        ArrayList<Integer> query8 = new ArrayList<>();
        query8.add(2);
        query8.add(1);
        queries.add(query8);

        // Return the dummy data.
        return queries;
    }



}
