package FirstPhaseLearning.TestOLTQuestions;

import java.util.Scanner;

/**
 * @author lenovo
 * @created 16/12/2021- 9:49 PM
 * @project DataStructuresJavaCode
 */
public class Main {

    public static void swap(int arr[], int i, int j){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

    public static int partition(int arr[], int lb, int ub){
        int pivot = arr[ub];
        int i = (lb - 1);
        for(int j = lb; j <= ub - 1; j++)
        {
            if (arr[j] < pivot)
            {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr,i + 1, ub);
        return (i + 1);
    }

        /*
        int pivot=arr[ub];
        int i=(lb-1);


        for(int j=lb; j<ub-1; j++){
            if(arr[j]<pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap( arr, i+1, ub);
        return (i+1);

    }
    */

    static void quickSort(int arr[], int lb, int ub){
        if(lb<=ub){
            int pi = partition(arr, lb, ub);
            quickSort(arr, lb,  pi-1);
            quickSort(arr, pi+1, ub);
        }
    }
    static void printArray(int a[])
    {

        for(int i=0; i<a.length ; i++){
            System.out.print(a[i]+" ");
            System.out.println();
        }

    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements of array");

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The elements of array are ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
            System.out.println();
        }

        quickSort(arr, 0, arr.length-1);
        System.out.println("The elements of array after sorting are ");
        printArray(arr);




    }
}
