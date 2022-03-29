package Arrays;

import java.util.HashMap;

public class frequenciesOfLimitedRangeArrayElements {

    public static void frequencyCount(int arr[], int N, int P)
    {
        HashMap <Integer,Integer> map= new HashMap<>();
        int []temp= new int[N];
        for(int i=0;i<N;i++){
            if(map.containsKey(arr[i])){
                int count=map.get(arr[i])+1;
                map.put(arr[i],count);
            }else{
                map.put(arr[i],1);
            }
        }
        for(int j=0;j<N;j++){
            if(arr[j]<=N){
                temp[arr[j]-1]=map.get(arr[j]);
            }
        }
        for(int k=0;k<N;k++){
            arr[k]=temp[k];
        }
    }


}

