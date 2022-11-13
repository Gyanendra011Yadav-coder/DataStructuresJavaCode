package Arrays;

/**
 * Created By:  Gyanendra_Yadav
 * on 2022-11-13,Nov,2022
 * in Project: DataStructuresJavaCode
 *
 * ****************************************************************
 * Input:
 * 3 4
 * 1 1 2 3
 * Output:
 * 2 3 4
 * Explanation:
 * Initially the array is {0, 0, 0}. After the
 * first 1, it becomes {1, 1, 1}. After the
 * second 1 it becomes {2, 2, 2}. After 2, it
 * becomes {2, 3, 3}. After 3 it becomes, {2, 3, 4}.
 * ****************************************************************
 *
 */
public class AddingOnes {
    public static void main(String[] args) {
        int []valuesFilledArray ={1,1, 2, 3};
        int []emptyArray=new int[(valuesFilledArray.length)-1];
        update(emptyArray,emptyArray.length,valuesFilledArray,valuesFilledArray.length);
    }

    //Method to write the program
    public static void update(int a[], int n, int updates[], int k)
    {
        // Your code goes here
        for (int i = 0; i <k ; i++) {
            a[updates[i]-1]++;
        }
        for (int i = 1; i <n ; i++) {
            a[i]+=a[i-1];
        }
        for(int ele: a) {
            System.out.print(ele+" ");
        }
    }
}
