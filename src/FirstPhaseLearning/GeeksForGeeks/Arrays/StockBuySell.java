package FirstPhaseLearning.GeeksForGeeks.Arrays;

import java.util.ArrayList;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-05-22,May,2023
 * in Project: DataStructuresJavaCode
 *
 *
 *https://practice.geeksforgeeks.org/problems/stock-buy-and-sell-1587115621/1?page=1&difficulty[]=0&company[]=Microsoft&company[]=Google&category[]=FirstPhaseLearning.Arrays&sortBy=submissions
 */
public class StockBuySell {
    public static void main(String[] args) {
        int A[] = {100,180,260,310,40,535,695};
        System.out.println(stockBuySell(A, A.length));
    }

    static ArrayList<ArrayList<Integer>> stockBuySell(int stockPrices[], int days) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> pair = new ArrayList<>();
        boolean isBought = false; //This flag will be used to store status of Stock wheather bought or not

        for (int day = 0; day < days - 1; day++) {
            if (stockPrices[day] < stockPrices[day + 1] && !isBought) {
                pair.add(0, day);
                isBought = true;
            } else if (stockPrices[day] > stockPrices[day + 1] && isBought) {
                pair.add(1, day);
                result.add(pair); //adding in the overall result
                isBought = false;
                pair = new ArrayList<>(); //re-intializing the arrayList
            }
        }

        if (isBought) {
            pair.add(1, days - 1);
            result.add(pair);
        }
        return result;
    }


    ArrayList<ArrayList<Integer> > stockBuySell1(int prices[], int days) {
        boolean bought = false;
        ArrayList<ArrayList<Integer>> prediction = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> pair = new ArrayList<>();
        for(int day = 0 ; day < days - 1 ; day++) {
            if(prices[day] < prices[day + 1] && !bought) {
                bought = true;
                pair.add(0, day);
            } else if(prices[day] > prices[day + 1] && bought) {
                pair.add(1, day);
                prediction.add(pair);
                bought = false;
                pair = new ArrayList<>();
            }
        }
        if(bought) {
            pair.add(1, days - 1);
            prediction.add(pair);
        }
        return prediction;
    }
}
