package FirstPhaseLearning.LearningJava8.collector;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-08-18,Aug,2023
 * in Project: DataStructuresJavaCode
 */
public class collectorWithStream {
    public static void main(String[] args) {
        List<Integer> listInteger = Arrays.asList(1,2,3,4,5,6,6);
        System.out.println("Converting to list:");

        listInteger.stream().collect(Collectors.toList()).forEach(System.out::print);

        System.out.println();
        System.out.println("Creating set from list:");
        listInteger.stream().collect(Collectors.toSet()).forEach(System.out::print);

        System.out.println();
        System.out.println("Converting list to LInkedList:");
        listInteger.stream().collect(Collectors.toCollection(LinkedList::new)).forEach(val->System.out.print(val+" "));

        System.out.println();
        System.out.println("Counting the values in list:");


    }
}
