package FirstPhaseLearning.Searching;

/**
 * https://www.codingninjas.com/studio/guided-paths/data-structures-algorithms/content/118820/offering/1381882
 */
public class SearchInsertPosition {
    public static void main(String[] args) {
        int []arr={3, 6, 12 };
        System.out.println(searchInsert(arr,7));
    }


    public static int searchInsert(int [] arr, int m){
        int len=arr.length;
        int low=0;
        int high=len-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<m){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return (arr[len-1]<m)? len:low;
    }
}
