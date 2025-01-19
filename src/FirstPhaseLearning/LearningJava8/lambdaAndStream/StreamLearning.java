package FirstPhaseLearning.LearningJava8.lambdaAndStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-06-23,Jun,2023
 * in Project: DataStructuresJavaCode
 */
public class StreamLearning {
    public static void main(String[] args) {
        Employee[] arrayOfEmps = {
                new Employee(1, "Jeff Bezos", 1000),
                new Employee(2, "Bill Gates", 20000),
                new Employee(3, "Mark Zuckerberg", 3000)
        };

        Stream.of(arrayOfEmps);
        Stream<Integer> streamOfInteger=Stream.of(1,2,3,4,5,6,7);
        streamOfInteger.forEach(num-> System.out.print(num+" "));

        //Converting Stream to List
        System.out.println("Printing list of Integer from Stream:");
        List<Integer> numList=streamOfInteger.collect(Collectors.toList());
        for (int val:
             numList) {
            System.out.print(val+" ");
        }

        System.out.println("FirstPhaseLearning.Arrays:");







    }
}
