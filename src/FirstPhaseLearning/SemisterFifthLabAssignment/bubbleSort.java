package FirstPhaseLearning.SemisterFifthLabAssignment;

/**
 * @author Gyanendra Yadav
 * @created 09/12/2021- 4:49 PM
 * @project DataStructuresJavaCode
 */
public class bubbleSort {

    public static void sort(int []arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

            public static void printArray(int []array){
                for (int i = 0; i < array.length ; i++) {
                    System.out.println(array[i]);
                }
            }

    private static void swap(int i, int j ) {
        int temp=i;
        i=j;
        j=temp;
    }
    public static void main(String[] args) {
        int []array={3,2,1,5,6,0};
        System.out.println("Name:" + "Gyanendra Yadav");
        System.out.println("Roll Number:" + "191500309(61)");
        sort(array);
       printArray(array);
    }
}
