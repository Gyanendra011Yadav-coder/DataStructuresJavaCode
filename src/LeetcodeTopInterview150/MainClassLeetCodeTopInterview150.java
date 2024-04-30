package LeetcodeTopInterview150;


public class MainClassLeetCodeTopInterview150 {
    public static void main(String[] args) {
        int[] arr1 = {5, 3, 2, 1, 4};
        int [] arr2 = {2,5,6};

        MergeSortedArray88 mergeSortedArray88Obj=new MergeSortedArray88();
        mergeSortedArray88Obj.merge(arr1, arr1.length, arr2, arr2.length);

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
