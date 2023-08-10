package codingNinjas.BasicAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-05,Aug,2023
 * in Project: DataStructuresJavaCode
 */
public class FindTripletsWithSumZero {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(1);
        //43 88 47 8 13 49 19 -6 39 100 -89 29 55 -50 21 14 -71 -36 -97 -7
//        arrayList.add(43);
//        arrayList.add(88);
//        arrayList.add(47);
//        arrayList.add(8);
//        arrayList.add(13);
//        arrayList.add(49);
//        arrayList.add(19);
//        arrayList.add(-6);
//        arrayList.add(39);
//        arrayList.add(100);
//        arrayList.add(-89);
//        arrayList.add(29);
//        arrayList.add(55);
//        arrayList.add(-50);
//        arrayList.add(21);
//        arrayList.add(14);
//        arrayList.add(-71);
//        arrayList.add(-36);
//        arrayList.add(-97);
//        arrayList.add(-7);

//        ArrayList<ArrayList<Integer>> finalResult=findTriplets2(arrayList, arrayList.size(),4);
//        for(ArrayList arrayList1 : finalResult){
//            System.out.println("Printing araayList:");
//            for (int i=0;i<arrayList1.size();i++){
//                System.out.print(arrayList1.get(i)+" ");
//            }
//        }

        int [] arr={1 ,2 ,3 ,1 ,2 ,3};
//        ArrayList<Integer> list=findTriplets(arr,arr.length,12);
//        for(int val:list){
//            System.out.println(val+" ");
//        }

//        ArrayList<ArrayList<Integer>> finalResult=findTriplets2(arr,arr.length,6);
//        for(ArrayList arrayList1 : finalResult){
//            for (int i=0;i<arrayList1.size();i++){
//                System.out.print(arrayList1.get(i)+" ");
//            }
//            System.out.println();
//        }

    }
    public static ArrayList<ArrayList<Integer>> findTriplets(ArrayList<Integer> arr, int n) {
        ArrayList<ArrayList<Integer>> resultList=new ArrayList<>();

        // Trying brutt foce approach by using 3 pointers
        for (int index1 = 0; index1 < n; index1++) {
            for (int index2 = index1+1; index2 < n; index2++) {
                for (int index3 = index2+1; index3 < n; index3++) {
                    if(arr.get(index1)+arr.get(index2)+arr.get(index3)==0){
                        resultList.add(new ArrayList<>(Arrays.asList(arr.get(index1), arr.get(index2), arr.get(index3))));
                    }else {
                        continue;
                    }
                }
            }
        }

        return resultList;
    }

    public static ArrayList<Integer> findTriplets(int[] arr, int n) {
        ArrayList<Integer> currArr = new ArrayList<>();
        for (int index1 = 0; index1 < n; index1++) {
            for (int index2 = index1 + 1; index2 < n; index2++) {
                for (int index3 = index2 + 1; index3 < n; index3++) {
                    if ((arr[index1] + arr[index2] == arr[index3]) || (arr[index2] + arr[index3] == arr[index1]) || (arr[index3] + arr[index1] == arr[index2])) {
                        currArr.add(arr[index1]);
                        currArr.add(arr[index2]);
                        currArr.add(arr[index3]);

                        return currArr;
                    }
                }
            }
        }
        return currArr;
    }

    public static  ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int k) {
        ArrayList<ArrayList<Integer>> finalResult=new ArrayList<>();

        for (int index1 = 0; index1 < n; index1++) {
            for (int index2 = index1 + 1; index2 < n; index2++) {
                for (int index3 = index2 + 1; index3 < n; index3++) {
                    if ((arr[index1] + arr[index2] + arr[index3]==k)) {
                        ArrayList<Integer> currArr = new ArrayList<>();
                        currArr.add(arr[index1]);
                        currArr.add(arr[index2]);
                        currArr.add(arr[index3]);
                        finalResult.add(currArr);

                        return finalResult;
                    }
                }
            }
        }
        return finalResult;
    }

    public static ArrayList<ArrayList<Integer>> findTriplets2(ArrayList<Integer> arr, int lengthList) {
        ArrayList<ArrayList<Integer>> finalResult = new ArrayList<>();
        arr.sort(null);

        for (int index1 = 0; index1 < lengthList - 2; index1++) {
            int leftIndex = index1 + 1;
            int rightIndex = lengthList - 1;

            while (leftIndex < rightIndex) {
                int sum = arr.get(index1) + arr.get(leftIndex) + arr.get(rightIndex);
                if (sum == 0) {
                    finalResult.add(new ArrayList<>(Arrays.asList(arr.get(index1), arr.get(leftIndex), arr.get(rightIndex))));
                    leftIndex++;
                    rightIndex--;

                    while (leftIndex < rightIndex && arr.get(leftIndex).equals(arr.get(leftIndex - 1))) {
                        leftIndex++;
                    }
                    while (leftIndex < rightIndex && arr.get(rightIndex).equals(arr.get(rightIndex + 1))) {
                        rightIndex--;
                    }
                } else if (sum < 0) {
                    leftIndex++;
                } else {
                    rightIndex--;
                }
            }
            while (index1 + 1 < lengthList && arr.get(index1).equals(arr.get(index1 + 1))) {
                index1++;
            }
        }
        return finalResult;
    }

    public static List<List<Integer>> findTriplets(List<Integer> arr, int n, int K) {
        List<List<Integer>> ans = new ArrayList<>();
        arr.sort(null);

        for (int i = 0; i < n; i++) {
            int left = i + 1;
            int right = n - 1;
            int target = K - arr.get(i);

            while (left < right) {
                int sum = arr.get(left) + arr.get(right);

                if (sum > target) {
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    ans.add(Arrays.asList(arr.get(i), arr.get(left), arr.get(right)));
                    int x = arr.get(left);
                    int y = arr.get(right);

                    while (left < right && arr.get(left).equals(x)) {
                        left++;
                    }

                    while (left < right && arr.get(right).equals(y)) {
                        right--;
                    }
                }
            }

            while (i + 1 < n && arr.get(i).equals(arr.get(i + 1))) {
                i++;
            }
        }

        return ans;
    }
}
