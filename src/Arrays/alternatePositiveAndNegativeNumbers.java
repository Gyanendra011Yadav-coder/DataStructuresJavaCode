package Arrays;

import java.util.ArrayList;

public class alternatePositiveAndNegativeNumbers {
    void rearrange(int arr[], int n) {
        // code here
        ArrayList<Integer> positive=new ArrayList<>();
        ArrayList<Integer> negative=new ArrayList<>();
        for(int num:arr){
            if(num<0){
                negative.add(num);
            }else{
                positive.add(num);
            }
        }
        //pointers will be taking care of removing element from positive , negative in arr
        int positivePointer=0, negativePointer=0, ansFillPointer=0;
            arr[ansFillPointer]=positive.get(positivePointer);
            ansFillPointer++;
            positivePointer++;        while(positivePointer<positive.size() && negativePointer<negative.size()){

                //adding negative
            arr[ansFillPointer]=positive.get(negativePointer);
            ansFillPointer++;
            negativePointer++;
        }
        //if element even left
        while(positivePointer<positive.size()){
            arr[ansFillPointer]=positive.get(positivePointer);
            ansFillPointer++;
            positivePointer++;
        }
        while(negativePointer<positive.size()){
            arr[ansFillPointer]=positive.get(negativePointer);
            ansFillPointer++;
            negativePointer++;
        }
    }

}
