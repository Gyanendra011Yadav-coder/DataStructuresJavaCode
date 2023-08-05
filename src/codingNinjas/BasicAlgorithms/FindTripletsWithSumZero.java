package codingNinjas.BasicAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-05,Aug,2023
 * in Project: DataStructuresJavaCode
 */
public class FindTripletsWithSumZero {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
//        arrayList.add(-10);
//        arrayList.add(5);
//        arrayList.add(5);
//        arrayList.add(-5);
//        arrayList.add(2);
        //43 88 47 8 13 49 19 -6 39 100 -89 29 55 -50 21 14 -71 -36 -97 -7
        arrayList.add(43);
        arrayList.add(88);
        arrayList.add(47);
        arrayList.add(8);
        arrayList.add(13);
        arrayList.add(49);
        arrayList.add(19);
        arrayList.add(-6);
        arrayList.add(39);
        arrayList.add(100);
        arrayList.add(-89);
        arrayList.add(29);
        arrayList.add(55);
        arrayList.add(-50);
        arrayList.add(21);
        arrayList.add(14);
        arrayList.add(-71);
        arrayList.add(-36);
        arrayList.add(-97);
        arrayList.add(-7);

//Printing araayList:
//43 -36 -7 Printing araayList:
//13 -6 -7 Printing araayList:
//29 -50 21
        ArrayList<ArrayList<Integer>> finalResult=findTriplets2(arrayList, arrayList.size());
        for(ArrayList arrayList1 : finalResult){
            System.out.println("Printing araayList:");
            for (int i=0;i<arrayList1.size();i++){
                System.out.print(arrayList1.get(i)+" ");
            }
        }

    }
    public static ArrayList<ArrayList<Integer>> findTriplets(ArrayList<Integer> arr, int n) {
        ArrayList<ArrayList<Integer>> resultList=new ArrayList<>();

        // Trying brutt foce approach by using 3 pointers
        for (int index1 = 0; index1 < n; index1++) {
            for (int index2 = index1+1; index2 < n; index2++) {
                for (int index3 = index2+1; index3 < n; index3++) {
                    if(arr.get(index1)+arr.get(index2)+arr.get(index3)==0){
//                        ArrayList<Integer> currArr=new ArrayList<>();
//                        currArr.add(arr.get(index1));
//                        currArr.add(arr.get(index2));
//                        currArr.add(arr.get(index3));
                        resultList.add(new ArrayList<>(Arrays.asList(arr.get(index1), arr.get(index2), arr.get(index3))));
                    }else {
                        continue;
                    }
                }
            }
        }

        return resultList;
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
}
