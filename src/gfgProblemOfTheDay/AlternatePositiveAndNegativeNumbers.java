package gfgProblemOfTheDay;

import java.util.ArrayList;

public class AlternatePositiveAndNegativeNumbers {
    static void rearrange(int arr[], int n) {
        // code here
        int i=0;
        ArrayList<Integer> positive=new ArrayList<>();
        ArrayList<Integer> negative=new ArrayList<>();
        ArrayList<Integer> combo=new ArrayList<>();
        for(int num : arr){
            if(num<0)
                negative.add(num);
            else
                positive.add(num);
        }
        int postivePointer=0;
        int negativePointer=0;
        while(postivePointer<positive.size() && negativePointer<negative.size()){

        }
    }

    public static void main(String []args){
        int Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2};
        rearrange(Arr, Arr.length);
    }
}
