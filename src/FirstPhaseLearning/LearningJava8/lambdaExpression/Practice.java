package FirstPhaseLearning.LearningJava8.lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Created By:  Gyanendra_Yadav
 * on 2023-09-09,Sep,2023
 * in Project: DataStructuresJavaCode
 */
public class Practice {
    public static void main(String[] args) {

        //Write a lambda expression to print square of the number
        System.out.println();

        Function<Integer, Integer> function =(num)-> num*num;
        System.out.println(function.apply(10));

        //Create a list of strings and sort using lambda expression
        List<String> list = Arrays.asList("HI", "Gy", "MAn", "ANk");

        for (int i = 0; i < list.size(); i++) {

        }
    }



}
